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
    private String staffs;

    public Events(){}

    
}
