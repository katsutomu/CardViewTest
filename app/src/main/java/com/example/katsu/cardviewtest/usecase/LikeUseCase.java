package com.example.katsu.cardviewtest.usecase;

import org.reactivestreams.Subscriber;

import io.reactivex.Observable;
import io.reactivex.Scheduler;

/**
 * Created by katsu on 2017/02/20.
 */

public class LikeUseCase extends UseCase<Integer, Integer> {


    protected LikeUseCase(Scheduler threadExecutor, Scheduler postExecutionThread) {
        super(threadExecutor, postExecutionThread);
    }

    @Override
    protected Observable buildUseCaseObservable(Integer requestValues) {
        return null;
    }
}
