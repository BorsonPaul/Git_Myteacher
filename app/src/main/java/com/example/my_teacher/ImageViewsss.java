package com.example.my_teacher;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;

import java.util.ArrayList;
import java.util.List;

public class ImageViewsss extends AppCompatActivity {
    FirebaseDatabase database;
    DatabaseReference reference;
    FirebaseStorage firebaseStorage;

    RecyclerView recycle_pravupad, recycler_gurumoharaj, recycle_others;
    List<Get_Image_Data> list1, list2, list3;
    ADAPTER_image adapter1, adapter2, adapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_viewsss);
        getSupportActionBar().hide();

        database = FirebaseDatabase.getInstance();
        reference = database.getReference().child("galary");
        firebaseStorage = FirebaseStorage.getInstance();


        recycle_pravupad = (RecyclerView) findViewById(R.id.pravupad_view);
        recycler_gurumoharaj = (RecyclerView) findViewById(R.id.gurumoharaj_view);
        recycle_others = (RecyclerView) findViewById(R.id.Others_view);
        recycle_pravupad.setHasFixedSize(true);
        recycler_gurumoharaj.setHasFixedSize(true);
        recycler_gurumoharaj.setLayoutManager(new GridLayoutManager(this, 3));

        recycle_pravupad.setLayoutManager(new GridLayoutManager(this, 3));
        recycle_others.setHasFixedSize(true);
        recycle_others.setLayoutManager(new GridLayoutManager(this, 3));


        list1 = new ArrayList<Get_Image_Data>();
        list2 = new ArrayList<Get_Image_Data>();
        list3 = new ArrayList<Get_Image_Data>();
        adapter1 = new ADAPTER_image(ImageViewsss.this, list1);
        adapter2 = new ADAPTER_image(ImageViewsss.this, list2);
        adapter3 = new ADAPTER_image(ImageViewsss.this, list3);
        recycle_pravupad.setAdapter(adapter1);
        recycle_others.setAdapter(adapter2);
        recycler_gurumoharaj.setAdapter(adapter3);


        reference.child("GuruMoharaj").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                Get_Image_Data image_data = snapshot.getValue(Get_Image_Data.class);
                list3.add(image_data);
                adapter3.notifyDataSetChanged();
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

        reference.child("Pravupad").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                Get_Image_Data image_data = snapshot.getValue(Get_Image_Data.class);
                list1.add(image_data);
                adapter1.notifyDataSetChanged();
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
        reference.child("others").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                Get_Image_Data image_data = snapshot.getValue(Get_Image_Data.class);
                list2.add(image_data);
                adapter2.notifyDataSetChanged();
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
        startActivity(new Intent(this, PageOne.class));
    }
}