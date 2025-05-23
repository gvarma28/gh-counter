package com.example.gh_counter.services;

import com.example.gh_counter.models.CounterResponse;
import com.example.gh_counter.utils.Counter;
import org.springframework.stereotype.Service;

@Service
public class CounterService {

    public CounterResponse count() {
        return Counter.incrementAndGet();
    }

}
