package com.example.mms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



/*This controller class pertains to the ProducerMessage and get all messages queries specified in the assignment, use is made of methods
* which are set up in the ProducerMessageRepository which allow this service to retrieve all the messages in the database
* as well as the messages by a specific producer and this query is performed with an argument of producer_id  */

@RestController
public class ProducerMessageController {

    @Autowired
    ProducerMessageRepository msgRepository;


    // Mapping for retrieving all the messages stored in the database
    @GetMapping("/allmessages")
    public @ResponseBody
    Iterable<Message> getAllMessages() {
        return msgRepository.findAll();
    }


//Method for retrieving all the messages related to a specific producer
    @GetMapping("/producermessages")
    public @ResponseBody
    Iterable<Message> getMessagesForProducer(@RequestParam int producer_id) {
        return msgRepository.findMessageByProducerId(producer_id);
    }



}
