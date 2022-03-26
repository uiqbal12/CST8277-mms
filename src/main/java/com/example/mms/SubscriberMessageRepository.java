package com.example.mms;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface SubscriberMessageRepository extends CrudRepository<Message, Integer> {

    /*Query takes an input of subscriber_id to retrieve all messages related to specific subscriber, it then performs a join
     from subscribers to the next logical table which was the subscription and matches on subscriber id, it then joins with producers
     on the producer id column as that is what they have in common and finally it will join the messages table on producer id to successfuly retrieve us
     the messages for the specified subscriber_id
     */

    @Query(value = "SELECT mms.messages.id, mms.messages.content, mms.messages.created, mms.messages.producer_id  " +
            " FROM subscribers " +
            "INNER JOIN mms.subscriptions ON mms.subscribers.subscriber_id = mms.subscriptions.subscriber_id " +
            "INNER JOIN mms.producers ON mms.subscriptions.producer_id = mms.producers.producer_id " +
            "INNER JOIN mms.messages ON mms.producers.producer_id = mms.messages.producer_id " +
            "WHERE mms.subscribers.subscriber_id = ?1", nativeQuery = true)
    List<Message> getAllMessagesForSpecificSubscriber(int subscriber_id);


}
