package com.example.katsu.cardviewtest.usecase;

import org.reactivestreams.Subscriber;

import javax.inject.Inject;
import javax.inject.Named;

import io.reactivex.Completable;
import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableOnSubscribe;
import io.reactivex.Observable;
import io.reactivex.Scheduler;

/**
 * Created by katsu on 2017/02/20.
 */

public class LikeUseCase extends UseCase<Integer, Integer> {


    @Inject public LikeUseCase(@Named("executeScheduler") Scheduler threadExecutor, @Named("postScheduler") Scheduler postScheduler) {
        super(threadExecutor, postScheduler);
    }

    @Override
    protected Observable buildUseCaseObservable(Integer requestValues) {
        return Observable.fromArray(1,2);
    }
}
