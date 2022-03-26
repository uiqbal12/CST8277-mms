package com.example.mms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubscriberMessageController {

    @Autowired
    SubscriberMessageRepository submsgRepository;



//Mapping for retrieving the messages for specific subscriber_id, the method was elaborated in the Repository
    @GetMapping("/subscribermessages")
    public @ResponseBody
    List<Message> getAllMessagesForSubscriber (@RequestParam int subscriber_id){
        return submsgRepository.getAllMessagesForSpecificSubscriber(subscriber_id);
    }

}