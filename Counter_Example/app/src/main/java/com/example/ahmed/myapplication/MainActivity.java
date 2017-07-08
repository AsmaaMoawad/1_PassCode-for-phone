package com.example.ahmed.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    TextView t1 ;

    int counter =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (TextView) findViewById(R.id.textView);

        t1.setText("0");

    }


    public  void restart( View obj){

        counter = 0 ;

        t1.setText(String.valueOf(counter));
    }

    public  void add( View obj){

        counter ++ ;

        t1.setText(String.valueOf(counter));
    }

    public  void sub( View obj){

        if (counter > 0){

            counter -- ;

            t1.setText(String.valueOf(counter));
        }


    }
}
