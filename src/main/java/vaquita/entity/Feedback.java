package vaquita.entity;

import javax.persistence.*;

@Entity
public class Feedback{
    @Id
    @GeneratedValue
    private Long feed_id;

//    private Long c_id;
//    @Column
//    private Long event_id;
    @Column
    private Long feed_val;
    @Column
    private String feedback;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "event_id")
//    private Events events;
     @OneToOne(fetch = FetchType.LAZY)
     @JoinColumn(name = "event_id")
     private Events events;

    public Feedback(){}

    public Feedback(Long feed_val,String feedback,Client client, Events events) {

//        this.c_id = c_id;
//        this.event_id = event_id;
        this.feed_val= feed_val;
        this.feedback=feedback;
//        this.feed_id = feed_id;
        this.client = client;
        this.events = events;


    }

//    public void setC_id(Long c_id) {
//        this.c_id = c_id;
//    }
//
//    public Long getC_id() {
//        return c_id;
//    }

//    public void setEvent_id(Long event_id) {
//        this.event_id = event_id;
//    }
//
//    public Long getEvent_id() {
//        return event_id;
//    }

    public Long getFeed_val() {
        return feed_val;
    }

    public void setFeed_val(Long feed_val) {
        this.feed_val = feed_val;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setEvents(Events events) {
        this.events = events;
    }

    public Events getEvents() {
        return events;
    }

    public Long getId() {
        return feed_id;
    }



    @Override
    public String toString() {
        return "feedback [  feed_val=" +feed_val + ",feedback=" +feedback + ",feed_id="+feed_id +",client = "+ client+",events="+events+"]";
    }


}