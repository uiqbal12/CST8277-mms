package com.example.mms;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


//Labelling with Entity annotation to assist with data retreival methods specified in repo and controller
@Entity
@Table(name = "subscribers")
public class Subscriber {

    // CRUD repository requirement to have an id for bean classes to use its methods
    @Id
    private String subscriber_id;


    // setting up getters and setters

    public String getSubscriber_id() {
        return subscriber_id;
    }

    public void setSubscriber_id(String subscriber_id) {
        this.subscriber_id = subscriber_id;
    }
}
