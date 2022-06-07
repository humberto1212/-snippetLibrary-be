package com.example.snippet.snippet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/snippet")
public class SnippetController {

    private final SnippetService snippetService;

    @Autowired
    public SnippetController(SnippetService snippetService){
        this.snippetService = snippetService;
    }

    @GetMapping
	public List<Snippet> getSnippetCo() {
        return snippetService.getSnippet(); 
	}
    
}
