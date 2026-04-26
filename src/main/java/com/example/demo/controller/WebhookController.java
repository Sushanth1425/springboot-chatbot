package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Message;
import com.example.demo.service.ChatService;

@RestController
public class WebhookController {
  @Autowired
  private ChatService chatService;

  @PostMapping("/webhook")
  public Map<String, String>receiveMsg(@RequestBody Message msg){
    String reply= chatService.getReply(msg.getMsg());
    System.out.println("Message: " + msg.getMsg() + " \nReply: " + reply);

    Map<String, String> map= new HashMap<>();
    map.put("reply", reply);

    return map;
  }
}
