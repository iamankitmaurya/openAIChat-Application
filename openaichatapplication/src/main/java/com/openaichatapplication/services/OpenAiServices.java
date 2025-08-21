package com.openaichatapplication.services;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OpenAiServices {
    @Autowired
    private ChatModel chatModel;

    public String getResult(String question){


        ChatResponse response = chatModel.call( new Prompt(question));
        if(response != null) {
            response.getResult();
            return response.getResult().getOutput().getText();

        }

        return "No content found";

    }

}
