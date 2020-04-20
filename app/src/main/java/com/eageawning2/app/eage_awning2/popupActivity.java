package com.eageawning2.app.eage_awning2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;


public class popupActivity extends AppCompatActivity {

    EditText toName_edit;
    Button ok_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_popup);

        toName_edit = findViewById(R.id.toName_edit);
        ok_button = findViewById(R.id.pop_button);


        ok_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra("result",toName_edit.getText()+"고객님 귀하");
                setResult(RESULT_OK,resultIntent);
                finish();

            }
        });
    }
}