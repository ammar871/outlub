package com.taskesnoad.outlub.adpters;

import android.content.Context;
import android.graphics.Color;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.taskesnoad.outlub.R;
import com.taskesnoad.outlub.pojo.Catogray;
import com.taskesnoad.outlub.pojo.Orders;

import java.util.ArrayList;

public class AdpterOrders extends RecyclerView.Adapter<AdpterOrders.ViewHolderVidio>{

    private ArrayList<Orders> list;
    private Context mcontext;


    public AdpterOrders(ArrayList<Orders> list, Context mcontext) {

        this.list = list;
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public ViewHolderVidio onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_orders, parent, false);

        ViewHolderVidio chatViewHolder = new ViewHolderVidio(view);
        return chatViewHolder;

    }
    public String[] mColors = {
            "#14A0DF", "#595b83", "#433d3c", "#34626c", "#3ca59d", "#e84a5f", "#07031a",        //reds
            "#5a3d55"};
    @Override
    public void onBindViewHolder(@NonNull ViewHolderVidio holder, int position) {
        holder.name.setText(list.get(position).getNameOrder());
        holder.desc.setText(list.get(position).getDescproduct());
        holder.price.setText(list.get(position).getPrice());


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
        TextView name, desc,price;
        CardView cardView;


        public ViewHolderVidio(@NonNull View itemView) {
            super(itemView);


            name = itemView.findViewById(R.id.tv_orderagain_name);
            desc = itemView.findViewById(R.id.tv_descagain);
            price = itemView.findViewById(R.id.tv_orderagainprice);

        }


    }}
//    private void intentMothed(Class a, Data value) {
//
//        Intent intent = new Intent(mcontext, a);
//        intent.putExtra("news", value);
//        mcontext.startActivity(intent);
//    }


