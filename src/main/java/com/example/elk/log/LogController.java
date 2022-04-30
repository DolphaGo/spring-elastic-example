package com.example.elk.log;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/api/v1")
@RestController
public class LogController {

    @GetMapping("/log")
    public String get(@RequestParam(value = "message", required = false) String message) {
        final String msg = StringUtils.hasText(message) ? message : "Please type message";
        log.info("[GET] message = {}", msg);
        return msg;
    }

    @PostMapping("/log")
    public String post(@RequestParam(value = "message", required = false) String message) {
        final String msg = StringUtils.hasText(message) ? message : "Please type message";
        log.info("[POST] message = {}", msg);
        return msg;
    }

    @PutMapping("/log")
    public String put(@RequestParam(value = "message", required = false) String message) {
        final String msg = StringUtils.hasText(message) ? message : "Please type message";
        log.info("[PUT] message = {}", msg);
        return msg;
    }

    @DeleteMapping("/log")
    public String delete(@RequestParam(value = "message", required = false) String message) {
        final String msg = StringUtils.hasText(message) ? message : "Please type message";
        log.info("[DELETE] message = {}", msg);
        return msg;
    }

    @GetMapping("/ex")
    public String exception() {
        throw new IllegalArgumentException("exception 발생!");
    }
}
