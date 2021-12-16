package vaquita.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Staff {

    @Id
    @GeneratedValue
    private int s_id;

    @Column
    private String s_name;

//    @Column
//    private Integer event_id;

    @Column
    private String s_address;

    @Column
    private String field;

    @Column
    private int salary;

    @Column
    private String progress;

    @Column
    private String s_password;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "event_id")
    private Events events;

    @OneToOne(mappedBy = "staff", fetch = FetchType.LAZY, orphanRemoval = false)
    private  Manager listProjects;

    public Staff(){}

    public Staff ( String s_name, String s_address, String field, int salary, String progress, String s_password, Events events){

        this.s_name = s_name;
//        this.event_id = event_id;
        this.s_address = s_address;
        this.field = field;
        this.salary = salary;
        this.progress = progress;
        this.s_password = s_password;
        this.events = events;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

//    public Integer getEvent_id() {
//        return event_id;
//    }
//
//    public void setEvent_id(Integer event_id) {
//        this.event_id = event_id;
//    }

    public String getS_address() {
        return s_address;
    }

    public void setS_address(String s_address) {
        this.s_address = s_address;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public String getS_password() {
        return s_password;
    }

    public void setS_password(String s_password) {
        this.s_password = s_password;
    }

    public Events getEvents() {
        return events;
    }

    public void setEvents(Events events) {
        this.events = events;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "s_id=" + s_id +
                ", s_name='" + s_name + '\'' +
//                ", event_id=" + event_id +
                ", s_address='" + s_address + '\'' +
                ", field='" + field + '\'' +
                ", salary='" + salary + '\'' +
                ", progress='" + progress + '\'' +
                ", s_password='" + s_password + '\'' +
                ", events=" + events +
                '}';
    }
}
