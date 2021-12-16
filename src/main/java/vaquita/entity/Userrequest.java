package vaquita.entity;

import javax.persistence.*;


@Entity
public class Userrequest   {
    @Id
    @GeneratedValue
    private int rqst_id;
    @Column
    private String req_status;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "event_id")
    private Events events;

    public Userrequest(){}

    public Userrequest(String req_status, Client client, Events events) {
        this.req_status=req_status;
        this.client = client;
        this.events = events;
    }
    public int getId() {
        return rqst_id;
    }

    public String getReq_status() {
        return req_status;
    }

    public void setReq_status(String req_status) {
        this.req_status = req_status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Events getEvents() {
        return events;
    }

    public void setEvents(Events events) {
        this.events = events;
    }

    @Override
    public String toString() {
        return "Userrequest{" +
                "rqst_id=" + rqst_id +
                ", req_status='" + req_status + '\'' +
                ", client=" + client +
                ", events=" + events +
                '}';
    }


}