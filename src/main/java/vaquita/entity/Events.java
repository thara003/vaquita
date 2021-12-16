package vaquita.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Events {

    @Id
    @GeneratedValue
    private int event_id;


    @Column
    private String event_name;

    @Column
    private String subevent;

    @Column
    private String event_date;

    @Column
    private String priority;

    @Column
    private String destination;

    @Column
    private String dest_city;

    @Column
    private int dest_zip;

    @Column
    private String status;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "events", fetch = FetchType.LAZY, orphanRemoval = false)
    private final List<Staff> listStaff = new ArrayList<>();

    @OneToMany(mappedBy = "events", fetch = FetchType.LAZY, orphanRemoval = false)
    private final List<Manager> listManager = new ArrayList<>();

    @OneToOne(mappedBy = "events", fetch = FetchType.LAZY, orphanRemoval = false)
    private  Billing listBilling;

    @OneToMany(mappedBy = "events", fetch = FetchType.LAZY, orphanRemoval = false)
    private List<Userrequest> listUserrequest = new ArrayList<>();

    public Events(){}

    public Events ( String event_name, String subevent, String event_date, String priority, String destination, String dest_city, int dest_zip, String status, Client client){
        this.event_name = event_name;
        this.subevent = subevent;
        this.event_date = event_date;
        this.priority = priority;
        this.destination = destination;
        this.dest_city = dest_city;
        this.dest_zip = dest_zip;
        this.status = status;
        this.client = client;
    }
    public int getId() {
        return event_id;
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

    public String getEvent_date() {
        return event_date;
    }

    public void setEvent_date(String event_date) {
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

    public int getDest_zip(int dest_zip){
        return dest_zip ;
    }

    public void setDest_zip(int dest_zip) {
        this.dest_zip = dest_zip;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Staff> getListStaff() {
        return listStaff;
    }

    public List<Manager> getListManager() {
        return listManager;
    }

    public Billing getListBilling() {
        return listBilling;
    }

    public void setListBilling(Billing listBilling) {
        this.listBilling = listBilling;
    }

    public void addStaff(Staff staff) {
        listStaff.add(staff);
    }

    public void addManager(Manager manager) {
        listManager.add(manager);
    }

    public void removeStaff(Staff staff) {
        listStaff.remove(staff);
    }

    public void removeManager(Manager manager) {
        listManager.remove(manager);
    }

    public void removeAllStaff() {
        listStaff.clear();
    }

    public void removeAllManager() {
        listManager.clear();
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

    public void removeAllUserrequest() {
        listUserrequest.clear();
    }

    public void setListUserrequest(List<Userrequest> listUserrequest) {
        this.listUserrequest = listUserrequest;
    }

    @Override
    public String toString() {
        return "Events{" + "event_id=" + event_id + ", event_name=" + event_name + ", subevent=" + subevent + ", event_date=" + event_date + ", priority=" + priority + ", destination=" + destination + ", dest_city=" + dest_city + ", dest_zip=" + dest_zip + ", status=" + status +  ", client=" + client + ", listStaff=" + listStaff + ", listManager=" + listManager + ", listBilling=" + listBilling + ", listUserrequest=" + listUserrequest + '}';
    }
}
