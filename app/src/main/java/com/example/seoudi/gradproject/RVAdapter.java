package com.example.seoudi.gradproject;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Host on 4/4/2017.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder>{
    List<String> doctorName;
    List<String> posts;
    List<String> photos;



    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_card, parent, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }
    RVAdapter(List<String> doctorName, List<String> posts, List<String>photos){
        this.doctorName = doctorName;
        this.posts = posts;
        this.photos = photos;

    }

    @Override
    public void onBindViewHolder(PersonViewHolder personViewHolder, int i) {
        personViewHolder.doctorName.setText(doctorName.get(i));
        personViewHolder.post.setText(posts.get(i));
        personViewHolder.photo.setImageResource(R.drawable.done);
    }

    @Override
    public int getItemCount() {
        return  doctorName.size();
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class PersonViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView doctorName;
        TextView post;
        ImageView photo;

        PersonViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            doctorName = (TextView)itemView.findViewById(R.id.doctor_name);
            post = (TextView)itemView.findViewById(R.id.post_text);
            photo=(ImageView)itemView.findViewById(R.id.doctor_photo);
        }
    }

}
