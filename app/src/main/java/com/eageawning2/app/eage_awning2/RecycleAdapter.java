package com.eageawning2.app.eage_awning2;

import android.content.Context;
import android.graphics.PorterDuff;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;


public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {
    private final int resource;
    private Context context;
    private ArrayList<listitem> listItems = new ArrayList<>();
    RecycleAdapter.ViewHolder viewHolder;
    public String [] Catagory = {"시공비","정비비","운반비","기타비1","기타비2","기타비3"};
    public String [] price = {"0","0","0","0","0","0"};
    DecimalFormat df = new DecimalFormat("###,###.####");
    String result="";
    FinalPriceClass finalPriceClass = FinalPriceClass.getInstance();
    public RecycleAdapter(Context context, int resource) {
        this.resource = resource;
        this.context = context;

    }

    @NonNull
    @Override
    public RecycleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycle_view_list, parent, false);
        viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final RecycleAdapter.ViewHolder holder, final int position) {

        final listitem myItem = (listitem) getItem(position);
        //holder.imageView.setImageResource(myItem.getIcon());
        //holder.coinNameText.setTextColor(myItem.getResources());

        holder.editText_category.setText(myItem.getCatagory());
        holder.editText_category.getBackground().mutate().setColorFilter(context.getResources().getColor(R.color.colorAccent), PorterDuff.Mode.SRC_ATOP);
        if (position >= 3) {

                Catagory[position] = listItems.get(position).getCatagory();

            holder.editText_category.setFocusableInTouchMode(true);
        }
        holder.removeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.editText_price.setText("");
                /*
                synchronized (this) {
                    if (!holder.editText_price.getText().toString().equals("")) {
                        finalPriceClass = finalPriceClass - Double.parseDouble(holder.editText_price.getText().toString());
                        BigDecimal bigDecimal = new BigDecimal(finalPriceClass);
                        holder.editText_price.setText("");
                        MainActivity.mPriceSumButton.setText(String.format("합계금액:￦%,d \n견적확인", Integer.parseInt(bigDecimal.toString())));

                    }

                    //   listItems.remove(position);
                    // notifyItemRemoved(position);

                    // notifyItemRangeChanged(position,position-1);
                }
*/
                // notifyDataSetChanged();

            }
        });
        holder.editText_category.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Catagory[position]=s.toString();
            }
        });
        holder.editText_price.addTextChangedListener(new TextWatcher() {
            String addprice = "0";

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d("값", s.toString());
                if (s.toString().equals("")) {
                    Log.d("값", finalPriceClass.getTotalPrice().toString());
                    Log.d("값", addprice.toString());
                    if(addprice.toString().equals("")) {
                        addprice="0";
                        price[position]="0";
                        finalPriceClass.minusTotalPrice((Double.parseDouble(addprice)*10000));
                        BigDecimal bigDecimal = new BigDecimal(finalPriceClass.getTotalPrice());
                        MainActivity.mPriceSumButton.setText(String.format("합계금액:￦%,d \n견적확인", new BigInteger(bigDecimal.toString())));
                    }else {
                        price[position]="0";
                        finalPriceClass.minusTotalPrice((Double.parseDouble(addprice)*10000));
                        BigDecimal bigDecimal = new BigDecimal(finalPriceClass.getTotalPrice());
                        MainActivity.mPriceSumButton.setText(String.format("합계금액:￦%,d \n견적확인", new BigInteger(bigDecimal.toString())));
                    }

                } else {
                    if (addprice.equals("")) {
                        addprice = "0";
                        price[position]="0";
                    }
                    finalPriceClass.setTotalPrice(finalPriceClass.getTotalPrice() + ((Double.parseDouble(s.toString().replaceAll(",", "")) - Double.parseDouble(addprice))*10000));
                    BigDecimal bigDecimal = new BigDecimal(finalPriceClass.getTotalPrice());
                    MainActivity.mPriceSumButton.setText(String.format("합계금액:￦%,d \n견적확인", new BigInteger(bigDecimal.toString())));
                }
                if (addprice.equals("")) {
                    addprice = "0";
                    price[position]="0";
                } else {
                    addprice = s.toString().replaceAll(",", "");
                }

                if (!s.toString().equals("")) {
                    price[position] = s.toString().replaceAll(",", "");
                    if (!s.toString().equals(result)) {     // StackOverflow를 막기위해,
                        result = df.format(Long.parseLong(s.toString().replaceAll(",", "")));   // 에딧텍스트의 값을 변환하여, result에 저장.
                        holder.editText_price.setText(result);    // 결과 텍스트 셋팅.
                        holder.editText_price.setSelection(result.length());     // 커서를 제일 끝으로 보냄.
                    }
                }
            }

        });
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public String[] getItemText(){
        return Catagory;
    }
    public String[] getItemPrice(){
        return price;
    }
    private Object getItem(int position) {
        return listItems.get(position);
    }

    public void clear() {
        if (null != listItems) {
            listItems.clear();
        }
    }

    public void addAll(String category, int price) {
        listitem mItem = new listitem();

        /* MyItem에 아이템을 setting한다. */
        //mItem.setIcon(img);

        mItem.setPrice(price);
        mItem.setCatagory(category);
        listItems.add(mItem);
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        EditText editText_price, editText_category;
        ImageButton removeButton;

        ViewHolder(View parent) {
            super(parent);
            // imageView = parent.findViewById(R.id.coin_img);
            editText_category = parent.findViewById(R.id.category);
            editText_price = parent.findViewById(R.id.price);
            removeButton = parent.findViewById(R.id.remove_button);
        }
    }

}
