package com.example.androidc3.Adapter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidc3.Model.CarvingModel;
import com.example.androidc3.Model.WaiataModel;
import com.example.androidc3.R;
import com.example.androidc3.WaiataDetailActivity;

import java.util.ArrayList;


//import com.example.info706c3.DetailActivity;

//import maes.tech.intentanim.CustomIntent;

public class GridOfCarvAdapter extends RecyclerView.Adapter<GridOfCarvAdapter.MyViewHolder> {

    ArrayList<CarvingModel> CharList;
    String name;

    public GridOfCarvAdapter(ArrayList<CarvingModel> CharList) {
        this.CharList = CharList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.expansion_panel_recycler_cell, parent, false);
        return new MyViewHolder(itemView);
    }

    @SuppressLint("SetTextI18n")
    @Override
//to set position of grid view
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") final int position) {
       final CarvingModel charModel = CharList.get(position);

       //setting up values
        holder.txt_char.setText(charModel.getName());
        holder.txt_content.setText(charModel.getDescription());
        holder.img_char.setImageResource(charModel.getImage());
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            //passing the value on the onclick functionality
            public void onClick(View v){
//                Intent intent = new Intent(v.getContext(), WaiataDetailActivity.class);
////
//                intent.putExtra("image", charModel.getImage());
//                intent.putExtra("name", charModel.getName());
//                intent.putExtra("description", charModel.getDescription());
//                intent.putExtra("vocal", charModel.getVideo());
//                intent.putExtra("lyricsmaori", charModel.getLyricsmaori());
//                intent.putExtra("lyricseng", charModel.getLyricseng());
//                intent.putExtra("lyricsurdu", charModel.getLyricsurdu());
////                intent.putExtra("Abilites", charModel.getAbilities());
////                intent.putExtra("Combo", charModel.getCombo());
//                v.getContext().startActivity(intent);
////                CustomIntent.customType(v.getContext(), "left-to-right");
            }
        });
    }
// To count array list
    @Override
    public int getItemCount() {
        return CharList.size();
    }
//view holder of recyclerview
    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txt_char,txt_content;
        ImageView img_char;



        MyViewHolder(View view) {
            super(view);
            txt_char = view.findViewById(R.id.title);
            img_char = view.findViewById(R.id.image1);
            txt_content = view.findViewById(R.id.content);

        }
    }
}
