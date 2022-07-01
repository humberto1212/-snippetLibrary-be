package com.example.snippet.errorSnippet;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ErrorSnipetService {

    private final ErrorSnippetRepository errorSnippetRepository;
    
    @Autowired
    public ErrorSnipetService(ErrorSnippetRepository errorSnippetRepository){
        this.errorSnippetRepository = errorSnippetRepository;
    }

    public List<ErrorSnippet> getErrorSnippetSe() {
        return errorSnippetRepository.findAll();
    }

    public void addNewErrorSnippetSe(ErrorSnippet errorSnippet) {

        Optional<ErrorSnippet> errorSnippetByTitle = errorSnippetRepository.findErrorSnippetByTitle(errorSnippet.getTitle());

        if(errorSnippetByTitle.isPresent()){
            throw new IllegalStateException("The title already exists");
        }
        errorSnippetRepository.save(errorSnippet);
        System.out.println(errorSnippet);
    }

    public void deleteErrorSnippetSe(Long errorSnippetId){
        boolean exists = errorSnippetRepository.existsById(errorSnippetId);
        if (!exists){
            throw new IllegalStateException("ID does not exists");
        }

        errorSnippetRepository.deleteById(errorSnippetId);
    }


}
