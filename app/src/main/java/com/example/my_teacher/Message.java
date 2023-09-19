package com.example.my_teacher;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;

import java.util.ArrayList;
import java.util.List;

public class Message extends AppCompatActivity {
    FirebaseDatabase database;
    DatabaseReference reference;
    FirebaseStorage firebaseStorage;
    RecyclerView recyclerView;
    StudentAdapter adapter;
    List<Get_student_Data> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        getSupportActionBar().hide();
        database = FirebaseDatabase.getInstance();
        reference = database.getReference().child("Update_notice");
        firebaseStorage = FirebaseStorage.getInstance();
        recyclerView = (RecyclerView) findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<Get_student_Data>();
        adapter = new StudentAdapter(Message.this, list);
        recyclerView.setAdapter(adapter);


        reference.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                Get_student_Data getdata = snapshot.getValue(Get_student_Data.class);
                list.add(getdata);
                adapter.notifyDataSetChanged();

            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }

    public void home(View view) {
        startActivity(new Intent(Message.this, PageOne.class));
    }
}