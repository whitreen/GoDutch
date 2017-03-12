package com.example.a12345.surveytest1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    private TextView tv1,tv2,tv3,tv4;
    private RadioButton rd1, rd2, rd3, rd4, rd5, rd6, rd7, rd8;
    private String data1, data2, data3, data4=null;
    private RadioGroup rdg1,rdg2,rdg3,rdg4;

    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv3 = (TextView) findViewById(R.id.textView3);
        tv4 = (TextView) findViewById(R.id.textView4);

        rd1 = (RadioButton) findViewById(R.id.radio1);
        rd2 = (RadioButton) findViewById(R.id.radio2);
        rd3 = (RadioButton) findViewById(R.id.radio3);
        rd4 = (RadioButton) findViewById(R.id.radio4);
        rd5 = (RadioButton) findViewById(R.id.radio5);
        rd6 = (RadioButton) findViewById(R.id.radio6);
        rd7 = (RadioButton) findViewById(R.id.radio7);
        rd8 = (RadioButton) findViewById(R.id.radio8);


        rdg1=(RadioGroup)findViewById(R.id.radioGroup1);
        rdg2=(RadioGroup)findViewById(R.id.radioGroup2);
        rdg3=(RadioGroup)findViewById(R.id.radioGroup3);
        rdg4=(RadioGroup)findViewById(R.id.radioGroup4);

        rdg1.setOnCheckedChangeListener(rdgcc1);
        rdg2.setOnCheckedChangeListener(rdgcc2);
        rdg3.setOnCheckedChangeListener(rdgcc3);
        rdg4.setOnCheckedChangeListener(rdgcc4);

        btn1 = (Button) findViewById(R.id.btn1);


        btn1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                save();
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, SecondActivity.class);
                startActivity(intent);

                finish();
            }
        });
    }


    public void save( )
    {
        FileOutputStream out = null;
        BufferedWriter writer = null;

        try {
            //设置文件名称，以及存储方式
            out = openFileOutput("Surveydata", Context.MODE_APPEND);
            //创建一个OutputStreamWriter对象，传入BufferedWriter的构造器中
            writer = new BufferedWriter(new OutputStreamWriter(out));
            //向文件中写入数据
            writer.write(tv1 + "\t" + data1 + "\n");
            writer.write(tv2 + "\t" + data2 + "\n");
            writer.write(tv3 + "\t" + data3 + "\n");
            writer.write(tv4 + "\t" + data4 + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        };
    };


    private RadioGroup.OnCheckedChangeListener rdgcc1 = new RadioGroup.OnCheckedChangeListener()
    {

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId)
        {
            // TODO Auto-generated method stub

            if (checkedId == rd1.getId())
            {
                data1 = (String) (rd1.getText());
            }
            else if (checkedId == rd2.getId())
            {
                data1 = (String) (rd2.getText());
            }
        };
    };

    private RadioGroup.OnCheckedChangeListener rdgcc2 = new RadioGroup.OnCheckedChangeListener()
    {

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId)
        {
            // TODO Auto-generated method stub

            if (checkedId == rd3.getId())
            {
                data2 = (String) (rd3.getText());
            }
            else if (checkedId == rd4.getId())
            {
                data2 = (String) (rd4.getText());
            }
        };
    };

    private RadioGroup.OnCheckedChangeListener rdgcc3 = new RadioGroup.OnCheckedChangeListener()
    {

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId)
        {
            // TODO Auto-generated method stub

            if (checkedId == rd5.getId())
            {
                data3 = (String) (rd5.getText());
            }
            else if (checkedId == rd6.getId())
            {
                data3 = (String) (rd6.getText());
            }
        };
    };

    private RadioGroup.OnCheckedChangeListener rdgcc4 = new RadioGroup.OnCheckedChangeListener()
    {

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId)
        {
            // TODO Auto-generated method stub

            if (checkedId == rd7.getId())
            {
                data4 = (String) (rd7.getText());
            }
            else if (checkedId == rd8.getId())
            {
                data4 = (String) (rd8.getText());
            }
        };
    };

}
