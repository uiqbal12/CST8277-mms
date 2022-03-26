package com.example.mms;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "subscriptions")
public class Subscription {
    @Id
    private String subscriber_id;
    private String producer_id;

    public String getSubscriber_id() {
        return subscriber_id;
    }

    public void setSubscriber_id(String subscriberid) {
        this.subscriber_id = subscriberid;
    }

    public String getProducer_id() {
        return producer_id;
    }

    public void setProducer_id(String producer_id) {
        this.producer_id = producer_id;
    }
}
