package com.example.gh_counter.utils;

import com.example.gh_counter.models.CounterResponse;

import java.time.Instant;
import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private static final AtomicInteger COUNT = new AtomicInteger(0);
    private static final Instant startedAt = Instant.now();

    private Counter() {}

    public static CounterResponse incrementAndGet() {
        return new CounterResponse(COUNT.incrementAndGet(), startedAt);
    }
}
