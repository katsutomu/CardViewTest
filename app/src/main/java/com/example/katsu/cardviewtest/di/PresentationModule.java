package com.example.katsu.cardviewtest.di;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

@Module
public class PresentationModule {

    @Provides
    @PresentationScope
    @Named("executeScheduler")
    public Scheduler provideExecutionScheduler() {
        return Schedulers.io();
    }

    @Provides
    @PresentationScope
    @Named("postScheduler")
    public Scheduler providePostScheduler() {
        return AndroidSchedulers.mainThread();
    }
}
