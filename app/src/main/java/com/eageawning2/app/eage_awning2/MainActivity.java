package com.eageawning2.app.eage_awning2;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;


import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;
import com.skydoves.powermenu.MenuAnimation;
import com.skydoves.powermenu.OnMenuItemClickListener;
import com.skydoves.powermenu.PowerMenu;
import com.skydoves.powermenu.PowerMenuItem;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    DBHelper dbHelper;
    SQLiteDatabase db;
    Button mNameButton, mWidthButton, mProjectionButton;
    static Button mPriceSumButton;
    PowerMenu mNamePowerMenu, mWidthPowerMenu, mProjectionPowerMenu;
    RecyclerView listView;
    LinearLayout optionType1, optionType2, mainView;
    RadioGroup option_case2_op1;
    RadioButton select_st, select_hdd, select_dk, select_al;
    CheckBox led_box, rgb_box, ifoam_box;
    Boolean firstChoice = false, widthChoice = false, projectionChoice = false;
    String opctionType;
    // static Double totalPrice = 0.0;
    FloatingActionButton resetButton, addButton;
    boolean option_case2_op1_check = false, select_dk_check, select_al_check;
    ArrayList<PowerMenuItem> proName;
    RecycleAdapter mMyAdapter;
    String basePrice = "0", hddPrice = "0", dkPrice = "0", rgbPrice = "0", ledPrice = "0", alPrice = "0", ifoamPrice = "0";
    TextView widthUnit, projectionUnit, proTextView;
    FinalPriceClass totalPrice = FinalPriceClass.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHelper = new DBHelper(this);
        db = dbHelper.getWritableDatabase();

        proTextView = findViewById(R.id.proTextView);
        widthUnit = findViewById(R.id.width_unit);
        projectionUnit = findViewById(R.id.projection_unit);
        mNameButton = findViewById(R.id.product_name_button);
        mProjectionButton = findViewById(R.id.projection_button);
        mWidthButton = findViewById(R.id.width_button);
        listView = findViewById(R.id.recyclerView);
        mainView = findViewById(R.id.main_view);
        optionType1 = findViewById(R.id.option_case1);
        optionType2 = findViewById(R.id.option_case2);
        mPriceSumButton = findViewById(R.id.price_sum_button);
        option_case2_op1 = findViewById(R.id.option_case2_op1);
        select_dk = findViewById(R.id.select_dk);
        select_al = findViewById(R.id.select_al);
        led_box = findViewById(R.id.box_led);
        rgb_box = findViewById(R.id.box_rgb);
        ifoam_box = findViewById(R.id.box_ifoam);
        resetButton = findViewById(R.id.menu_item);
        addButton = findViewById(R.id.menu_item2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);  // horizonta, vertical 옵션에 따라 가로/세로 list
        listView.setHasFixedSize(true);
        listView.setLayoutManager(layoutManager);
        //listView.addItemDecoration(new RecycleViewDecoration(10));
        option_case2_op1.getChildAt(1).setEnabled(false);
        mMyAdapter = new RecycleAdapter(getApplicationContext(), R.layout.recycle_view_list);
        mMyAdapter.addAll("시공비", 0);
        mMyAdapter.addAll("장비비", 0);
        mMyAdapter.addAll("운반비", 0);
        mMyAdapter.addAll("기타비1", 0);
        mMyAdapter.addAll("기타비2", 0);
        mMyAdapter.addAll("기타비3", 0);
        /* 리스트뷰에 어댑터 등록 */
        listView.setAdapter(mMyAdapter);

        setListener();


    }

    public void setOptionTypeChoice(int type) {
        if (type == 0) {
            optionType1.setVisibility(View.VISIBLE);
            optionType2.setVisibility(View.GONE);
        } else if (type == 2) {
            optionType1.setVisibility(View.GONE);
            optionType2.setVisibility(View.GONE);
        } else {
            optionType1.setVisibility(View.GONE);
            optionType2.setVisibility(View.VISIBLE);
            mainView.invalidate();
        }
    }

    public Double calculus(int price) {
        Double a = price * 1400 / 0.8;
        return a;
    }

    public void optionReset() {
        led_box.setChecked(false);
        rgb_box.setChecked(false);
        ifoam_box.setChecked(false);
        select_dk.setChecked(false);
        select_al.setChecked(false);
        option_case2_op1.check(R.id.select_st);
        basePrice = "0";
        hddPrice = "0";
        dkPrice = "0";
        rgbPrice = "0";
        ledPrice = "0";
        alPrice = "0";
        ifoamPrice = "0";
        mMyAdapter = new RecycleAdapter(getApplicationContext(), R.layout.recycle_view_list);
        mMyAdapter.addAll("시공비", 0);
        mMyAdapter.addAll("장비비", 0);
        mMyAdapter.addAll("운반비", 0);
        mMyAdapter.addAll("기타비1", 0);
        mMyAdapter.addAll("기타비2", 0);
        mMyAdapter.addAll("기타비3", 0);
        /* 리스트뷰에 어댑터 등록 */
        listView.setAdapter(mMyAdapter);
    }

    public void reset() {
        firstChoice = false;
        widthChoice = false;
        basePrice = "0";
        projectionChoice = false;
        led_box.setChecked(false);
        rgb_box.setChecked(false);
        ifoam_box.setChecked(false);
        select_dk.setChecked(false);
        select_al.setChecked(false);
        option_case2_op1.getChildAt(0).callOnClick();
        totalPrice.resetTotal();
        mPriceSumButton.setText("");
        mNameButton.setText("Click");
        mProjectionButton.setText("Click");
        mWidthButton.setText("Click");
        optionType2.setVisibility(View.GONE);
        optionType1.setVisibility(View.GONE);
        mPriceSumButton.setText("합계금액: \n견적확인");
        mMyAdapter = new RecycleAdapter(getApplicationContext(), R.layout.recycle_view_list);
        mMyAdapter.addAll("시공비", 0);
        mMyAdapter.addAll("장비비", 0);
        mMyAdapter.addAll("운반비", 0);
        mMyAdapter.addAll("기타비1", 0);
        mMyAdapter.addAll("기타비2", 0);
        mMyAdapter.addAll("기타비3", 0);
        /* 리스트뷰에 어댑터 등록 */
        listView.setAdapter(mMyAdapter);
    }

    public void setListener() {
        proName = new ArrayList<PowerMenuItem>();
        proName.add(new PowerMenuItem("Aerolux", false));
        proName.add(new PowerMenuItem("Exxen", false));
        proName.add(new PowerMenuItem("Axis", false));
        proName.add(new PowerMenuItem("Rota", false));
        proName.add(new PowerMenuItem("Quattro", false));
        proName.add(new PowerMenuItem("Novo", false));
        proName.add(new PowerMenuItem("Radian", false));
        proName.add(new PowerMenuItem("Luna", false));
        proName.add(new PowerMenuItem("Cantilever Novo", false));
        proName.add(new PowerMenuItem("Cantilever Radian", false));
        proName.add(new PowerMenuItem("Plaza Novo", false));
        proName.add(new PowerMenuItem("Plaza Radian", false));
        proName.add(new PowerMenuItem("Vertex 150 Zip System", false));
        proName.add(new PowerMenuItem("Sapphire Two Panels", false));
        proName.add(new PowerMenuItem("Sapphire Three Panels", false));
        proName.add(new PowerMenuItem("Sliding Glass 3rails 2panels", false));
        proName.add(new PowerMenuItem("Sliding Glass 3rails 3panels", false));
        proName.add(new PowerMenuItem("Sliding Glass 5rails 4panels", false));
        proName.add(new PowerMenuItem("Sliding Glass 5rails 5panels", false));
        mNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mNamePowerMenu = new PowerMenu.Builder(getApplicationContext())
                        .addItemList(proName)
                        .setAnimation(MenuAnimation.DROP_DOWN).setHeight(800).setWith(500).build();

                mNamePowerMenu.setOnMenuItemClickListener(new OnMenuItemClickListener<PowerMenuItem>() {
                    @Override
                    public void onItemClick(int position, PowerMenuItem item) {
                        String[][] projectionarray = dbHelper.getprojectionResult(item.title);
                        String[][] widtharray = dbHelper.getWidthResult(item.title);
                        String[][] option = dbHelper.getOptionResult(item.title);
                        opctionType = option[0][0];

                        ArrayList<PowerMenuItem> proWidth = new ArrayList<PowerMenuItem>();
                        ArrayList<PowerMenuItem> projection = new ArrayList<PowerMenuItem>();

                        for (int i = 0; i < widtharray.length; i++) {
                            if (widtharray[i][0] != null) {
                                proWidth.add(new PowerMenuItem(widtharray[i][0], false));
                                if (!opctionType.equals(String.valueOf(0)))
                                    widthUnit.setText("(단위: cm)");
                                else
                                    widthUnit.setText("(단위: mm)");
                            }
                        }

                        for (int i = 0; i < projectionarray.length; i++) {
                            if (projectionarray[i][0] != null) {
                                projection.add(new PowerMenuItem(projectionarray[i][0], false));
                                if (!opctionType.equals(String.valueOf(0)))
                                    projectionUnit.setText("(단위: cm)");
                                else
                                    projectionUnit.setText("(단위: mm)");
                            }
                        }

                        mWidthPowerMenu = new PowerMenu.Builder(getApplicationContext())
                                .addItemList(proWidth)
                                .setAnimation(MenuAnimation.SHOWUP_TOP_RIGHT).setHeight(800).setWith(500).build();
                        mProjectionPowerMenu = new PowerMenu.Builder(getApplicationContext())
                                .addItemList(projection)
                                .setAnimation(MenuAnimation.SHOWUP_TOP_RIGHT).setHeight(800).setWith(500).build();
                        if (item.title.equals("Cantilever Novo") || item.title.equals("Cantilever Radian")) {
                            select_al.setVisibility(View.INVISIBLE);
                        } else {
                            select_al.setVisibility(View.INVISIBLE);
                        }
                        if(item.title.equals("Vertex 150 Zip System") || item.title.equals("Sapphire Two Panels") ||item.title.equals("Sapphire Three Panels") || item.title.equals("Sliding Glass 3rails 2panels")|| item.title.equals("Sliding Glass 3rails 3panels") || item.title.equals("Sliding Glass 5rails 4panels")|| item.title.equals("Sliding Glass 5rails 5panels")){
                            proTextView.setText("제품사이즈 - 높이(Height)");
                        }else {
                            proTextView.setText("제품사이즈 - 돌출(Projection)");
                        }

                        mNameButton.setText(item.title);
                        mProjectionButton.setText("Click");
                        mWidthButton.setText("Click");
                        setOptionTypeChoice(Integer.parseInt(opctionType));
                        mNamePowerMenu.dismiss();
                        firstChoice = true;
                        basePrice = "0";
                        widthChoice = false;
                        projectionChoice = false;
                        led_box.setChecked(false);
                        rgb_box.setChecked(false);
                        ifoam_box.setChecked(false);
                        select_dk.setChecked(false);
                        select_al.setChecked(false);
                        option_case2_op1.check(R.id.select_st);
                        if (mNameButton.getText().toString().equals("Quattro")) {
                            ifoam_box.setText("Linear Fabric Dimmer Led Lighting");
                            ifoam_box.setVisibility(View.VISIBLE);
                        } else if (mNameButton.getText().toString().equals("Rota")) {
                            ifoam_box.setVisibility(View.INVISIBLE);
                        } else if (mNameButton.getText().toString().equals("Vertex 150 Zip System")) {
                            select_al.setVisibility(View.INVISIBLE);
                        } else {
                            ifoam_box.setText("Insulation Foam");
                            ifoam_box.setVisibility(View.VISIBLE);
                        }
                        option_case2_op1.getChildAt(1).setEnabled(false);
                        totalPrice.resetTotal();
                        mMyAdapter = new RecycleAdapter(getApplicationContext(), R.layout.recycle_view_list);
                        mMyAdapter.addAll("시공비", 0);
                        mMyAdapter.addAll("장비비", 0);
                        mMyAdapter.addAll("운반비", 0);
                        mMyAdapter.addAll("기타비1", 0);
                        mMyAdapter.addAll("기타비2", 0);
                        mMyAdapter.addAll("기타비3", 0);
                        /* 리스트뷰에 어댑터 등록 */
                        listView.setAdapter(mMyAdapter);
                        mPriceSumButton.setText(String.format("합계금액:￦%,d \n견적확인", totalPrice.getTotalPrice().intValue()));
                    }
                });
                mNamePowerMenu.showAsDropDown(view);
            }
        });

        mWidthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstChoice) {
                    if (projectionChoice) {
                        mWidthPowerMenu.setOnMenuItemClickListener(new OnMenuItemClickListener<PowerMenuItem>() {
                            @Override
                            public void onItemClick(int position, PowerMenuItem item) {
                                if (mNameButton.getText().equals("Exxen")) {
                                    if (Integer.parseInt(item.title) > 4500) {
                                        String[][] projectionarray = dbHelper.getprojectionResult((String) mNameButton.getText());
                                        ArrayList<PowerMenuItem> projection = new ArrayList<PowerMenuItem>();
                                        for (int i = 0; i < projectionarray.length; i++) {
                                            if (Integer.parseInt(projectionarray[i][0]) > 6040)
                                                continue;
                                            if (projectionarray[i][0] != null) {
                                                projection.add(new PowerMenuItem(projectionarray[i][0], false));
                                                if (!opctionType.equals(String.valueOf(0)))
                                                    projectionUnit.setText("(단위: cm)");
                                                else
                                                    projectionUnit.setText("(단위: mm)");
                                            }
                                        }
                                        mProjectionPowerMenu = new PowerMenu.Builder(getApplicationContext())
                                                .addItemList(projection)
                                                .setAnimation(MenuAnimation.SHOWUP_TOP_RIGHT).setHeight(800).setWith(500).build();
                                    } else {
                                        String[][] projectionarray = dbHelper.getprojectionResult((String) mNameButton.getText());
                                        ArrayList<PowerMenuItem> projection = new ArrayList<PowerMenuItem>();
                                        for (int i = 0; i < projectionarray.length; i++) {
                                            if (projectionarray[i][0] != null) {
                                                projection.add(new PowerMenuItem(projectionarray[i][0], false));
                                                if (!opctionType.equals(String.valueOf(0)))
                                                    projectionUnit.setText("(단위: cm)");
                                                else
                                                    projectionUnit.setText("(단위: mm)");
                                            }
                                        }
                                        mProjectionPowerMenu = new PowerMenu.Builder(getApplicationContext())
                                                .addItemList(projection)
                                                .setAnimation(MenuAnimation.SHOWUP_TOP_RIGHT).setHeight(800).setWith(500).build();
                                    }
                                    mWidthButton.setText(item.title);
                                    optionReset();
                                    totalPrice.resetTotal();
                                    mWidthPowerMenu.dismiss();
                                    widthChoice = true;
                                    BigDecimal bigDecimal = new BigDecimal(totalPrice.getTotalPrice());
                                    mProjectionButton.setText("Click");
                                    mPriceSumButton.setText(String.format("합계금액:￦%,d \n견적확인", Integer.parseInt(bigDecimal.toString())));
                                } else if (mNameButton.getText().equals("Sapphire Three Panels")) {
                                    if (Integer.parseInt(item.title) > 3000) {
                                        String[][] projectionarray = dbHelper.getprojectionResult((String) mNameButton.getText());
                                        ArrayList<PowerMenuItem> projection = new ArrayList<PowerMenuItem>();
                                        for (int i = 0; i < projectionarray.length; i++) {
                                            if (Integer.parseInt(projectionarray[i][0]) > 3000)
                                                continue;
                                            if (projectionarray[i][0] != null) {
                                                projection.add(new PowerMenuItem(projectionarray[i][0], false));
                                                if (!opctionType.equals(String.valueOf(0)))
                                                    projectionUnit.setText("(단위: cm)");
                                                else
                                                    projectionUnit.setText("(단위: mm)");
                                            }
                                        }
                                        mProjectionPowerMenu = new PowerMenu.Builder(getApplicationContext())
                                                .addItemList(projection)
                                                .setAnimation(MenuAnimation.SHOWUP_TOP_RIGHT).setHeight(800).setWith(500).build();
                                    } else {
                                        String[][] projectionarray = dbHelper.getprojectionResult((String) mNameButton.getText());
                                        ArrayList<PowerMenuItem> projection = new ArrayList<PowerMenuItem>();
                                        for (int i = 0; i < projectionarray.length; i++) {
                                            if (projectionarray[i][0] != null) {
                                                projection.add(new PowerMenuItem(projectionarray[i][0], false));
                                                if (!opctionType.equals(String.valueOf(0)))
                                                    projectionUnit.setText("(단위: cm)");
                                                else
                                                    projectionUnit.setText("(단위: mm)");
                                            }
                                        }
                                        mProjectionPowerMenu = new PowerMenu.Builder(getApplicationContext())
                                                .addItemList(projection)
                                                .setAnimation(MenuAnimation.SHOWUP_TOP_RIGHT).setHeight(800).setWith(500).build();
                                    }
                                    mWidthButton.setText(item.title);
                                    optionReset();
                                    totalPrice.resetTotal();
                                    mWidthPowerMenu.dismiss();
                                    widthChoice = true;
                                    BigDecimal bigDecimal = new BigDecimal(totalPrice.getTotalPrice());
                                    mProjectionButton.setText("Click");
                                    mPriceSumButton.setText(String.format("합계금액:￦%,d \n견적확인", Integer.parseInt(bigDecimal.toString())));
                                } else {
                                    mWidthButton.setText(item.title);
                                    String[][] Pricearray = dbHelper.getPriceResult(mNameButton.getText().toString(), item.title, mProjectionButton.getText().toString(), "standard");
                                    Log.d("result", String.valueOf(Pricearray[0][0]));
                                    optionReset();
                                    Log.d("ledPrice", ledPrice);
                                    totalPrice.resetTotal();
                                    totalPrice.addTotalPrice(calculus(Integer.parseInt(Pricearray[0][0])));
                                    //totalPrice = totalPrice - calculus(Integer.parseInt(basePrice)) + calculus(Integer.parseInt(Pricearray[0][0]));
                                    BigDecimal bigDecimal = new BigDecimal(totalPrice.getTotalPrice());
                                    basePrice = Pricearray[0][0];
                                    // ledPrice = "0";

                                    mPriceSumButton.setText(String.format("합계금액:￦%,d \n견적확인", Integer.parseInt(bigDecimal.toString())));
                                    mWidthPowerMenu.dismiss();
                                    widthChoice = true;
                                }

                            }
                        });
                    } else {

                        mWidthPowerMenu.setOnMenuItemClickListener(new OnMenuItemClickListener<PowerMenuItem>() {
                            @Override
                            public void onItemClick(int position, PowerMenuItem item) {
                                if (mNameButton.getText().equals("Exxen")) {
                                    if (Integer.parseInt(item.title) > 4500) {
                                        String[][] projectionarray = dbHelper.getprojectionResult((String) mNameButton.getText());
                                        ArrayList<PowerMenuItem> projection = new ArrayList<PowerMenuItem>();
                                        for (int i = 0; i < projectionarray.length; i++) {
                                            if (Integer.parseInt(projectionarray[i][0]) > 6040)
                                                continue;
                                            if (projectionarray[i][0] != null) {
                                                projection.add(new PowerMenuItem(projectionarray[i][0], false));
                                                if (!opctionType.equals(String.valueOf(0)))
                                                    projectionUnit.setText("(단위: cm)");
                                                else
                                                    projectionUnit.setText("(단위: mm)");
                                            }
                                        }
                                        mProjectionPowerMenu = new PowerMenu.Builder(getApplicationContext())
                                                .addItemList(projection)
                                                .setAnimation(MenuAnimation.SHOWUP_TOP_RIGHT).setHeight(800).setWith(500).build();
                                    }
                                }else if(mNameButton.getText().equals("Sapphire Three Panels")){
                                    if (Integer.parseInt(item.title) > 3000) {
                                        String[][] projectionarray = dbHelper.getprojectionResult((String) mNameButton.getText());
                                        ArrayList<PowerMenuItem> projection = new ArrayList<PowerMenuItem>();
                                        for (int i = 0; i < projectionarray.length; i++) {
                                            if (Integer.parseInt(projectionarray[i][0]) > 3000)
                                                continue;
                                            if (projectionarray[i][0] != null) {
                                                projection.add(new PowerMenuItem(projectionarray[i][0], false));
                                                if (!opctionType.equals(String.valueOf(0)))
                                                    projectionUnit.setText("(단위: cm)");
                                                else
                                                    projectionUnit.setText("(단위: mm)");
                                            }
                                        }
                                        mProjectionPowerMenu = new PowerMenu.Builder(getApplicationContext())
                                                .addItemList(projection)
                                                .setAnimation(MenuAnimation.SHOWUP_TOP_RIGHT).setHeight(800).setWith(500).build();
                                    }
                                }
                                mWidthButton.setText(item.title);
                                mWidthPowerMenu.dismiss();
                                widthChoice = true;
                            }
                        });
                    }
                    mWidthPowerMenu.showAsDropDown(v);
                } else {
                    Toast.makeText(getApplicationContext(), "제품명을 선택해주세요", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mProjectionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (firstChoice) {
                    if (widthChoice) {

                        mProjectionPowerMenu.setOnMenuItemClickListener(new OnMenuItemClickListener<PowerMenuItem>() {
                            @Override
                            public void onItemClick(int position, PowerMenuItem item) {
                                mProjectionButton.setText(item.title);
                                String[][] Pricearray = dbHelper.getPriceResult(mNameButton.getText().toString(), mWidthButton.getText().toString(), item.title, "standard");
                                Log.d("result", String.valueOf(Pricearray[0][0]));
                                optionReset();
                                totalPrice.resetTotal();
                                totalPrice.addTotalPrice(calculus(Integer.parseInt(Pricearray[0][0])));
                                //totalPrice = totalPrice - calculus(Integer.parseInt(basePrice)) + calculus(Integer.parseInt(Pricearray[0][0]));
                                BigDecimal bigDecimal = new BigDecimal(totalPrice.getTotalPrice());
                                basePrice = Pricearray[0][0];
                                Log.d("result", basePrice);
                                mPriceSumButton.setText(String.format("합계금액:￦%,d \n견적확인", new BigInteger(bigDecimal.toString())));
                                projectionChoice = true;
                                option_case2_op1.getChildAt(1).setEnabled(true);
                                mProjectionPowerMenu.dismiss();
                            }
                        });

                        mProjectionPowerMenu.showAsDropDown(v);
                    } else
                        Toast.makeText(getApplicationContext(), "Width 을 선택해주세요", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "제품명을 선택해주세요", Toast.LENGTH_SHORT).show();
                }
            }
        });

        option_case2_op1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (!mWidthButton.getText().equals("Click") && !mProjectionButton.getText().equals("Click")) {
                    String[][] Pricearray = dbHelper.getPriceResult(mNameButton.getText().toString(), mWidthButton.getText().toString(), mProjectionButton.getText().toString(), "standard");
                    String[][] hddarray = dbHelper.getPriceResult(mNameButton.getText().toString(), mWidthButton.getText().toString(), mProjectionButton.getText().toString(), "HDD");
                    switch (checkedId) {
                        case R.id.select_st:
                            totalPrice.changePrice(calculus(Integer.parseInt(Pricearray[0][0])), calculus(Integer.parseInt(hddarray[0][0])));
                            if (option_case2_op1_check) {
                                Log.d("result", String.valueOf(hddarray[0][0]));
                                hddPrice = "0";
//                                if(select_dk_check){
//                                    totalPrice.addTotalPrice(1100000.0);
//                                }else {
//                                    totalPrice.minusTotalPrice(1100000.0);
//                                }

                                BigDecimal bigDecimal = new BigDecimal(totalPrice.getTotalPrice());
                                mPriceSumButton.setText(String.format("합계금액:￦%,d \n견적확인", new BigInteger(bigDecimal.toString())));

                            }
                            break;
                        case R.id.select_hdd:
                            option_case2_op1_check = true;
                            Log.d("hdd", String.valueOf(hddarray[0][0]));
                            Log.d("price", String.valueOf(Pricearray[0][0]));
                            int intergerhdd = Integer.parseInt(hddarray[0][0]) - Integer.parseInt(basePrice);
                            totalPrice.changehdd(calculus(Integer.parseInt(Pricearray[0][0])), calculus(Integer.parseInt(hddarray[0][0])));

                            hddPrice = String.valueOf(intergerhdd);
//                            if(select_dk_check){
//                                totalPrice.addTotalPrice(1100000.0);
//                            }else{
//                                totalPrice.minusTotalPrice(1100000.0);
//                            }
                            BigDecimal bigDecimal = new BigDecimal(totalPrice.getTotalPrice());
                            Log.d("checkenable", String.valueOf(select_dk_check));
                            mPriceSumButton.setText(String.format("합계금액:￦%,d \n견적확인", new BigInteger(bigDecimal.toString())));
                            break;
                    }
                } else {

                    Toast.makeText(getApplicationContext(), "제품 사이즈를 선택하여주세요", Toast.LENGTH_SHORT).show();
                }
            }
        });
        select_al.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mWidthButton.getText().equals("Click") && !mProjectionButton.getText().equals("Click")) {
                    if (select_al_check) {
                        select_al_check = false;
                        select_al.setChecked(false);
                    } else {
                        select_al_check = true;
                        select_al.setChecked(true);
                    }
                } else {
                    select_al.setChecked(false);
                    Toast.makeText(getApplicationContext(), "제품 사이즈를 선택하여주세요", Toast.LENGTH_SHORT).show();
                }
            }
        });
        select_al.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!mWidthButton.getText().equals("Click") && !mProjectionButton.getText().equals("Click")) {
                    String[][] optionarray = dbHelper.getOptionPriceResult(mNameButton.getText().toString(), mWidthButton.getText().toString(), "Aerofoil Louvre");
                    if (isChecked) {
                        Log.d("result", String.valueOf(optionarray[0][0]));
                        alPrice = String.valueOf(optionarray[0][0]);
                        totalPrice.addTotalPrice(calculus(Integer.parseInt(optionarray[0][0])));
                        BigDecimal bigDecimal = new BigDecimal(totalPrice.getTotalPrice());
                        mPriceSumButton.setText(String.format("합계금액:￦%,d \n견적확인", new BigInteger(bigDecimal.toString())));
                    } else {
                        Log.d("result", String.valueOf(optionarray[0][0]));
                        alPrice = "0";
                        totalPrice.minusTotalPrice(calculus(Integer.parseInt(optionarray[0][0])));
                        BigDecimal bigDecimal = new BigDecimal(totalPrice.getTotalPrice());
                        mPriceSumButton.setText(String.format("합계금액:￦%,d \n견적확인", new BigInteger(bigDecimal.toString())));
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "제품 사이즈를 선택하여주세요", Toast.LENGTH_SHORT).show();
                }
            }
        });
        select_dk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (select_dk_check) {
                    select_dk_check = false;
                    select_dk.setChecked(false);
                } else {
                    select_dk_check = true;
                    select_dk.setChecked(true);
                }
            }
        });
        select_dk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice.addTotalPrice(1100000.0);
                    dkPrice = "1100000";
                    BigDecimal bigDecimal = new BigDecimal(totalPrice.getTotalPrice());
                    mPriceSumButton.setText(String.format("합계금액:￦%,d \n견적확인", new BigInteger(bigDecimal.toString())));
                } else {
                    totalPrice.minusTotalPrice(1100000.0);
                    dkPrice = "0";
                    BigDecimal bigDecimal = new BigDecimal(totalPrice.getTotalPrice());
                    mPriceSumButton.setText(String.format("합계금액:￦%,d \n견적확인", new BigInteger(bigDecimal.toString())));
                }
            }
        });

        led_box.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!mWidthButton.getText().equals("Click") && !mProjectionButton.getText().equals("Click")) {

                    String[][] optionarray = dbHelper.getPriceResult(mNameButton.getText().toString(), mWidthButton.getText().toString(), mProjectionButton.getText().toString(), "Led Stripe Dimmer Lighting");
                    if (isChecked) {
                        Log.d("result", String.valueOf(optionarray[0][0]));
                        ledPrice = String.valueOf(optionarray[0][0]);
                        totalPrice.addTotalPrice(calculus(Integer.parseInt(optionarray[0][0])));
                        BigDecimal bigDecimal = new BigDecimal(totalPrice.getTotalPrice());
                        mPriceSumButton.setText(String.format("합계금액:￦%,d \n견적확인", new BigInteger(bigDecimal.toString())));
                    } else {
                        Log.d("result false", String.valueOf(optionarray[0][0]));
                        ledPrice = "0";
                        totalPrice.minusTotalPrice(calculus(Integer.parseInt(optionarray[0][0])));
                        BigDecimal bigDecimal = new BigDecimal(totalPrice.getTotalPrice());
                        mPriceSumButton.setText(String.format("합계금액:￦%,d \n견적확인", new BigInteger(bigDecimal.toString())));
                    }
                } else {
                    led_box.setChecked(false);
                    Toast.makeText(getApplicationContext(), "제품 사이즈를 선택하여주세요", Toast.LENGTH_SHORT).show();
                }
            }
        });
        rgb_box.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!mWidthButton.getText().equals("Click") && !mProjectionButton.getText().equals("Click")) {

                    String[][] optionarray = dbHelper.getPriceResult(mNameButton.getText().toString(), mWidthButton.getText().toString(), mProjectionButton.getText().toString(), "RGB Led-Hidden Stripe Lightin");
                    if (isChecked) {
                        Log.d("result", String.valueOf(optionarray[0][0]));
                        rgbPrice = String.valueOf(optionarray[0][0]);
                        totalPrice.addTotalPrice(calculus(Integer.parseInt(optionarray[0][0])));
                        BigDecimal bigDecimal = new BigDecimal(totalPrice.getTotalPrice());
                        mPriceSumButton.setText(String.format("합계금액:￦%,d \n견적확인", new BigInteger(bigDecimal.toString())));
                    } else {
                        Log.d("result", String.valueOf(optionarray[0][0]));
                        rgbPrice = "0";
                        totalPrice.minusTotalPrice(calculus(Integer.parseInt(optionarray[0][0])));
                        BigDecimal bigDecimal = new BigDecimal(totalPrice.getTotalPrice());
                        mPriceSumButton.setText(String.format("합계금액:￦%,d \n견적확인", new BigInteger(bigDecimal.toString())));
                    }
                } else {
                    rgb_box.setChecked(false);
                    Toast.makeText(getApplicationContext(), "제품 사이즈를 선택하여주세요", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ifoam_box.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!mWidthButton.getText().equals("Click") && !mProjectionButton.getText().equals("Click")) {
                    String option = "";
                    if (mNameButton.getText().toString().equals("Quattro")) {
                        option = "Linear Fabric Dimmer Led Lighting";
                    } else {
                        option = "Insulation Foam";
                    }
                    String[][] optionarray = dbHelper.getPriceResult(mNameButton.getText().toString(), mWidthButton.getText().toString(), mProjectionButton.getText().toString(), option);
                    if (isChecked) {
                        Log.d("result", String.valueOf(optionarray[0][0]));
                        ifoamPrice = String.valueOf(optionarray[0][0]);
                        totalPrice.addTotalPrice(calculus(Integer.parseInt(optionarray[0][0])));
                        BigDecimal bigDecimal = new BigDecimal(totalPrice.getTotalPrice());
                        mPriceSumButton.setText(String.format("합계금액:￦%,d \n견적확인", new BigInteger(bigDecimal.toString())));
                    } else {
                        Log.d("result", String.valueOf(optionarray[0][0]));
                        ifoamPrice = "0";
                        totalPrice.minusTotalPrice(calculus(Integer.parseInt(optionarray[0][0])));
                        BigDecimal bigDecimal = new BigDecimal(totalPrice.getTotalPrice());
                        mPriceSumButton.setText(String.format("합계금액:￦%,d \n견적확인", new BigInteger(bigDecimal.toString())));
                    }
                } else {
                    ifoam_box.setChecked(false);
                    Toast.makeText(getApplicationContext(), "제품 사이즈를 선택하여주세요", Toast.LENGTH_SHORT).show();
                }
            }
        });
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMyAdapter.addAll("기타비" + (mMyAdapter.getItemCount() - 2), 0);

                //  mMyAdapter.notifyItemInserted(mMyAdapter.getItemCount());
                // mMyAdapter.notifyDataSetChanged();
                listView.scrollToPosition(mMyAdapter.getItemCount());
            }
        });
        mPriceSumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstChoice && widthChoice && projectionChoice) {
                    String[] category = mMyAdapter.getItemText();
                    String[] price = mMyAdapter.getItemPrice();
                    Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                    intent.putExtra("productName", mNameButton.getText().toString());
                    intent.putExtra("proWidth", mWidthButton.getText().toString());
                    intent.putExtra("productSize", mWidthButton.getText().toString() + " × " + mProjectionButton.getText().toString() + " " + widthUnit.getText().toString());
                    intent.putExtra("basePrice", String.format("￦%,d", calculus(Integer.parseInt(basePrice)).intValue()));
                    intent.putExtra("options", getOptions());
                    intent.putExtra("optionsCase", opctionType);
                    intent.putExtra("hdd", String.format("%,d", calculus(Integer.parseInt(hddPrice)).intValue()));
                    intent.putExtra("dk", String.format("%,d", Integer.parseInt(dkPrice)));
                    intent.putExtra("rgb", String.format("%,d", calculus(Integer.parseInt(rgbPrice)).intValue()));
                    intent.putExtra("led", String.format("%,d", calculus(Integer.parseInt(ledPrice)).intValue()));
                    intent.putExtra("ifoam", String.format("%,d", calculus(Integer.parseInt(ifoamPrice)).intValue()));
                    intent.putExtra("al", String.format("%,d", calculus(Integer.parseInt(alPrice)).intValue()));
                    for (int i = 0; category.length > i; i++) {
                        Log.d("result", category[i] + "/" + price[i]);
                        intent.putExtra("category" + i, category[i]);
                        BigInteger bigInteger = new BigInteger(price[i]);
                        intent.putExtra("price" + i, String.format("%,d", bigInteger.multiply(BigInteger.valueOf(10000))));
                    }
                    BigDecimal bigDecimal = new BigDecimal(totalPrice.getTotalPrice());
                    intent.putExtra("totalPrice", String.format("￦%,d", new BigInteger(bigDecimal.toString())));
                    //  intent.putExtra("coin_name", sSymbol);
                    startActivityForResult(intent, 0);
                } else {
                    Toast.makeText(getApplicationContext(), "제품을 선택하여주세요", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public String getOptions() {
        ArrayList<String> options = new ArrayList<String>();
        String result = "";
        if (opctionType.equals("0")) {
            if (led_box.isChecked())
                options.add("Led Stripe Dimmer Lighting");
            if (rgb_box.isChecked())
                options.add("RGB Led-Hidden Stripe Lighting");
            if (ifoam_box.isChecked()) {
                if (mNameButton.getText().toString().equals("Quattro")) {
                    options.add("Linear Fabric Dimmer Led Lighting");
                } else
                    options.add("Insulation Foam");
            }


            String[] array = new String[options.size()];
            options.toArray(array);
            for (String s : array) {
                if (result.equals("")) {
                    result = s;
                } else {
                    result = result + ", " + s;
                }
            }
            return result;
        } else if (opctionType.equals("1")) {
            if (option_case2_op1.getCheckedRadioButtonId() == R.id.select_hdd)
                options.add("HDD");
            if (select_dk.isChecked())
                options.add("Dimmer Kit");
            if (select_al.isChecked())
                options.add("Aerofoil Louvre");

            String[] array = new String[options.size()];
            options.toArray(array);
            for (String s : array) {
                if (result.equals("")) {
                    result = s;
                } else {
                    result = result + ", " + s;
                }
            }
            return result;
        } else
            return result;
    }
}
