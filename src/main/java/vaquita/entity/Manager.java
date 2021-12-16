package vaquita.entity;

import javax.persistence.*;

@Entity
public class Manager {
    @Id
    @GeneratedValue
    private Integer man_id;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "event_id")
    private Events events;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "s_id")
    private Staff staff;

    public Manager(){}
    public Manager(Client client, Events events, Staff staff) {
        this.client = client;
        this.events = events;
        this.staff = staff;


    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setEvents(Events events) {
        this.events = events;
    }

    public Events getEvents() {
        return events;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Integer getId() {
        return man_id;
    }



        @Override
    public String toString (){
        return "Manager [ client=" +client +",events"+events+",staff="+staff+",man_id="+ man_id + "]";
    }
}
