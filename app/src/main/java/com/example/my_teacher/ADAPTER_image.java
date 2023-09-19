package com.example.my_teacher;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ADAPTER_image extends RecyclerView.Adapter<ADAPTER_image.myViewHolder> {
    Context context;
    List<Get_Image_Data> images;

    public ADAPTER_image(Context context, List<Get_Image_Data> images) {
        this.context = context;
        this.images = images;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.photoview, parent, false);

        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        Get_Image_Data img_data = images.get(position);

        String imageURL = null;
        imageURL = img_data.getImage();
        Picasso.get().load(imageURL).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {
        private final ImageView imageView;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.image_photo);

        }
    }
}
