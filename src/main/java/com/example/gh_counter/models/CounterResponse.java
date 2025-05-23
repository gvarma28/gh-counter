package com.example.gh_counter.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.Instant;

@Data
@AllArgsConstructor
public class CounterResponse {
    private int count;
    private Instant startedAt;
//
//    public CounterResponse(int count, Instant startedAt) {
//        this.count = count;
//        this.startedAt = startedAt;
//    }
//
//    public int getCount() {
//        return count;
//    }
//
//    public Instant getStartedAt() {
//        return startedAt;
//    }
}
