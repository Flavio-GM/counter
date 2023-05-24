package br.gama.counter.service;

import org.springframework.stereotype.Service;

@Service
public class CounterService {

    private int count = 0;

    public int getCounter() {
        return ++count;
    }
}
