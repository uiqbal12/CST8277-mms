package com.example.mms;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


//Labeling it as entity annotation to help with data retrievel methods in repo and controller
@Entity
@Table(name = "producers")
public class Producer {

    // labelling as id to assist the CRUD repository extension
    @Id
    private int producer_id;
// setting up getters and setters for the bean properties
    public int getProducer_id() {
        return producer_id;
    }

    public void setProducer_id(int producer_id) {
        this.producer_id = producer_id;
    }
}
