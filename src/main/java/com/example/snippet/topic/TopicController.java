package com.example.snippet.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/topic")
public class TopicController {

    private final TopicService topicService;

    @Autowired
    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }

    @CrossOrigin
    @GetMapping
    public List<Topic> getTopicCo(){
        return topicService.getTopic();
    }

    @CrossOrigin
    @PostMapping
    public void registerNewTopic(@RequestBody Topic topic){
        topicService.addNewTopic(topic);
    } 
    
}
