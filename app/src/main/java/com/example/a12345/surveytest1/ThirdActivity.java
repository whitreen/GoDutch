package com.example.a12345.surveytest1;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


/**
 * Created by 12345 on 2017/3/12.
 */

public class ThirdActivity extends AppCompatActivity{

    private Button btn3;
    @Override

    protected void onCreate(Bundle savaInstanceState){
        super.onCreate(savaInstanceState);
        setContentView(R.layout.activity_main3);

        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent();
                intent.setClass(ThirdActivity.this,FourthActivity.class);
                startActivity(intent);

                finish();
            }
        });
    }
}
