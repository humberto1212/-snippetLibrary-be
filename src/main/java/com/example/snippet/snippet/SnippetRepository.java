package com.example.snippet.snippet;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SnippetRepository extends JpaRepository<Snippet, Long>{
    
    @Query("SELECT s FROM Snippet s WHERE s.title = ?1")
    Optional<Snippet> findSnippetByTitle(String title);
    
}
