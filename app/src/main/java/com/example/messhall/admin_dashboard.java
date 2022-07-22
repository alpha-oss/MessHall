package com.example.messhall;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class admin_dashboard extends AppCompatActivity {

    Button attdBtn,menuBtn;
    EditText text1,date2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);

        FirebaseFirestore db = FirebaseFirestore.getInstance();

        date2=findViewById(R.id.date2);
        text1=findViewById(R.id.text1);

        attdBtn = findViewById(R.id.attdBtn);
        menuBtn = findViewById(R.id.menuBtn);
        date2.setText(java.time.LocalDate.now().toString());

        FirebaseAuth mAuth;
        mAuth = FirebaseAuth.getInstance();

        FirebaseUser user = mAuth.getCurrentUser();

        DocumentReference docRef = db.collection("users").document(user.getUid());
        docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (document.exists()) {
                        String ss = "";

                        ss = document.getData().get("name").toString();
                        text1.setText(ss);
//                        Log.d(TAG, "DocumentSnapshot data: " + document.getData());
//                        Toast.makeText(breakfast.this,document.getData()["Breakfast"][0].toString(),Toast.LENGTH_LONG).show();
                    } else {
//                        Log.d(TAG, "No such document");
                    }
                } else {
//                    Log.d(TAG, "get failed with ", task.getException());
                }
            }
        });

        attdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(admin_dashboard.this,Attendance.class);
                startActivity(intent);
            }
        });

        menuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(admin_dashboard.this,menuPage.class);
                startActivity(intent);
            }
        });

    }
}