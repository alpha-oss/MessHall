package com.example.messhall;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.protobuf.DescriptorProtos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;

public class Attendance extends AppCompatActivity {

//    TextView breakAtt,lunchAtt,dinvAtt,dinnAtt;

    EditText datee,breakAtte,lunchAtte,dinvAtte,dinnonAtte,date3;
    Button veggBtn,nonvBtn,lunchBtn,breakBtn;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    int count=0,count1=0,count2=0,count3=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);

        datee=findViewById(R.id.datee);
        date3=findViewById(R.id.date3);

        breakAtte=findViewById(R.id.breakAtte);
        dinvAtte=findViewById(R.id.dinvAtte);
        dinnonAtte=findViewById(R.id.dinnonAtte);
        lunchAtte=findViewById(R.id.lunchAtte);
        breakBtn=findViewById(R.id.breakBtn);
        lunchBtn=findViewById(R.id.lunchBtn);
        veggBtn=findViewById(R.id.veggBtn);
        nonvBtn=findViewById(R.id.nonvBtn);

        java.util.Date date = new java.util.Date();
        date.toString();
        LocalDate today = LocalDate.now();

        DayOfWeek dayOfWeek = today.getDayOfWeek();
        String day = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault());

        date3.setText(day);

        FirebaseAuth mAuth;
        mAuth = FirebaseAuth.getInstance();

        FirebaseUser user = mAuth.getCurrentUser();

        breakBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DocumentReference docRef = db.collection("cities").document("BJ");
                docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                        if (task.isSuccessful()) {
                            DocumentSnapshot document = task.getResult();
                            if (document.exists()) {
//                        String ss = "";
                                String str;
                                String arr[] = new String[100];

                                List<String> ss = (List<String>) document.getData().get("name");
                                str=ss.toString();
                                for(int i =0;i<str.length();i++)
                                {
                                    if(str.charAt(i)==',')
                                        count=count+1;
                                }
                                count=count+1;
                                String cnt=Integer.toString(count);
                                breakAtte.setText(cnt);

                            } else {
//                        Log.d(TAG, "No such document");
                            }
                        } else {
//                    Log.d(TAG, "get failed with ", task.getException());
                        }
//                        Intent intent = new Intent(breakfast.this,menuPage.class);
//                        startActivity(intent);
                    }




                });
            }
        });




        lunchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DocumentReference docRef1 = db.collection("cities").document("LCH");
                docRef1.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                        if (task.isSuccessful()) {
                            DocumentSnapshot document1 = task.getResult();
                            if (document1.exists()) {
//                        String ss = "";
                                String str;
                                String arr[] = new String[100];

                                List<String> ss = (List<String>) document1.getData().get("name");
                                str=ss.toString();
                                for(int i =0;i<str.length();i++)
                                {
                                    if(str.charAt(i)==',')
                                        count1=count1+1;
                                }
                                count1=count1+1;
                                String cnt=Integer.toString(count1);
                                lunchAtte.setText(cnt);


                            } else {
//                        Log.d(TAG, "No such document");
                            }
                        } else {
//                    Log.d(TAG, "get failed with ", task.getException());
                        }
//                        Intent intent = new Intent(breakfast.this,menuPage.class);
//                        startActivity(intent);
                    }




                });
            }
        });

        veggBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                        DocumentReference docRef2 = db.collection("cities").document("DINV");
        docRef2.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (document.exists()) {
//                        String ss = "";
                        String str2;
                        String arr[] = new String[100];

                        List<String> ss = (List<String>) document.getData().get("name");
                        str2=ss.toString();
                        for(int i =0;i<str2.length();i++)
                        {
                            if(str2.charAt(i)==',')
                                count2=count2+1;
                        }
                        count2=count2+1;
                        String cnt2=Integer.toString(count2);
                        dinvAtte.setText(cnt2);

                    } else {
//                        Log.d(TAG, "No such document");
                    }
                } else {
//                    Log.d(TAG, "get failed with ", task.getException());
                }
//                        Intent intent = new Intent(breakfast.this,menuPage.class);
//                        startActivity(intent);
            }




        });
            }
        });

        nonvBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

        DocumentReference docRef3 = db.collection("cities").document("DINNON");
        docRef3.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (document.exists()) {
//                        String ss = "";
                        String str3;
                        String arr[] = new String[100];

                        List<String> ss = (List<String>) document.getData().get("name");
                        str3=ss.toString();
                        for(int i =0;i<str3.length();i++)
                        {
                            if(str3.charAt(i)==',')
                                count3=count3+1;
                        }
                        count3=count3+1;
                        String cnt3=Integer.toString(count3);
                        dinnonAtte.setText(cnt3);

                    } else {
//                        Log.d(TAG, "No such document");
                    }
                } else {
//                    Log.d(TAG, "get failed with ", task.getException());
                }
//                        Intent intent = new Intent(breakfast.this,menuPage.class);
//                        startActivity(intent);
            }




        });


                datee.setText(java.time.LocalDate.now().toString());


            }
        });




//

    }
}