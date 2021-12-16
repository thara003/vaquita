package vaquita.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;


@Entity

public class Client {

    @Id
    @GeneratedValue
    private int c_id;

    @Column
    private String c_name;

    @Column
    private String c_mail;

    @Column(length = 10)
    private int c_contact;
    @Column
    private String c_address;
    @Column
    private String c_city;
    @Column(length = 6)
    private Integer c_zip;
    @Column
    private String c_username;
    @Column
    private String c_password;

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<Events> listEvents = new ArrayList<>();

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<Userrequest> listUserrequest = new ArrayList<>();

    public Client() {
    }

    public Client(String c_name, String c_mail, int c_contact, String c_address, String c_city, Integer c_zip, String c_username, String c_password) {
        this.c_name = c_name;
        this.c_mail = c_mail;
        this.c_contact = c_contact;
        this.c_address = c_address;
        this.c_city = c_city;
        this.c_zip = c_zip;
        this.c_username = c_username;
        this.c_password = c_password;
    }

    public int getC_id() {
        return c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getC_mail() {
        return c_mail;
    }

    public void setC_mail(String c_mail) {
        this.c_mail = c_mail;
    }

    public int getC_contact() {
        return c_contact;
    }

    public void setC_contact(int c_contact) {
        this.c_contact = c_contact;
    }

    public String getC_address() {
        return c_address;
    }

    public void setC_address(String c_address) {
        this.c_address = c_address;
    }

    public String getC_city() {
        return c_city;
    }

    public void setC_city(String c_city) {
        this.c_city = c_city;
    }

    public Integer getC_zip() {
        return c_zip;
    }

    public void setC_zip(Integer c_zip) {
        this.c_zip = c_zip;
    }

    public String getC_username() {
        return c_username;
    }

    public void setC_username(String c_username) {
        this.c_username = c_username;
    }

    public String getC_password() {
        return c_password;
    }

    public void setC_password(String c_password) {
        this.c_password = c_password;
    }

    public List<Events> getListEvents() {
        return listEvents;
    }

    public void addEvents(Events events) {
        listEvents.add(events);
    }

    public void removeEvents(Events events) {
        listEvents.remove(events);
    }

    public List<Userrequest> getListUserrequest() {
        return listUserrequest;
    }


    public void addUserrequest(Userrequest userrequest) {
        listUserrequest.add(userrequest);
    }

    public void removeUserrequest(Userrequest userrequest) {
        listUserrequest.remove(userrequest);
    }


    public void setListEvents(List<Events> listEvents) {
        this.listEvents = listEvents;
    }

    public void setListUserrequest(List<Userrequest> listUserrequest) {
        this.listUserrequest = listUserrequest;
    }

    @Override
    public String toString() {
        return "Client{" + "c_id=" + c_id + ", c_name=" + c_name + ", c_mail=" + c_mail + ", c_contact=" + c_contact + ", c_address=" + c_address + ", c_city=" + c_city + ", c_zip=" + c_zip + ", c_username=" + c_username + ", c_password=" + c_password + '}';
    }

}
