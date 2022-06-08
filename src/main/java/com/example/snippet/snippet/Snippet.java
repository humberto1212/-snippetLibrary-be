package com.example.snippet.snippet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Snippet {

    @Id
    @SequenceGenerator(    
    name = "snippet_sequence",
    sequenceName = "snippet_sequence",
    allocationSize = 1
    )

    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "snippet_sequence"
    )


    private Long id;
    private String title;
    private String description;
    private String codeSnippet;
    private Integer topic;

    public Snippet() {
    }

    public Snippet( Long id,
                    String title,
                    String description,
                    String codeSnippet,
                    Integer topic){
        this.id = id;
        this.title = title;
        this.description = description;
        this.codeSnippet = codeSnippet;
        this.topic = topic;
    }

    public Snippet( String title,
                    String description,
                    String codeSnippet,
                    Integer topic){
        this.title = title;
        this.description = description;
        this.codeSnippet = codeSnippet;
        this.topic = topic;
    }  
    //==============================
    //  	Getter and Setters
    //==============================
    //ID
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }
    //TITLE
    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
    //DESCRIPTION
    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }
    //CODESNIPPET
    public String getCodeSnippet(){
        return codeSnippet;
    }

    public void setCodeSnippet(String codeSnippet){
        this.codeSnippet = codeSnippet;
    }
    //TOPIC
    public Integer getTopic(){
        return topic;
    }

    public void setTopic(Integer topic){
        this.topic = topic;
    }

    @Override
    public String toString(){
        return "Snipped{" + "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", codesnippet='" +  codeSnippet + '\'' + 
                ", topic='" + topic + '\'' +
                '}';
    }

}
