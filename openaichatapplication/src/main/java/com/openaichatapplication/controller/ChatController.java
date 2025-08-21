package com.openaichatapplication.controller;

import com.openaichatapplication.services.OpenAiServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {
    @Autowired
    private OpenAiServices openAiServices;

    public ChatController(OpenAiServices openAiServices) {
        this.openAiServices = openAiServices;
    }

    @GetMapping("/ai")
    public String getAnswer(@RequestParam String question){

        return  openAiServices.getResult(question);
    }
}
