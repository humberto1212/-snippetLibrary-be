package com.example.snippet.snippet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @CrossOrigin
    @GetMapping
	public List<Snippet> getSnippetCo() {
        return snippetService.getSnippet(); 
	}

    @CrossOrigin
    @PostMapping
    public void registerNewSnippet(@RequestBody Snippet snippet){
        snippetService.addNewSnippet(snippet);
    }

    @CrossOrigin
    @DeleteMapping(path = "{snippetId}")
    public void deleteSnippet(@PathVariable("snippetId") long snippetId){
        snippetService.deleteSnippetSe(snippetId);
    }
    
}
