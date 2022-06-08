package com.example.snippet.topic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Topic {

    @Id
    @SequenceGenerator(
        name = "topic_sequence",
        sequenceName = "topic_sequence",
        allocationSize = 1
    )

    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "topic_sequence"
    )

    private Long id;
    private String topic;

    public Topic(){

    }

    public Topic(   Long id,
                    String topic){
        this.id = id;
        this.topic = topic;
    }

    public Topic(String topic){
        this.topic = topic;
    }
    //==============================
    //  	Getter and Setters
    //==============================
    //ID
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }
    //TOPIC
    public String getTopic(){
        return topic;
    }

    public void setTopic(String topic){
        this.topic = topic;
    }

    @Override
    public String toString(){
        return "Snipped{" + "id=" + id +
                ", topic='" + topic + '\'' +
                '}';
    }



}

