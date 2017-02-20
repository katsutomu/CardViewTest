package com.example.katsu.cardviewtest.usecase;

import io.reactivex.CompletableObserver;
import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/**
 * 基底ユースケースクラス
 * @param <T> リクエストパラメータの型
 */
public abstract class UseCase<T, K> {
    Scheduler threadExecutor;
    Scheduler postExecutionThread;

    protected UseCase(Scheduler threadExecutor,
                        Scheduler postExecutionThread) {
        this.threadExecutor = threadExecutor;
        this.postExecutionThread = postExecutionThread;
    }

    protected abstract Observable buildUseCaseObservable(T requestValues);
    public void execute(T requestValue, Observer<K> observer) {
        this.buildUseCaseObservable(requestValue)
                .subscribeOn(threadExecutor)
                .observeOn(postExecutionThread)
                .subscribe(observer);
    }

}
