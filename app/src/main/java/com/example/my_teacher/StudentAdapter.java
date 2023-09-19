package com.example.my_teacher;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.MyViewHolder> {
    Context context;
    List<Get_student_Data> lists;


    public StudentAdapter(Context context, List<Get_student_Data> lists) {
        this.context = context;
        this.lists = lists;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemview, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Get_student_Data data = lists.get(position);
        holder.title.setText(data.getTitle());
        holder.date.setText(data.getDate());
        holder.time.setText(data.getTime());
        String imageURL = null;
        imageURL = data.getImage();
        Picasso.get().load(imageURL).into(holder.image);


    }

    @Override
    public int getItemCount() {
        return lists.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private final TextView title;
        private final TextView date;
        private final TextView time;
        ImageView image;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.image_view);
            time = (TextView) itemView.findViewById(R.id.text_time);
            date = (TextView) itemView.findViewById(R.id.text_date);
            title = (TextView) itemView.findViewById(R.id.text_title);
        }
    }
}
