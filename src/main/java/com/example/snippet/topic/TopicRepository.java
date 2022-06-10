package com.example.snippet.topic;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Long>{

    @Query("SELECT s FROM Topic s WHERE s.topic = ?1")
    Optional<Topic> findTopicByName(String topic);
    
}
