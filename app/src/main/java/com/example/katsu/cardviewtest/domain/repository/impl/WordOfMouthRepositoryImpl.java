package com.example.katsu.cardviewtest.domain.repository.impl;

import com.example.katsu.cardviewtest.domain.WordOfMouthEntity;
import com.example.katsu.cardviewtest.domain.repository.WordOfMouthRepository;

public class WordOfMouthRepositoryImpl implements WordOfMouthRepository {

    @Override
    public WordOfMouthEntity getById(int id) {
        return new WordOfMouthEntity();
    }
}
