package com.example.messhall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class feedback extends AppCompatActivity {

    RadioButton radioButton1,radioButton2,radioButton3,radioButton4,radioButton5,radioBtn1,radioBtn2,radioBtn3,radioBtn4,radioBtn5;
    EditText feedText;
    RadioGroup radioGroup;
    RadioGroup radioGroup1;
    Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        submitBtn = findViewById(R.id.submitBtn);

        feedText=findViewById(R.id.feedText);

        radioBtn1=findViewById(R.id.radioBtn1);
        radioBtn2=findViewById(R.id.radioBtn2);
        radioBtn3=findViewById(R.id.radioBtn3);
        radioBtn4=findViewById(R.id.radioBtn4);
        radioBtn5=findViewById(R.id.radioBtn5);


        radioGroup = (RadioGroup) findViewById(R.id.radioGrp);
        radioGroup1=(RadioGroup) findViewById(R.id.radioGrp1);
        radioButton1=findViewById(R.id.radioButton1);
        radioButton2=findViewById(R.id.radioButton2);
        radioButton3=findViewById(R.id.radioButton3);
        radioButton4=findViewById(R.id.radioButton4);
        radioButton5=findViewById(R.id.radioButton5);

        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (radioGroup.getCheckedRadioButtonId() == R.id.radioButton1)
                {
                    Toast.makeText(feedback.this,"NICE", Toast.LENGTH_SHORT).show();

                }



            }
        });

//        else if(radioBtn2.isSelected())
//        {
//            radioBtn1.setEnabled(false);
//            radioBtn3.setEnabled(false);
//            radioBtn4.setEnabled(false);
//            radioBtn5.setEnabled(false);
//        }
//        else if(radioBtn3.isSelected())
//        {
//            radioBtn2.setEnabled(false);
//            radioBtn1.setEnabled(false);
//            radioBtn4.setEnabled(false);
//            radioBtn5.setEnabled(false);
//        }
//        else if(radioBtn4.isSelected())
//        {
//            radioBtn2.setEnabled(false);
//            radioBtn3.setEnabled(false);
//            radioBtn1.setEnabled(false);
//            radioBtn5.setEnabled(false);
//        }
//        else if(radioBtn5.isSelected())
//        {
//            radioBtn2.setEnabled(false);
//            radioBtn3.setEnabled(false);
//            radioBtn4.setEnabled(false);
//            radioBtn1.setEnabled(false);
//        }
//        else if(radioButton1.isSelected())
//        {
//            radioButton2.setEnabled(false);
//            radioButton3.setEnabled(false);
//            radioButton4.setEnabled(false);
//            radioButton5.setEnabled(false);
//        }
//        else if(radioButton2.isSelected())
//        {
//            radioButton1.setEnabled(false);
//            radioButton3.setEnabled(false);
//            radioButton4.setEnabled(false);
//            radioButton5.setEnabled(false);
//        }
//        else if(radioButton3.isSelected())
//        {
//            radioButton2.setEnabled(false);
//            radioButton1.setEnabled(false);
//            radioButton4.setEnabled(false);
//            radioButton5.setEnabled(false);
//        }
//        else if(radioButton4.isSelected())
//        {
//            radioButton2.setEnabled(false);
//            radioButton3.setEnabled(false);
//            radioButton1.setEnabled(false);
//            radioButton5.setEnabled(false);
//        }
//        else if(radioButton5.isSelected())
//        {
//            radioButton2.setEnabled(false);
//            radioButton3.setEnabled(false);
//            radioButton4.setEnabled(false);
//            radioButton1.setEnabled(false);
//        }



    }
}