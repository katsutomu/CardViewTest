package com.example.katsu.cardviewtest.usecase;

import org.junit.Test;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.observers.TestObserver;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.schedulers.TestScheduler;

import static org.junit.Assert.*;

/**
 * Created by katsu on 2017/02/20.
 */
public class UseCaseTest {
    @Test
    public void TestExecute() throws Exception {
        TestObserver<Integer> observer = new TestObserver<>();
        TestUseCase useCase = new TestUseCase(Schedulers.io(),Schedulers.single());
        useCase.execute(Integer.valueOf(1), observer);
        observer.assertSubscribed();
        observer.await();
        observer.assertResult(1,2);
    }

    class TestUseCase extends UseCase<Integer, Integer> {

        protected TestUseCase(Scheduler threadExecutor, Scheduler postExecutionThread) {
            super(threadExecutor, postExecutionThread);
        }

        @Override
        protected Observable buildUseCaseObservable(Integer requestValues) {
            Integer[] names = {1,2};
            return Observable.fromArray(names);
        }
    }
}