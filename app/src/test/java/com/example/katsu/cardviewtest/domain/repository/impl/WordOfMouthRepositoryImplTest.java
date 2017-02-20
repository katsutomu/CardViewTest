package com.example.katsu.cardviewtest.domain.repository.impl;

import com.example.katsu.cardviewtest.domain.WordOfMouthEntity;
import com.example.katsu.cardviewtest.domain.repository.WordOfMouthRepository;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by katsu on 2017/02/20.
 */
public class WordOfMouthRepositoryImplTest {

    @Test
    public void getById() throws Exception {
        WordOfMouthRepository wordOfMouthRepository =  new WordOfMouthRepositoryImpl();
        WordOfMouthEntity entity = wordOfMouthRepository.getById(0);
        assertNotNull(entity);
    }

}