package com.example.mms;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import java.util.List;


public interface ProducerMessageRepository extends CrudRepository<Message, Integer> {


    /* Setting up method to retrieve messages for specific proer id */
    @Query("FROM Message WHERE producer_id = ?1")
    List<Message> findMessageByProducerId(int producer_id);

}
