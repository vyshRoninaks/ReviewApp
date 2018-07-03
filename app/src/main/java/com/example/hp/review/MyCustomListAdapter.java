package com.example.hp.review;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

public class MyCustomListAdapter extends ArrayAdapter<Model> {

    Context mCtx;
    int resource;
    List<Model> modelList;
    public MyCustomListAdapter(@NonNull Context mCtx, int resource, @NonNull List<Model> modelList){
        super(mCtx, resource, modelList);
        this.mCtx=mCtx;
        this.resource=resource;
        this.modelList=modelList;

        LayoutInflater inf = LayoutInflater.from(mCtx);




    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater= LayoutInflater.from(mCtx);
        View view=inflater.inflate(R.layout.activity_home,null);
        ImageView imageuser=(ImageView)view.findViewById(R.id.imageuser);
        TextView name=(TextView)view.findViewById(R.id.name);
        TextView text1=(TextView)view.findViewById(R.id.text1);
        TextView movname=(TextView)view.findViewById(R.id.movname);
        TextView text2=(TextView)view.findViewById(R.id.text2);
        TextView location=(TextView)view.findViewById(R.id.location);
        ImageView imagemovie=(ImageView)view.findViewById(R.id.imagemovie);
        TextView film=(TextView)view.findViewById(R.id.film);
        TextView language=(TextView)view.findViewById(R.id.language);
        TextView text3=(TextView)view.findViewById(R.id.text3);
        ImageView imagestar=(ImageView)view.findViewById(R.id.imagestar);
        TextView rate=(TextView)view.findViewById(R.id.rate);
        TextView genre=(TextView)view.findViewById(R.id.genre);
        ImageView image1=(ImageView)view.findViewById(R.id.image1);
        TextView text5=(TextView)view.findViewById(R.id.text5);
        HorizontalScrollView scroll=(HorizontalScrollView)view.findViewById(R.id.scroll);
        RatingBar ratebar=(RatingBar)view.findViewById(R.id.ratebar);
        TextView text6=(TextView)view.findViewById(R.id.text6);
        TextView text7=(TextView)view.findViewById(R.id.text7);
        TextView text8=(TextView)view.findViewById(R.id.text8);
        TextView text9=(TextView)view.findViewById(R.id.text9);
        TextView texttap=(TextView)view.findViewById(R.id.texttap);

        Model model= modelList.get(position);
        imageuser.setImageResource(R.mipmap.ic_launcher_round);
        name.setText(model.getUsername());
        text1.setText("is watching");
        movname.setText(model.getMoviename());
        text2.setText("at");
        location.setText(model.getLocname());
        imagemovie.setImageResource(R.drawable.ic_launcher_background);
        film.setText(model.getMoviename());
        language.setText(model.getMovlang());
        text3.setText(model.getMovdim());
        imagestar.setImageResource(android.R.drawable.btn_star_big_on);
        rate.setText(model.getMovrate());
        genre.setText(model.getMovgenre());
        image1.setImageResource(R.mipmap.ic_launcher_round);
        text5.setText("Rate this movie");
        text6.setText(model.getNumwatch());
        text7.setText("Watched");
        text8.setText(model.getNumrev());
        text9.setText("Reviews");
        texttap.setText("Tap to see all reviews");
        return view;



    }

}
