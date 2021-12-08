package vaquita.entity;

import javax.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private Long c_id;
    @Column
    private String c_name;
    @Column
    private String c_mail;
    @Column(length = 10)
    private Long c_contact;
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


    public Client() {}

    public Client(String c_name,String c_mail,Long c_contact,String c_address,String c_city,Integer c_zip,String c_username,String c_password) {
        this.c_name = c_name;
        this.c_contact = c_contact;
        this.c_mail = c_mail;
        this.c_address = c_address;
        this.c_city = c_city;
        this.c_zip = c_zip;
        this.c_username = c_username;
        this.c_password = c_password;

    }


    public String getName() {
        return c_name;
    }

    public void setName(String c_name) {
        this.c_name = c_name;
    }

    public Long getId() {
        return c_id;
    }

    public String getMail() {
        return c_mail;
    }

    public void setMail(String c_mail) {
        this.c_mail = c_mail;
    }

    public Long getContact() {
        return c_contact;
    }

    public void setContact(Long c_contact) {
        this.c_contact = c_contact;
    }

    public String getAddress() {
        return c_address;
    }

    public void setAddress(String c_address) {
        this.c_address = c_address;
    }

    public String getCity() {
        return c_city;
    }

    public void setCity(String c_city) {
        this.c_city = c_city;
    }

    public Integer getZip() {
        return c_zip;
    }

    public void setZip(Integer c_Zip) {
        this.c_zip = c_Zip;
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
        return "client [c_id=" + c_id + ", c_name=" + c_name + ", c_mail=" + c_mail + ",c_contact=" + c_contact + ",c_address=" +c_contact + ",c_address="+ c_address+",c_city="+ c_city+",c_zip="+ c_zip + ",c_username=" + c_username + ",c_password=" + c_password + "]";
    }

}
