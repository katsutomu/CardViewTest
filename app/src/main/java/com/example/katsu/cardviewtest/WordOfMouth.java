package com.example.katsu.cardviewtest;

import android.app.Presentation;
import android.view.View;
import android.widget.Toast;

import com.example.katsu.cardviewtest.di.DaggerPresentationComponent;
import com.example.katsu.cardviewtest.usecase.LikeUseCase;

import javax.inject.Inject;

import io.reactivex.observers.DisposableObserver;

public class WordOfMouth{
    public String title;
    public boolean isLiked;
    LikeUseCase likeUseCase;
    @Inject public WordOfMouth(LikeUseCase likeUseCase) {
        this.likeUseCase = likeUseCase;
    }

    public void like() {
        DisposableObserver<Integer> observer = new DisposableObserver<Integer>() {

            @Override
            public void onNext(Integer value) {
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {
                isLiked = true;
            }
        };
        this.likeUseCase.execute(Integer.valueOf(1), observer);
    }

    public void onLikeButton(View view) {
        Toast.makeText(view.getContext(),title+" Clicle",Toast.LENGTH_SHORT).show();
    }
}


