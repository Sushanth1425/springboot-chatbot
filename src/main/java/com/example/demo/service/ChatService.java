package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {
  public String getReply(String msg){
    if (msg==null) return "Invalid Message";

    msg= msg.toLowerCase().trim();

    switch (msg) {
      case "hi":
        return "Hello, I'm ChatBot";

      case "hello":
      case "hey":
        return "Hi there!";

      case "bye":
        return "Goodbye";

      default:
        return "I don't understand";
    }
  }
}
