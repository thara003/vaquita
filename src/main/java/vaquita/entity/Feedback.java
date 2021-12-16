package vaquita.entity;

import javax.persistence.*;

@Entity
public class Feedback{
    @Id
    @GeneratedValue
    private Integer feed_id;

    @Column
    private String feed_val;
    @Column
    private String feedback;

    @Column
    private String email_address;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;


    public Feedback() {
    }

    public Feedback(String feed_val, String feedback, String email_address,Client client) {
        this.feed_val = feed_val;
        this.feedback = feedback;
        this.email_address = email_address;
        this.client = client;
//        this.events = events;
    }

    public Integer getFeed_id() {
        return feed_id;
    }


    public String getFeed_val() {
        return feed_val;
    }

    public void setFeed_val(String feed_val) {
        this.feed_val = feed_val;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }



    @Override
    public String toString() {
        return "Feedback{" +
                "feed_id=" + feed_id +
                ", feed_val='" + feed_val + '\'' +
                ", feedback='" + feedback + '\'' +
                ", email_address='" + email_address + '\'' +
                ", client=" + client +
//                ", events=" + events +
                '}';
    }

}