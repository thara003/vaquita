package vaquita.entity;

import javax.persistence.*;

@Entity
public class Billing{
    @Id
    @GeneratedValue
    private int bill_id;

    @Column
    private int billno;
    @Column
    private int amount;
    @Column
    private String paystatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "event_id")
    private Events events;


    public Billing(){}

    public Billing(int billno,int amount,String paystatus, Client client, Events events) {
        this.client = client;
        this.events = events;
        this.billno= billno;
        this.amount=amount;
        this.paystatus=paystatus;
    }

    public int getBillno() {
        return billno;
    }

    public void setBillno(int billno) {
        this.billno = billno;
    }
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
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

    public int getId() {
        return bill_id;
    }


    @Override
    public String toString() {
        return "Billing{" +
                "bill_id=" + bill_id +
                ", billno=" + billno +
                ", amount=" + amount +
                ", paystatus='" + paystatus + '\'' +
                ", client=" + client +
                ", events=" + events +
                '}';
    }


}