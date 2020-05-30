package com.example.comp709c3.Adapter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.comp709c3.Model.WaiataModel;
import com.example.comp709c3.R;

import java.util.ArrayList;

public class GridOfCharAdapter extends RecyclerView.Adapter<GridOfCharAdapter.MyViewHolder> {

    ArrayList<WaiataModel> CharList;
    String name;

    public GridOfCharAdapter(ArrayList<WaiataModel> CharList) {
        this.CharList = CharList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.grid, parent, false);
        return new MyViewHolder(itemView);
    }

    @SuppressLint("SetTextI18n")
    @Override
//to set position of grid view
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") final int position) {
       final WaiataModel charModel = CharList.get(position);

       //setting up values
        holder.txt_char.setText(charModel.getName());
        holder.img_char.setImageResource(charModel.getImage());
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            //passing the value on the onclick functionality
            public void onClick(View v){
//                Intent intent = new Intent(v.getContext(), CharView.class);
//
//                intent.putExtra("image", charModel.getImage());
//                intent.putExtra("name", charModel.getName());
//                intent.putExtra("Desc", charModel.getDescription());
//                intent.putExtra("Abilites", charModel.getAbilities());
//                intent.putExtra("Combo", charModel.getCombo());
//                v.getContext().startActivity(intent);
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
        TextView txt_char;
        ImageView img_char;

        MyViewHolder(View view) {
            super(view);
            txt_char = view.findViewById(R.id.txt_char);
            img_char = view.findViewById(R.id.img_char);

        }
    }
}
