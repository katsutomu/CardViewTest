package com.example.katsu.cardviewtest;

import android.view.View;
import android.widget.Toast;

public class WordOfMouth{
    public String title;
    public void onLikeButton(View view) {
        Toast.makeText(view.getContext(),title+" Clicle",Toast.LENGTH_SHORT).show();
    }
}


