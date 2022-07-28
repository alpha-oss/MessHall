package com.example.messhall;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.SetOptions;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;


public class breakfast extends AppCompatActivity {

    EditText text;
    Button btnYes,btnNo;

    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);

        FirebaseFirestore db = FirebaseFirestore.getInstance();

        text=findViewById(R.id.breakText);
        btnNo=findViewById(R.id.btnNon);
        btnYes=findViewById(R.id.btnVeg);

        java.util.Date date = new java.util.Date();
        date.toString();
        LocalDate today = LocalDate.now();

        DayOfWeek dayOfWeek = today.getDayOfWeek();
        String day = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault());

        if(day.equals("Friday")) {


            DocumentReference docRef = db.collection("Monday").document("Friday");
            docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                @Override
                public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                    if (task.isSuccessful()) {
                        DocumentSnapshot document = task.getResult();
                        if (document.exists()) {
                            String ss = "";

                            ss = document.getData().get("Breakfast").toString();
                            text.setText(ss);
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
        }

        else if(day.equals("Monday"))
        {
            DocumentReference docRef = db.collection("Monday").document("M2Wwe5zrKiJlwMb4UVw4");
            docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                @Override
                public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                    if (task.isSuccessful()) {
                        DocumentSnapshot document = task.getResult();
                        if (document.exists()) {
                            String ss = "";

                            ss = document.getData().get("Breakfast").toString();
                            text.setText(ss);
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
        }
        else if(day.equals("Tuesday"))
        {
            DocumentReference docRef = db.collection("Monday").document("Tuesday");
            docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                @Override
                public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                    if (task.isSuccessful()) {
                        DocumentSnapshot document = task.getResult();
                        if (document.exists()) {
                            String ss;

                            ss = document.getData().get("Breakfast").toString();
                            text.setText(ss);
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
        }

        else if(day.equals("Wednesday"))
        {
            DocumentReference docRef = db.collection("Monday").document("Wednesday");
            docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                @Override
                public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                    if (task.isSuccessful()) {
                        DocumentSnapshot document = task.getResult();
                        if (document.exists()) {
                            String ss = "";

                            ss = document.getData().get("Breakfast").toString();
                            text.setText(ss);
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
        }
        else if(day.equals("Thursday"))
        {
            DocumentReference docRef = db.collection("Monday").document("Thursday");
            docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                @Override
                public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                    if (task.isSuccessful()) {
                        DocumentSnapshot document = task.getResult();
                        if (document.exists()) {
                            String ss = "";

                            ss = document.getData().get("Breakfast").toString();
                            text.setText(ss);
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
        }
        else if(day.equals("Saturday"))
        {
            DocumentReference docRef = db.collection("Monday").document("Saturday");
            docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                @Override
                public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                    if (task.isSuccessful()) {
                        DocumentSnapshot document = task.getResult();
                        if (document.exists()) {
                            String ss = "";

                            ss = document.getData().get("Breakfast").toString();
                            text.setText(ss);
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
        }

        else if(day.equals("Sunday"))
        {
            DocumentReference docRef = db.collection("Monday").document("Sunday");
            docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                @Override
                public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                    if (task.isSuccessful()) {
                        DocumentSnapshot document = task.getResult();
                        if (document.exists()) {
                            String ss = "";

                            ss = document.getData().get("Breakfast").toString();
                            text.setText(ss);
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
        }

        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

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

                                String ar = user.getUid().toString();

//                                Map<String, Object> city = new HashMap<>();
//                                city.put(ar,ss);

                                FirebaseFirestore db = FirebaseFirestore.getInstance();
                                DocumentReference docRef =db.collection("cities").document("BJ");
                                docRef.update("name", FieldValue.arrayUnion(ss));
                                Intent intent = new Intent(breakfast.this,menuPage.class);
                                startActivity(intent);
//                                docRef.update("name",FieldValue.delete(ss));





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


            }
        });

        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(breakfast.this,menuPage.class);
                startActivity(intent);
            }
        });
    }
}