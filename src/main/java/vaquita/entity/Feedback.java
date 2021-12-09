package vaquita.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Feedback{
    @Id

    private Long c_id;
    @Column
    private Long event_id;
    @Column
    private Long feed_val;
    @Column
    private String feedback;
    public Feedback(){}

    public Feedback(Long c_id,Long event_id,Long feed_val,String feedback) {
        this.c_id = c_id;
        this.event_id = event_id;
        this.feed_val= feed_val;
        this.feedback=feedback;


    }
    public Long getC_id() {
        return c_id;
    }

    public void setC_id(Long c_id) {
        this.c_id = c_id;
    }
    public Long getEvent_id() {
        return event_id;
    }

    public void setEvent_id(Long event_id) {
        this.event_id = event_id;
    }
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
    @Override
    public String toString() {
        return "feedback [c_id=" + c_id + ", event_id=" + event_id + ", feed_val=" +feed_val + ",feedback=" +feedback + "]";
    }


}