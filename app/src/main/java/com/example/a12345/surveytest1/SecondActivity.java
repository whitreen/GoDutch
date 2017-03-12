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

public class SecondActivity extends AppCompatActivity {

    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
/*
        tv=(TextView)findViewById(R.id.textView1);
        rd1=(RadioButton)findViewById(R.id.radio0);
        rd2=(RadioButton)findViewById(R.id.radio1);
        rdg=(RadioGroup)findViewById(R.id.radioGroup1);
        rdg.setOnCheckedChangeListener(rdgcc);
*/
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent();
                intent.setClass(SecondActivity.this,ThirdActivity.class);
                startActivity(intent);

                finish();
            }
        });

    }

}
