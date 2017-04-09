package com.example.seoudi.gradproject;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Host on 4/4/2017.
 */

public class AdminRVAdapter extends RecyclerView.Adapter<AdminRVAdapter.AdminViewHolder>{
    List<String> doctorName;
    List<String> posts;
    List<String> photos;



    @Override
    public AdminViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.admin_card, parent, false);
        AdminViewHolder pvh = new AdminViewHolder(v);
        return pvh;
    }
    AdminRVAdapter(List<String> doctorName, List<String> posts, List<String>photos){
        this.doctorName = doctorName;
        this.posts = posts;
        this.photos = photos;

    }

    @Override
    public void onBindViewHolder(AdminViewHolder adminViewHolder, int i) {
        adminViewHolder.doctorName.setText(doctorName.get(i));
        adminViewHolder.post.setText(posts.get(i));
        adminViewHolder.photo.setImageResource(R.drawable.done);
    }

    @Override
    public int getItemCount() {
        return  doctorName.size();
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class AdminViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView doctorName;
        TextView post;
        ImageView photo;
        Button kickButt;
        AdminViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            doctorName = (TextView)itemView.findViewById(R.id.doctor_name_admin);
            post = (TextView)itemView.findViewById(R.id.speciality_text_admin);
            photo=(ImageView)itemView.findViewById(R.id.doctor_photo_admin);
            kickButt = (Button) itemView.findViewById(R.id.kick_butt);
            kickButt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("khaled", "3amalt removeeeee");

                }
            });

        }
    }


}
