package vaquita.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Manager {

    @Column
    private Long c_id;

    @Id
    private Long s_id;

    @Column
    private Long event_id;

    public Manager(){}
    public Manager(Long s_id, Long c_id, Long event_id) {
        this.s_id = s_id;
        this.c_id = c_id;
        this.event_id = event_id;
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

    public void setEvent_id(Long c_id) {
        this.event_id = event_id;
    }


    @Override
    public String toString (){
        return "Manager [c_id=" + c_id + ",s_id=" + s_id + ",event_id=" + event_id + "]";
    }
}
