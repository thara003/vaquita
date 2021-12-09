package vaquita.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Billing{
    @Id

    private Long c_id;
    @Column
    private Long event_id;
    @Column
    private Long billno;
    @Column
    private Float amount;
    @Column
    private String paystatus;
    public Billing(){}

    public Billing(Long c_id,Long event_id,Long billno,Float amount,String paystatus) {
        this.c_id = c_id;
        this.event_id = event_id;
        this.billno= billno;
        this.amount=amount;
        this.paystatus=paystatus;


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
    @Override
    public String toString() {
        return "billing [c_id=" + c_id + ", event_id=" + event_id + ", billno=" +billno + ",amount=" + amount + ",paystatus=" +paystatus + "]";
    }


}