package com.example.snippet.snippet;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SnippetService {
    public List<Snippet> getSnippet() {
		return List.of(
			new Snippet(
				1L,
				"new snipped",
				"this is a new snipped",
				"{}",
				2
			)
		);
	}
    
}
