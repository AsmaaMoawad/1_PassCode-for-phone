package com.example.asmaa.as1amit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Pass_Phone extends AppCompatActivity {

    EditText Pass;
    TextView check;
    TextView enter;
    static int  counter = 0;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass__phone);
        Pass=(EditText)findViewById(R.id.pass);
        //check=(TextView)findViewById(R.id.check);
        enter=(TextView)findViewById(R.id.hello);
    }


    public void put(View view){
      String btn_1=((Button)view).getText().toString();
      String btn_2=((Button)view).getText().toString();
      String btn_3=((Button)view).getText().toString();
        String btn_4=((Button)view).getText().toString();
        String btn_5=((Button)view).getText().toString();
        String btn_6=((Button)view).getText().toString();
        String btn_7=((Button)view).getText().toString();
        String btn_8=((Button)view).getText().toString();
        String btn_9=((Button)view).getText().toString();
        String btn_0=((Button)view).getText().toString();


        if(btn_1.equals("1")){
            Pass.append("1");
        }

        else  if(btn_2.equals("2")){
            Pass.append("2");
        }

        else  if(btn_3.equals("3")){
            Pass.append("3");
        }

        else  if(btn_4.equals("4")){
            Pass.append("4");
        }

        else  if(btn_5.equals("5")){
            Pass.append("5");
        }

        else  if(btn_6.equals("6")){
            Pass.append("6");
        }

        else  if(btn_7.equals("7")){
            Pass.append("7");
        }

        else  if(btn_8.equals("8")){
            Pass.append("8");
        }

        else  if(btn_9.equals("9")){
            Pass.append("9");
        }
        else  if(btn_0.equals("0")){
            Pass.append("0");
        }





    }


    public void OK(View view){
       // int pas_sign=Integer.parseInt(Pass.getText().toString());
        String pas_sign=Pass.getText().toString();
        String pas_curr="2332";





        if(pas_sign.equals(pas_curr)){
            Intent intent=new Intent(this,WelcomePage.class);

            startActivity( intent );
     }
        else if (pas_sign!=pas_curr&&counter<3){


               // finish();
                //startActivity(getIntent());
                enter.setText("The password is wrong tryagain");
                counter++;

            }




         if (counter==3){

            //enter.setVisibility(View.GONE);
            Pass.setVisibility(View.GONE);
            enter.setText("You are Blocked");



        }


    }








}
