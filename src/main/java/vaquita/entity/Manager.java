package vaquita.entity;

import javax.persistence.*;

@Entity
public class Manager {
    @Id
    @GeneratedValue
    private Integer man_id;

//    @Column
//    private Long c_id;
//
//    @Column
//    private Long s_id;
//
//    @Column
//    private Long event_id;

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

//        this.c_id = c_id;
//        this.event_id = event_id;
//        this.s_id = s_id;
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




    //    public Long getEvent_id() {
//        return event_id;
//    }
//
//    public void setEvent_id(Long event_id) {
//        this.event_id = event_id;
//    }
//
//    public Long getC_id() {
//        return c_id;
//    }
//
//    public void setC_id(Long c_id) {
//        this.c_id = c_id;
//    }
//
//    public void setS_id(Long s_id) {
//        this.s_id = s_id;
//    }
//
//    public Long getS_id() {
//        return s_id;
//    }
        @Override
    public String toString (){
        return "Manager [ client=" +client +",events"+events+",staff="+staff+",man_id="+ man_id + "]";
    }
}
