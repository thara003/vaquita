package vaquita.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Events {

    @Id
    @GeneratedValue
    private int event_id;

    @Column
    private int c_id;

    @Column
    private String event_name;

    @Column
    private String subevent;

    @Column
    private Date event_date;

    @Column
    private String priority;

    @Column
    private String destination;

    @Column
    private String dest_city;

    @Column
    private Integer dest_zip;

    @Column
    private String staffs;

    public Events(){}

    public Events (int c_id, String event_name, String subevent, Date event_date, String priority, String destination, String dest_city, Integer dest_zip, String staffs){
        this.c_id = c_id;
        this.event_name = event_name;
        this.subevent = subevent;
        this.event_date = event_date;
        this.priority = priority;
        this.destination = destination;
        this.dest_city = dest_city;
        this.dest_zip = dest_zip;
        this.staffs = staffs;
    }
    public int getId() {
        return event_id;
    }

    public int getC_id() {
        return c_id;
    }
    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public String getSubevent() {
        return subevent;
    }

    public void setSubevent(String subevent) {
        this.subevent = subevent;
    }

    public Date getEvent_date() {
        return event_date;
    }

    public void setEvent_date(Date event_date) {
        this.event_date = event_date;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDest_city() {
        return dest_city;
    }

    public void setDest_city(String dest_city) {
        this.dest_city = dest_city;
    }

    public Integer getDest_zip(Integer dest_zip){
        return dest_zip ;
    }

    public String getStaffs() {
        return staffs;
    }

    public void setStaffs(String staffs) {
        this.staffs = staffs;
    }

    @Override
    public String toString (){
        return "Events [c_id=" + c_id + ",event_name=" + event_name + ",event_id=" + event_id + "subevent=" + subevent +"event_date" + event_date + "priority=" + priority + "destination=" + destination +"dest_city=" + dest_city + "dest_zip=" + dest_zip + "staffs=" + staffs +"]";
    }
}
