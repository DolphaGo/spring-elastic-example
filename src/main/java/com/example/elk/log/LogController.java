package com.example.elk.log;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/api/v1")
@RestController
public class LogController {

    @GetMapping("/log")
    public void logTest(@RequestParam(value = "message", required = false) String message) {
        final String msg = StringUtils.hasText(message) ? message : "Please type message";
        log.info("[DolphaGo] logstash log test = {}", msg);
    }
}
