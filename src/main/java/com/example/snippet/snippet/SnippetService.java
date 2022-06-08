package com.example.snippet.snippet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SnippetService {

    private final SnippetRepository snippetRepository;

    @Autowired
    public SnippetService(SnippetRepository snippetRepository){
        this.snippetRepository = snippetRepository;
    }

    public List<Snippet> getSnippet() {
		return snippetRepository.findAll();
	}
    
}
