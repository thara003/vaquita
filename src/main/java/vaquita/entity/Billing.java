package vaquita.entity;

import javax.persistence.*;

@Entity
public class Billing{
    @Id
    @GeneratedValue
    private Long bill_id;
//    private Long c_id;
//    @Column
//    private Long event_id;
    @Column
    private Long billno;
    @Column
    private Float amount;
    @Column
    private String paystatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "event_id")
    private Events events;

    public Billing(){}

    public Billing(Long billno,Float amount,String paystatus, Client client, Events events) {
        this.client = client;
        this.events = events;
        this.billno= billno;
        this.amount=amount;
        this.paystatus=paystatus;
//        this.c_id = c_id;
//        this.event_id = event_id;


    }
//    public Long getC_id() {
//        return c_id;
//    }
//
//    public void setC_id(Long c_id) {
//        this.c_id = c_id;
//    }
//    public Long getEvent_id() {
//        return event_id;
//    }
//
//    public void setEvent_id(Long event_id) {
//        this.event_id = event_id;
//    }
    public Long getBillno() {
        return billno;
    }

    public void setBillno(Long billno) {
        this.billno = billno;
    }
    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }
    public String getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(String paystatus) {
        this.paystatus = paystatus;
    }

    public Events getEvents() {
        return events;
    }

    public void setEvents(Events events) {
        this.events = events;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    public Long getId() {
        return bill_id;
    }

    @Override
    public String toString() {
        return "billing [ billno=" +billno + ",amount=" + amount + ",paystatus=" +paystatus + ",bill_id = "+bill_id+",client="+client+",events="+events+"]";
    }


}