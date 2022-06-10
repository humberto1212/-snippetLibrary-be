package com.example.snippet.topic;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity(name = "Topic")
@Table
public class Topic {

    @Id
    @SequenceGenerator(
        name = "topic_sequence",
        sequenceName = "topic_sequence",
        allocationSize = 1
    )

    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "topic_sequence"
    )

    //========================
    //Inst Variables - Columns
    //========================
    @Column(name = "id",
            updatable = false
    )
    private Long id;

    @Column(name = "topic",
    nullable = false,
    unique = true
    )
    private String topic;

    
    //@OneToOne( mappedBy = "topic")
    //@JoinColumn(name = "topic_id", referencedColumnName = "id") 
/*     @OneToOne
    @PrimaryKeyJoinColumn
    private Snippet snippet; */

    public Topic(){

    }

    public Topic(   Long id,
                    String topic){
        this.id = id;
        this.topic = topic;
    }

    public Topic(String topic){
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
    //TOPIC
    public String getTopic(){
        return topic;
    }

    public void setTopic(String topic){
        this.topic = topic;
    }
    //SNIPPET TA
  /*       public Snippet getSnippet(){
        return snippet;
    }

    public void setSnippet(Snippet snippet){
        this.snippet = snippet;
    }    */

  @Override
    public String toString(){
        return "Topic{" + "id=" + id +
                ", topic='" + topic + '\'' +
                '}';
    } 

}

