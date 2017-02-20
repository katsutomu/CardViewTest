package com.example.katsu.cardviewtest;

import android.view.View;

import com.example.katsu.cardviewtest.di.DaggerPresentationComponent;
import com.example.katsu.cardviewtest.di.PresentationComponent;
import com.example.katsu.cardviewtest.usecase.LikeUseCase;

import org.junit.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.schedulers.TestScheduler;

import static org.junit.Assert.*;

/**
 * Created by katsu on 2017/02/21.
 */
public class WordOfMouthTest {
    @Test
    public void onLikeButton() throws Exception {
        WordOfMouth wordOfMouth = new WordOfMouth(new LikeUseCase(Schedulers.io(),Schedulers.io()));
        assertNotNull(wordOfMouth.likeUseCase);
    }
    @Test
    public void TestLike() throws Exception {
        TestScheduler fakeScheduler = new TestScheduler();
        WordOfMouth wordOfMouth = new WordOfMouth(new LikeUseCase(fakeScheduler,fakeScheduler));
        wordOfMouth.like();
        fakeScheduler.advanceTimeBy(1, TimeUnit.SECONDS);
        assertTrue(wordOfMouth.isLiked);
    }
}
