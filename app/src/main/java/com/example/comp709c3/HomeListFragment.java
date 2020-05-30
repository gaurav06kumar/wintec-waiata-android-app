package com.example.comp709c3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.comp709c3.Adapter.GridOfCharAdapter;
import com.example.comp709c3.Adapter.ListOfCharAdapter;
import com.example.comp709c3.Model.WaiataModel;

import java.util.ArrayList;

public class HomeListFragment extends Fragment {
    private ArrayList<WaiataModel> charList = new ArrayList<>();
    private GridOfCharAdapter gridOfCharAdapter;
    private ListOfCharAdapter listOfCharAdapter;
    private RecyclerView charRecyclerview;
    Button btn;
    String name;



    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_home_list_fragment, container, false);

        //store the value in the form of array
        WaiataModel charModel0 = new WaiataModel(R.drawable.zeus_icon, "zeus", "Zeus, the Lord of Heaven, is a ranged intelligence hero who functions almost solely as a nuker. He is usually played as a semi-carry ganker type hero, who instead of utilizing disables, focuses solely on delivering tremendous amounts of magical damage to his foes.", "Electric Shock","Attack + defence"  );
        charList.add(charModel0);

        WaiataModel charModel1 = new WaiataModel(R.drawable.doom_icon, "Doom", "Lucifer, the Doom, is a melee strength hero with strong farming capabilities, good versatility, and one of the strongest single-target disables in the game. His very low starting armor makes him vulnerable to harassment, but his abilities and high health allow him to lane or even jungle quite effectively.", "Fire","Attack + defence + Carry" );
        charList.add(charModel1);
        gridOfCharAdapter = new GridOfCharAdapter(charList);
        listOfCharAdapter = new ListOfCharAdapter(charList);
        charRecyclerview = rootView.findViewById(R.id.recyclerview);


//        for list
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        charRecyclerview.setLayoutManager(mLayoutManager);
        charRecyclerview.setItemAnimator(new DefaultItemAnimator());
        charRecyclerview.setAdapter(listOfCharAdapter);
        listOfCharAdapter.notifyDataSetChanged();

        return rootView;

    }

}
