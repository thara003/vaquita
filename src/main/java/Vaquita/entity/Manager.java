package Vaquita.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Manager {

    @Column
    private Integer c_id;

    @Id
    private Integer s_id;

    @Column
    private Integer event_id;

    public Manager(){}
    public Manager(Integer s_id) {
        this.s_id = s_id;
    }
    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public Integer getEvent_id() {
        return event_id;
    }

    public void setEvent_id(Integer c_id) {
        this.event_id = event_id;
    }


    @Override
    public String toString (){
        return "Manager [c_id=" + c_id + ",s_id=" + s_id + ",event_id=" + event_id + "]";
    }
}
