package com.example.a12345.surveytest1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by 12345 on 2017/3/12.
 */

public class FourthActivity extends AppCompatActivity {
    private Button btn4;

    @Override

    protected void onCreate(Bundle savaInstanceState) {
        super.onCreate(savaInstanceState);
        setContentView(R.layout.activity_main4);

        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                System.exit(1);
            }
        });
    }

    ;
}


