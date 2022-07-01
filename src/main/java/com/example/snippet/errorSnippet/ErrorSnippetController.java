package com.example.snippet.errorSnippet;

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
@RequestMapping(path = "api/errorSnippet")
public class ErrorSnippetController {

    private final ErrorSnipetService errorSnipetService;

    @Autowired
    public ErrorSnippetController(ErrorSnipetService errorSnipetService){
        this.errorSnipetService = errorSnipetService;
    }

    @CrossOrigin
    @GetMapping
    public List<ErrorSnippet> getErrorSnippetCo() {
        return errorSnipetService.getErrorSnippetSe();
    }

    @CrossOrigin
    @PostMapping
    public void registerNewErrorSnippet(@RequestBody ErrorSnippet errorSnippet){
        errorSnipetService.addNewErrorSnippetSe(errorSnippet);
    }

    @CrossOrigin
    @DeleteMapping(path = "{snippetId}")
    public void deleteSnippet(@PathVariable("ErrorSnippetId") long errorSnippetId){
        errorSnipetService.deleteErrorSnippetSe(errorSnippetId);
    }

    
}
