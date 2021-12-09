package vaquita.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Userrequest{
    @Id

    private Long c_id;
    @Column
    private String req_status;
    public Userrequest(){}

    public Userrequest(Long c_id,String req_status) {
        this.c_id = c_id;
        this.req_status=req_status;


    }
    public Long getC_id() {
        return c_id;
    }

    public void setC_id(Long c_id) {
        this.c_id = c_id;
    }



    public String getReq_status() {
        return req_status;
    }

    public void setReq_status(String req_status) {
        this.req_status = req_status;
    }
    @Override
    public String toString() {
        return "userrequest [c_id=" + c_id + ",req_status=" +req_status + "]";
    }


}