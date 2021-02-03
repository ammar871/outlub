package com.taskesnoad.outlub.adpters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.taskesnoad.outlub.R;
import com.taskesnoad.outlub.pojo.Catogray;

import java.util.ArrayList;

public class AdpterCatogray extends RecyclerView.Adapter<AdpterCatogray.ViewHolderVidio>{

    private ArrayList<Catogray> list;
    private Context mcontext;


    public AdpterCatogray(ArrayList<Catogray> list, Context mcontext) {

        this.list = list;
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public ViewHolderVidio onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_catogray, parent, false);
        ViewHolderVidio chatViewHolder = new ViewHolderVidio(view);
        return chatViewHolder;

    }
    public String[] mColors = {
            "#F4511E", "#595b83", "#433d3c", "#34626c", "#3ca59d", "#e84a5f", "#07031a",        //reds
            "#5a3d55"};
    @Override
    public void onBindViewHolder(@NonNull ViewHolderVidio holder, int position) {
        holder.name.setText(list.get(position).getName());

        holder.cardView.setCardBackgroundColor(Color.parseColor(mColors[position % 8]));
        Glide.with(mcontext)
                .load(list.get(position).getImage())
                .into(holder.imageView);
    }



//    @Override
//    public void onBindViewHolder(@NonNull final ViewHolderVidio holder, final int position) {
//        holder.name.setText(list.get(position).getTitle());
//        holder.desc.setText(list.get(position).getBody());
//        final Data data=list.get(position);
//        Glide.with(mcontext)
//                .load(list.get(position).getImage())
//                .into(holder.imageView);
//        holder.imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                intentMothed(DetailsNewsActivity.class,data);
//
//            }
//        });
//
//
//    }




    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolderVidio extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name, desc;
        CardView cardView;


        public ViewHolderVidio(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.img_item_cato);
            name = itemView.findViewById(R.id.tv_title);
            cardView = itemView.findViewById(R.id.cardView);

        }


    }}
//    private void intentMothed(Class a, Data value) {
//
//        Intent intent = new Intent(mcontext, a);
//        intent.putExtra("news", value);
//        mcontext.startActivity(intent);
//    }


