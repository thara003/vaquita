package Vaquita.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private int c_id;
    @Column
    private String c_name;
    @Column
    private String c_mail;
    @Column
    private Integer c_contact;
    @Column
    private String c_address;
    @Column
    private String c_username;
    @Column
    private String c_password;


    public Client() {}

    public Client(String c_name) {
        this.c_name = c_name;
    }

    public String getName() {
        return c_name;
    }

    public void setName(String c_name) {
        this.c_name = c_name;
    }

    public int getId() {
        return c_id;
    }

    public String getMail() {
        return c_mail;
    }

    public void setMail(String c_mail) {
        this.c_mail = c_mail;
    }

    public Integer getContact() {
        return c_contact;
    }

    public void setContact(Integer c_contact) {
        this.c_contact = c_contact;
    }

    public String getAddress() {
        return c_address;
    }

    public void setAddress(String c_address) {
        this.c_address = c_address;
    }

    public String getUser() {
        return c_username;
    }

    public void setUser(String c_username) {
        this.c_username = c_username;
    }

    public String getPass() { return c_password;}

    public void setPass(String c_password) {
        this.c_password = c_password;
    }


    @Override
    public String toString() {
        return "client [c_id=" + c_id + ", c_name=" + c_name + ", c_mail=" + c_mail + ",c_contact=" + c_contact + ",c_address=" + c_address + ",c_username=" + c_username + ",c_password=" + c_password + "]";
    }

}
