package com.se.sample.server.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/log2")
public class LoggingController2 {
    private Log log = LogFactory.getLog(LoggingController2.class);

    @GetMapping
    public String log() {
        log.trace("a TRACE level message");
        log.debug("a DEBUG level message");
        log.info("a INFO level message");
        log.warn("a WARN level message");
        log.error("an ERROR level message");
        return "See the log for details \n";
    }
}
