package com.example.snippet.errorSnippet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name = "ErrorSnippet")
@Table
public class ErrorSnippet {
    
    @Id
    @SequenceGenerator(
        name = "errorSnippet_sequence",
        sequenceName = "errorSnippet_sequence",
        allocationSize = 1
    )

    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "errorSnippet_sequence"
    )

    //========================
    //Inst Variables - Columns
    //========================
    @Column(name = "id",
    updatable = false
    )
    
    private Long id;

    @Column(name = "title",
    nullable = false,
    unique = true
)
    private String title;

    @Column(name = "description",
    nullable = false
    )
    private String description;

    @Column(name = "code_snippet",
    nullable = false
    )
    private String codeSnippet;

    @Column(name = "topic",
    nullable = false
    )
    private Integer topic;    

    public ErrorSnippet() {
    }

    public ErrorSnippet( Long id,
                    String title,
                    String description,
                    String codeSnippet//,
                    //Integer topic
                    ){
    this.id = id;
    this.title = title;
    this.description = description;
    this.codeSnippet = codeSnippet;
    //this.topic = topic;
    }

    public ErrorSnippet( String title,
                         String description,
                         String codeSnippet,
                         Integer topic
                         ){
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
        return "ErrorSnipped{" + "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", codesnippet='" +  codeSnippet + '\'' + 
                ", topic='" + topic + '\'' +
                '}';
    }




}
