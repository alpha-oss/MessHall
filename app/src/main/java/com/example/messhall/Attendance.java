package com.example.messhall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Attendance extends AppCompatActivity {

//    TextView breakAtt,lunchAtt,dinnervAtt,dinnernvAtt;

    EditText datee,breakAtte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);

        datee=findViewById(R.id.datee);

        breakAtte=findViewById(R.id.breakAtte);
//        lunchAtt=findViewById(R.id.lunchAtt);
//        dinnervAtt=findViewById(R.id.dinvAtt);
//        dinnernvAtt=findViewById(R.id.dinnNonAtt);

        Bundle bundle= getIntent().getExtras();

        String count = bundle.getString("count");

        datee.setText(java.time.LocalDate.now().toString());

        breakAtte.setText(count);

    }
}