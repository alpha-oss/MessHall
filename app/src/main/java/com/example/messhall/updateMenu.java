package com.example.messhall;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class updateMenu extends AppCompatActivity {

    ImageButton btnBreak,btnLunch,btnDinner;
    Button userPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_menu);

        btnBreak=(ImageButton) findViewById(R.id.btnBreak);
        btnLunch=(ImageButton) findViewById(R.id.btnLunch);
        btnDinner=(ImageButton) findViewById((R.id.btnDinner));
        userPage=(Button)findViewById(R.id.userPage);

        FirebaseFirestore db = FirebaseFirestore.getInstance();

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

                        if(ss.equals("Ram"))
                        {
                            userPage.setEnabled(false);
                        }

//                        String ar = user.getUid().toString();

//                                Map<String, Object> city = new HashMap<>();
//                                city.put(ar,ss);

//                        FirebaseFirestore db = FirebaseFirestore.getInstance();
//                        DocumentReference docRef =db.collection("cities").document("BJ");
//                        docRef.update("name", FieldValue.arrayUnion(ss));
//                        Intent intent = new Intent(breakfast.this,menuPage.class);
//                        startActivity(intent);
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



        btnBreak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(updateMenu.this,breakfast.class);
                startActivity(intent);
            }
        });
        btnLunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(updateMenu.this,lunch.class);
                startActivity(intent);
            }
        });
        btnDinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(updateMenu.this,dinner.class);
                startActivity(intent);
            }
        });

        userPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(updateMenu.this,homeuser.class);
                startActivity(intent);
            }
        });

    }
}