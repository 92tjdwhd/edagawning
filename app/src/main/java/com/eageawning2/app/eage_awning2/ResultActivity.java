package com.eageawning2.app.eage_awning2;

import android.Manifest;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;


public class ResultActivity extends AppCompatActivity {
    String mPath;
    Uri contentUri;
    Intent intent;
    LinearLayout mLayout;
    LinearLayout optionCase1, optionCase2, hddLayout, diKitLayout, alLayout, ledLayout, rgbLayout, informLayout, consLayout, matnLaoyut, convLayout, etc1Laoyut, etc2Laoyut, etc3Laoyut;
    TextView productName, productSize, basePrice, optionsName, hddPrice, diKitPrice, alPrice, ledPrice, rgbPrice, informPrice, consPrice, matnPirce, convPrice, etc1Name, etc1Price, etc2Name, etc2Price, etc3Name, etc3Price, totalPrice,toName;
    ScrollView scrollView;
    ImageView pdfimage,proimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        mLayout = new LinearLayout(this);
        mLayout = findViewById(R.id.screen);
        scrollView = new ScrollView(this);
        scrollView = findViewById(R.id.shotscreen);
        intent = getIntent();
        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        setUi();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.share_button, menu);
        getMenuInflater().inflate(R.menu.to_name_button, menu);
        return true;
    }


    @TargetApi(Build.VERSION_CODES.M)
    public void checkVerify(boolean check)
    {
        if (
                ContextCompat.checkSelfPermission(ResultActivity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED ||
                        ContextCompat.checkSelfPermission(ResultActivity.this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED
                )
        {
            // Should we show an explanation?
            if (shouldShowRequestPermissionRationale(Manifest.permission.WRITE_EXTERNAL_STORAGE))
            {
                // ...
            }
            requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE,
                            Manifest.permission.READ_EXTERNAL_STORAGE},
                    1);
        }
        else
        {
            if(check){
                ScreenShot();
                Log.d("Sdasd", mPath);
                Intent msg = new Intent(Intent.ACTION_SEND);
                contentUri = Uri.parse("file://" + mPath);
                msg.setType("image/*");
                msg.putExtra(Intent.EXTRA_STREAM, contentUri);
                startActivity(Intent.createChooser(msg, "공유"));
            }else
            ScreenShot();
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
            case R.id.toName_button:
                try {
                    Intent intent = new Intent(ResultActivity.this,popupActivity.class);
                    startActivityForResult(intent,1);
                }catch (Exception e){

                }
                break;
            case R.id.actionbar_button:
                try {
                    checkVerify(true);
                }catch (Exception e){

                }

                break;


        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            switch (requestCode) {
// MainActivity 에서 요청할 때 보낸 요청 코드 (3000)
                case 1:
                    assert data != null;
                    String result = "";
                    result = data.getStringExtra("result");
                    toName.setText(result);
                    break;
            }
        }
    }

    public void ScreenShot() {
        Date now = new Date();
        android.text.format.DateFormat.format("yyyy-MM-dd_hh:mm:ss", now);

        try {
            // image naming and path  to include sd card  appending name you choose for file
            File dir = new File(Environment.getExternalStorageDirectory() + "/" + Environment.DIRECTORY_PICTURES, "Eageawning");

            dir.mkdir();

            mPath = Environment.getExternalStorageDirectory().toString() + "/" + Environment.DIRECTORY_PICTURES + "/Eageawning/" + now + ".PNG";

            // create bitmap screen capture

            mLayout.setDrawingCacheEnabled(true);
            Bitmap bitmap =mLayout.getDrawingCache();
           // mLayout.setDrawingCacheEnabled(false);

            File imageFile = new File(mPath);

            FileOutputStream outputStream = new FileOutputStream(imageFile);
            int quality = 100;
            bitmap.compress(Bitmap.CompressFormat.PNG, quality, outputStream);
            outputStream.flush();
            outputStream.close();
            sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, Uri.parse("file://" + mPath)));
            //   openScreenshot(imageFile);
            Toast.makeText(getApplicationContext(), "저장 되었습니다.", Toast.LENGTH_SHORT).show();
        } catch (Throwable e) {
            // Several error may come out with file handling or OOM
            e.printStackTrace();
        }

    }

    public void setUi() {
        optionCase1 = findViewById(R.id.option_case1);
        optionCase2 = findViewById(R.id.option_case2);
        hddLayout = findViewById(R.id.hdd_layout);
        diKitLayout = findViewById(R.id.dimkit_layout);
        alLayout = findViewById(R.id.al_layout);
        ledLayout = findViewById(R.id.option_led_layout);
        rgbLayout = findViewById(R.id.option_rgb_layout);
        informLayout = findViewById(R.id.option_inform_layout);
        consLayout = findViewById(R.id.cons_layout);
        matnLaoyut = findViewById(R.id.matn_layout);
        convLayout = findViewById(R.id.conv_layout);
        etc1Laoyut = findViewById(R.id.etc1_layout);
        etc2Laoyut = findViewById(R.id.etc2_layout);
        etc3Laoyut = findViewById(R.id.etc3_layout);
        productName = findViewById(R.id.product_name);
        productSize = findViewById(R.id.product_size);
        basePrice = findViewById(R.id.base_price);
        optionsName = findViewById(R.id.options);
        hddPrice = findViewById(R.id.hdd_price);
        diKitPrice = findViewById(R.id.dimkit_price);
        alPrice = findViewById(R.id.al_price);
        ledPrice = findViewById(R.id.option_led);
        rgbPrice = findViewById(R.id.option_rgb);
        informPrice = findViewById(R.id.option_inform);
        consPrice = findViewById(R.id.cons_price);
        matnPirce = findViewById(R.id.matn_price);
        convPrice = findViewById(R.id.conv_price);
        etc1Price = findViewById(R.id.etc1_price);
        etc2Price = findViewById(R.id.etc2_price);
        etc3Price = findViewById(R.id.etc3_price);
        totalPrice = findViewById(R.id.total_price);
        proimage = findViewById(R.id.proImage);
        pdfimage = findViewById(R.id.pdfImage);
        toName = findViewById(R.id.toName);

        productName.setText("제품명 : "+intent.getStringExtra("productName"));
        productSize.setText("제품사이즈 : "+intent.getStringExtra("productSize"));
        basePrice.setText("기본형 : "+intent.getStringExtra("basePrice"));
        optionsName.setText("설치옵션 : "+intent.getStringExtra("options"));
        totalPrice.setText("합계 금액 : "+intent.getStringExtra("totalPrice"));
        int proWidth = Integer.parseInt(intent.getStringExtra("proWidth"));
        switch (intent.getStringExtra("productName")){
            case "Aerolux":
                pdfimage.setImageResource(R.drawable.aerolux_pdf);
                proimage.setImageResource(R.drawable.pro_aerolux);
                break;
            case "Axis":
                pdfimage.setImageResource(R.drawable.axis_pdf);
                proimage.setImageResource(R.drawable.pro_axis);
                break;
            case "Quattro":
                pdfimage.setImageResource(R.drawable.quattro_pdf);
                proimage.setImageResource(R.drawable.pro_quattro);
                break;
            case "Novo":
                if(proWidth <=450){
                    pdfimage.setImageResource(R.drawable.novo1);
                    proimage.setImageResource(R.drawable.novo_one);
                }else if(proWidth <= 900){
                    pdfimage.setImageResource(R.drawable.novo2);
                    proimage.setImageResource(R.drawable.novo_two);
                }else {
                    pdfimage.setImageResource(R.drawable.novo3);
                    proimage.setImageResource(R.drawable.novo_three);
                }
                break;
            case "Radian":
                if(proWidth <=450){
                    pdfimage.setImageResource(R.drawable.radian1);
                    proimage.setImageResource(R.drawable.radian_one);
                }else if(proWidth <= 900){
                    pdfimage.setImageResource(R.drawable.radian2);
                    proimage.setImageResource(R.drawable.radian_two);
                }else {
                    pdfimage.setImageResource(R.drawable.radian3);
                    proimage.setImageResource(R.drawable.radian_three);
                }
                break;
            case "Luna":
                if(proWidth <=400){
                    pdfimage.setImageResource(R.drawable.luna1);
                    proimage.setImageResource(R.drawable.luna_one);
                }else if(proWidth <= 800){
                    pdfimage.setImageResource(R.drawable.luna2);
                    proimage.setImageResource(R.drawable.luna_two);
                }else if(proWidth <= 1200){
                    pdfimage.setImageResource(R.drawable.luna3);
                    proimage.setImageResource(R.drawable.luna_three);
                }else {
                    pdfimage.setImageResource(R.drawable.luna4);
                    proimage.setImageResource(R.drawable.luna_four);
                }
                break;
            case "Cantilever Novo":
                if(proWidth <=450){
                    pdfimage.setImageResource(R.drawable.mn3);
                    proimage.setImageResource(R.drawable.mn3_one);
                }else if(proWidth <= 900){
                    pdfimage.setImageResource(R.drawable.mn3_2);
                    proimage.setImageResource(R.drawable.mn3_two);
                }else {
                    pdfimage.setImageResource(R.drawable.mn3_3);
                    proimage.setImageResource(R.drawable.mn3_three);
                }
                break;
            case "Cantilever Radian":
                if(proWidth <=450){
                    pdfimage.setImageResource(R.drawable.mn4_1);
                    proimage.setImageResource(R.drawable.mn4_one);
                }else if(proWidth <= 900){
                    pdfimage.setImageResource(R.drawable.mn4_2);
                    proimage.setImageResource(R.drawable.mn4_two);
                }else {
                    pdfimage.setImageResource(R.drawable.mn4_3);
                    proimage.setImageResource(R.drawable.mn4_three);
                }
                break;
            case "Plaza Novo":
                if(proWidth <=450){
                    pdfimage.setImageResource(R.drawable.tw22_1);
                    proimage.setImageResource(R.drawable.tw22_one);
                }else if(proWidth <= 900){
                    pdfimage.setImageResource(R.drawable.tw22_2);
                    proimage.setImageResource(R.drawable.tw22_two);
                }else {
                    pdfimage.setImageResource(R.drawable.tw22_3);
                    proimage.setImageResource(R.drawable.tw22_three);
                }
                break;
            case "Plaza Radian":
                if(proWidth <=450){
                    pdfimage.setImageResource(R.drawable.tw33_1);
                    proimage.setImageResource(R.drawable.tw33_one);
                }else if(proWidth <= 900){
                    pdfimage.setImageResource(R.drawable.tw33_2);
                    proimage.setImageResource(R.drawable.tw33_two);
                }else {
                    pdfimage.setImageResource(R.drawable.tw33_3);
                    proimage.setImageResource(R.drawable.tw33_three);
                }
                break;
            case "Vertex 150 Zip System":
                pdfimage.setImageResource(R.drawable.vertex_150);
                proimage.setImageResource(R.drawable.vertex_150p);
                break;
            case "Exxen":
                if(proWidth <= 4500){
                    pdfimage.setImageResource(R.drawable.exxen_1);
                    proimage.setImageResource(R.drawable.exxen_one);
                }else {
                    pdfimage.setImageResource(R.drawable.exxen_2);
                    proimage.setImageResource(R.drawable.exxen_two);
                }
                break;
            case "Rota":
                pdfimage.setImageResource(R.drawable.rota_1);
                proimage.setImageResource(R.drawable.rota_one);
                break;
            case "Sapphire Two Panels":
                pdfimage.setImageResource(R.drawable.sap_2);
                proimage.setImageResource(R.drawable.sap_two);
                break;
            case "Sapphire Three Panels":
                pdfimage.setImageResource(R.drawable.sap_3);
                proimage.setImageResource(R.drawable.sap_three);
                break;
            case "Sliding Glass 3rails 2panels":
                pdfimage.setImageResource(R.drawable.sl_3_2);
                proimage.setImageResource(R.drawable.sl_three_two);
                break;
            case "Sliding Glass 3rails 3panels":
                pdfimage.setImageResource(R.drawable.sl_3_3);
                proimage.setImageResource(R.drawable.sl_three_three);
                break;
            case "Sliding Glass 5rails 4panels":
                pdfimage.setImageResource(R.drawable.sl_5_4);
                proimage.setImageResource(R.drawable.sl_five_four);
                break;
            case "Sliding Glass 5rails 5panels":
                pdfimage.setImageResource(R.drawable.sl_5_5);
                proimage.setImageResource(R.drawable.sl_five_five);
                break;

        }

        if(!intent.getStringExtra("price0").equals("0")){
            consLayout.setVisibility(View.VISIBLE);
            consPrice.setText("시공비 : ￦"+intent.getStringExtra("price0"));
        }else {
            consLayout.setVisibility(View.GONE);
        }
        if(!intent.getStringExtra("price1").equals("0")){
            matnLaoyut.setVisibility(View.VISIBLE);
            matnPirce.setText("장비비 : ￦"+intent.getStringExtra("price1"));
        }else {
            matnLaoyut.setVisibility(View.GONE);
        }
        if(!intent.getStringExtra("price2").equals("0")){
            convLayout.setVisibility(View.VISIBLE);
            convPrice.setText("운반비 : ￦"+intent.getStringExtra("price2"));
        }else {
            convLayout.setVisibility(View.GONE);
        }
        if(!intent.getStringExtra("price3").equals("0")){
            etc1Laoyut.setVisibility(View.VISIBLE);
            etc1Price.setText(intent.getStringExtra("category3")+" : ￦"+intent.getStringExtra("price3"));
        }else {
            etc1Laoyut.setVisibility(View.GONE);
        }
        if(!intent.getStringExtra("price4").equals("0")){
            etc2Laoyut.setVisibility(View.VISIBLE);
            etc2Price.setText(intent.getStringExtra("category4")+" : ￦"+intent.getStringExtra("price4"));

        }else {
            etc2Laoyut.setVisibility(View.GONE);
        }
        if(!intent.getStringExtra("price5").equals("0")){
            etc3Laoyut.setVisibility(View.VISIBLE);
            etc3Price.setText(intent.getStringExtra("category5")+" : ￦"+intent.getStringExtra("price5"));

        }else {
            etc3Laoyut.setVisibility(View.GONE);
        }
        if(intent.getStringExtra("optionsCase").equals("0")){
            optionCase1.setVisibility(View.VISIBLE);
            optionCase2.setVisibility(View.GONE);
            if(!intent.getStringExtra("led").equals("0")){
                ledLayout.setVisibility(View.VISIBLE);
                ledPrice.setText("Led Stripe Dimmer Lighting : ￦"+intent.getStringExtra("led"));
            }else {
                ledLayout.setVisibility(View.GONE);
            }
            if(!intent.getStringExtra("rgb").equals("0")){
                rgbLayout.setVisibility(View.VISIBLE);
                rgbPrice.setText("RGB Led-Hidden Stripe Lighting : ￦"+intent.getStringExtra("rgb"));
            }else {
                rgbLayout.setVisibility(View.GONE);
            }
            if(!intent.getStringExtra("ifoam").equals("0")){
                informLayout.setVisibility(View.VISIBLE);
                if(intent.getStringExtra("productName").equals("Quattro")){
                    informPrice.setText("Linear Fabric Dimmer Led Lighting: ￦"+intent.getStringExtra("ifoam"));
                }else
                informPrice.setText("Insulation Foam : ￦"+intent.getStringExtra("ifoam"));
            }else {
                informLayout.setVisibility(View.GONE);
            }
        }else {
            optionCase2.setVisibility(View.VISIBLE);
            optionCase1.setVisibility(View.GONE);
            if(!intent.getStringExtra("hdd").equals("0")){
                hddLayout.setVisibility(View.VISIBLE);
                hddPrice.setText("HDD : ￦"+intent.getStringExtra("hdd"));
            }else {
                hddLayout.setVisibility(View.GONE);
            }
            if(!intent.getStringExtra("dk").equals("0")){
                diKitLayout.setVisibility(View.VISIBLE);
                diKitPrice.setText("Dimmer Kit : ￦"+intent.getStringExtra("dk"));
            }else {
                diKitLayout.setVisibility(View.GONE);
            }
            if(!intent.getStringExtra("al").equals("0")){
                alLayout.setVisibility(View.VISIBLE);
                alPrice.setText("Aerofoil Louvre : ￦"+intent.getStringExtra("al"));
            }else {
                alLayout.setVisibility(View.GONE);
            }


        }

    }


}
