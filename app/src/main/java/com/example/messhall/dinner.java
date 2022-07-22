package com.example.messhall;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class dinner extends AppCompatActivity {

    EditText dinnerVeg,dinnerNon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner);

        FirebaseFirestore db = FirebaseFirestore.getInstance();


        dinnerNon=findViewById(R.id.dinnerNon);
        dinnerVeg=findViewById(R.id.dinnerVeg);

        Bundle bundle = getIntent().getExtras();

        String en = bundle.getString("Enabled");
        String ef = bundle.getString("Next");


        java.util.Date date = new java.util.Date();
        date.toString();
        LocalDate today = LocalDate.now();

        DayOfWeek dayOfWeek = today.getDayOfWeek();
        String day = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault());

        if(en.equals("Enabled"))
        {
            if(day.equals("Friday")) {


                DocumentReference docRef = db.collection("Monday").document("Friday");
                docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                        if (task.isSuccessful()) {
                            DocumentSnapshot document = task.getResult();
                            if (document.exists()) {
                                String ss = "";

                                ss = document.getData().get("DinnerVeg").toString();
                                dinnerVeg.setText(ss);
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

                                ss = document.getData().get("DinnerVeg").toString();
                                dinnerVeg.setText(ss);
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

                                ss = document.getData().get("DinnerVeg").toString();
                                dinnerVeg.setText(ss);
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

                                ss = document.getData().get("DinnerVeg").toString();
                                dinnerVeg.setText(ss);
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

                                ss = document.getData().get("DinnerVeg").toString();
                                dinnerVeg.setText(ss);
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

                                ss = document.getData().get("DinnerVeg").toString();
                                dinnerVeg.setText(ss);
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

                                ss = document.getData().get("DinnerVeg").toString();
                                dinnerVeg.setText(ss);
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
        }

        else if(ef.equals("Disabled"))
        {



            if(day.equals("Tuesday"))
            {
                DocumentReference docRef = db.collection("Monday").document("Tuesday");
                docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                        if (task.isSuccessful()) {
                            DocumentSnapshot document = task.getResult();
                            if (document.exists()) {
                                String ss;

                                ss = document.getData().get("DinnerNonVeg").toString();
                                dinnerNon.setText(ss);
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

                                ss = document.getData().get("DinnerNonVeg").toString();
                                dinnerNon.setText(ss);
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

                                ss = document.getData().get("DinnerNonVeg").toString();
                                dinnerNon.setText(ss);
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

                                ss = document.getData().get("DinnerNonVeg").toString();
                                dinnerNon.setText(ss);
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

                                ss = document.getData().get("DinnerNonVeg").toString();
                                dinnerNon.setText(ss);
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
        }


    }
}