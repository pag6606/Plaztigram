package com.consultoresag.plaztigram.view.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.consultoresag.plaztigram.R;
import com.consultoresag.plaztigram.adapter.PictureAdapterRecyclerView;
import com.consultoresag.plaztigram.model.Picture;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {


    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        showToolbar("", false, view);
        RecyclerView pictureRecycler = (RecyclerView) view.findViewById(R.id.pictureProfileRecycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        pictureRecycler.setLayoutManager(linearLayoutManager);
        PictureAdapterRecyclerView pictureAdapterRecyclerView = new PictureAdapterRecyclerView(buildPictures(), R.layout.cardview_picture, getActivity());
        pictureRecycler.setAdapter(pictureAdapterRecyclerView);
        return view;
    }
    public void showToolbar(String title, boolean upButton, View view){
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(title);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

    public ArrayList<Picture> buildPictures(){
        ArrayList <Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("http://www.significado-de-nombres.com/wp-content/uploads/2016/01/nombres-originales-perros-macho.jpg", "Paul", "4 dias", "3 me gusta" ));
        pictures.add(new Picture("http://cdn2.expertoanimal.com/es/images/8/0/7/img_nombres_para_perros_pitbull_6708_600.jpg", "Dario", "2 dias", "2 me gusta" ));
        pictures.add(new Picture("https://2.bp.blogspot.com/-55T3yg-CBi4/VuwvWKzgBQI/AAAAAAAAFH0/5Go1hI4ip9U719i7isbNA3XevELaBYy6g/s1600/perros%2Brottweiler.jpg", "Paul", "2 dias", "10 me gusta" ));
        pictures.add(new Picture("http://cdn2.expertoanimal.com/es/images/8/0/7/img_nombres_para_perros_pitbull_6708_600.jpg", "Dario", "1 dias", "5 me gusta" ));



        return pictures;

    }
}
