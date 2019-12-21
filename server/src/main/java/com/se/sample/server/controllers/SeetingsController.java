package com.se.sample.server.controllers;


import com.se.sample.server.ServerApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/my-settings")
public class SeetingsController {
    private static final Logger logger = LoggerFactory.getLogger(ServerApplication.class);

    // config client перекрывает стандартные проперти
    @Value("${spring.cloud.config.server}")
    private  static String welcomeMessage;


    @Value("${spring.cloud.config.server.git.uri}")
    private String gitPath;

    /**
     *
     * @return
     */
    @GetMapping("/message")
    public String defMessage(){
        return  welcomeMessage;
    }


    @GetMapping("/git")
    public String gitPath (){
        return  gitPath;
    }
}
