package vaquita.entity;

import javax.persistence.*;


@Entity
public class Userrequest   {
    @Id
    @GeneratedValue
    private Integer rqst_id;
    @Column
    private String req_status;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;

    public Userrequest(){}

    public Userrequest(String req_status, Client client) {
//        this.c_id = c_id;
        this.req_status=req_status;
        this.client = client;


    }
    public Integer getId() {
        return rqst_id;
    }

//    public void setC_id(Long c_id) {
//        this.rqst_id = rqst_id;
//    }



    public String getReq_status() {
        return req_status;
    }

    public void setReq_status(String req_status) {
        this.req_status = req_status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "userrequest [req_status=" +req_status + "rqst_id="+rqst_id+"client="+client+"]";
    }


}