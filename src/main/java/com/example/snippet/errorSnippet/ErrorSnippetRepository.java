package com.example.snippet.errorSnippet;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ErrorSnippetRepository extends JpaRepository<ErrorSnippet, Long>{
    @Query("SELECT s FROM ErrorSnippet s WHERE s.title = ?1")
    Optional<ErrorSnippet> findErrorSnippetByTitle(String title);
    
}
