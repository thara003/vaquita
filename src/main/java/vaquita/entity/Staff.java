package vaquita.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Staff {

    @Id
    @GeneratedValue
    private int s_id;

    @Column
    private String s_name;

    @Column
    private Integer event_id;

    @Column
    private String s_address;

    @Column
    private String field;

    @Column
    private String salary;

    @Column
    private String progress;

    @Column
    private String s_password;

    public Staff(){}

    public Staff (int s_id, String s_name, Integer event_id, String s_address, String field, String salary, String progress, String s_password){
        this.s_id = s_id;
        this.s_name = s_name;
        this.event_id = event_id;
        this.s_address = s_address;
        this.field = field;
        this.salary = salary;
        this.progress = progress;
        this.s_password = s_password;
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

    public Integer getEvent_id() {
        return event_id;
    }

    public void setEvent_id(Integer event_id) {
        this.event_id = event_id;
    }

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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
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

    @Override
    public String toString (){
        return "Staff [s_id=" + s_id + ",s_name=" + s_name + ",event_id=" + event_id + "s_address=" + s_address +"field" + field + "salary=" + salary + "progress=" + progress +"s_password=" + s_password + "]";
    }
}
