package com.example.gh_counter.controllers;

import com.example.gh_counter.models.CounterResponse;
import com.example.gh_counter.services.CounterService;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
public class CounterController {

    private static final Logger logger = LoggerFactory.getLogger(CounterController.class);

    private final CounterService counterService;

    public CounterController() {
        counterService = new CounterService();
    }

    @GetMapping(value = "/count-me", produces = MediaType.APPLICATION_JSON_VALUE)
    public CounterResponse count(HttpServletRequest request) {
        Enumeration<String> headerNames = request.getHeaderNames();
        Map<String, String> headers = new HashMap<>();

        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            String headerValue = request.getHeader(headerName);
            headers.put(headerName, headerValue);
        }

        UUID request_id = UUID.randomUUID();

        logger.info("request_id - {}, request_headers - {}", request_id, headers);
        CounterResponse response = counterService.count();
        logger.info("request_id - {}, response - {}", request_id, response);

        return response;
    }

}
