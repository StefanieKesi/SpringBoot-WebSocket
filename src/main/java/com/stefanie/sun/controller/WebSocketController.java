package com.stefanie.sun.controller;

import com.stefanie.sun.model.Message;
import com.stefanie.sun.model.Response;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public Response say(Message message) throws Exception {

        Thread.sleep(1000);
        return new Response("Welcome, " + message.getName());
    }
}
