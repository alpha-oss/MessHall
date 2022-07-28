package com.example.messhall;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

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

import java.util.HashMap;
import java.util.Map;

public class feedback extends AppCompatActivity {


    EditText feedText,feed1,feed2;
    Button submitBtn;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        submitBtn = findViewById(R.id.submitBtn);

        feedText=findViewById(R.id.feedText);
        feed1=findViewById(R.id.feed1);
        feed2=findViewById(R.id.feed2);


        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String feedd1= feed1.getText().toString();
                String feedd2= feed2.getText().toString();
                String feedtxt=feedText.getText().toString();

                FirebaseAuth mAuth;
                mAuth = FirebaseAuth.getInstance();
                FirebaseUser user = mAuth.getCurrentUser();
                Map<String, Object> city = new HashMap<>();
                city.put("Feedback1", feedd1);
                city.put("Feedback2", feedd2);
                city.put("Feedback3", feedtxt);

                DocumentReference docRef = db.collection("users").document(user.getUid());
                docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                        if (task.isSuccessful()) {
                            DocumentSnapshot document = task.getResult();
                            if (document.exists()) {
                                String ss = "";

                                ss = document.getData().get("name").toString();


                                FirebaseFirestore db = FirebaseFirestore.getInstance();
                                DocumentReference docRef =db.collection("feedback").document("feed");
                                docRef.update(ss, FieldValue.arrayUnion(city));

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





    }
}