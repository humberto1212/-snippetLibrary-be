package com.example.snippet.snippet;

import java.util.List;
import java.util.Optional;

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

    public void addNewSnippet(Snippet snippet){
        Optional<Snippet> snippetByTitle = snippetRepository.findSnippetByTitle(snippet.getTitle());
        if(snippetByTitle.isPresent()){
            throw new IllegalStateException("The title already exists");
        }
        snippetRepository.save(snippet);
        System.out.println(snippet);
    }

    public void deleteSnippetSe(Long snippetId){
        boolean exists = snippetRepository.existsById(snippetId);
        if (!exists){
            throw new IllegalStateException("ID does not exists");
        }

        snippetRepository.deleteById(snippetId);
    }
    
}
