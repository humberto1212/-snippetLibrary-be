package com.example.snippet.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    private final TopicRepository topicRepository;

    @Autowired
    public TopicService(TopicRepository topicRepository){
        this.topicRepository = topicRepository;
    }

    public List<Topic> getTopic() {
        return topicRepository.findAll();
    }

    public void addNewTopic(Topic topic){
        Optional<Topic> topicByName = topicRepository.findTopicByName(topic.getTopic());
        if (topicByName.isPresent()){
            throw new IllegalStateException("The name already exists");
        }

        topicRepository.save(topic);
        System.out.println(topic);
    }
    
}
