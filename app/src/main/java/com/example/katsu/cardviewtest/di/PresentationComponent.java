package com.example.katsu.cardviewtest.di;

import com.example.katsu.cardviewtest.MainActivity;
import com.example.katsu.cardviewtest.RecyclerAdapter;
import com.example.katsu.cardviewtest.WordOfMouth;

import dagger.Component;

/**
 * Created by katsu on 2017/02/21.
 */

@PresentationScope
@Component(modules = {PresentationModule.class})
public interface PresentationComponent {
    void inject(RecyclerAdapter.WordOfMouthViewHolder activity);
}
