package com.example.messhall;

import static java.time.LocalDate.now;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class homeuser extends AppCompatActivity {

    ImageButton menuBtn,feedBtn;
    Button logout;
    TextView date1;
    EditText userName;

    FirebaseFirestore db = FirebaseFirestore.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeuser);



        feedBtn=(ImageButton)findViewById(R.id.feedBtn);
        menuBtn=(ImageButton) findViewById(R.id.mnuBtn);
        userName=findViewById(R.id.userName);
        logout=(Button)findViewById(R.id.logout);
        date1=findViewById(R.id.date);
        date1.setText(java.time.LocalDate.now().toString());

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
                        userName.setText(ss);

//                                Map<String, Object> city = new HashMap<>();
//                                city.put(ar,ss);

//                        FirebaseFirestore db = FirebaseFirestore.getInstance();
//                        DocumentReference docRef =db.collection("cities").document("BJ");
//                        docRef.update("name", FieldValue.arrayUnion(ss));
//                        Intent intent = new Intent(homeuser.this,menuPage.class);
//                        startActivity(intent);



//                        Log.d(TAG, "DocumentSnapshot data: " + document.getData());
//                        Toast.makeText(breakfast.this,document.getData()["Breakfast"][0].toString(),Toast.LENGTH_LONG).show();
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

        menuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(homeuser.this,menuPage.class);
                startActivity(intent);
            }
        });

        feedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(homeuser.this,feedback.class);
                startActivity(intent);

            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(homeuser.this,MainActivity.class);
                startActivity(intent);

            }
        });



        java.util.Date date = new java.util.Date();
        //Toast.makeText(this,date.toString(),Toast.LENGTH_LONG).show();
    }
}