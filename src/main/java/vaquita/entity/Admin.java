package vaquita.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
    @Id
    private Long admin_id;

    @Column
    private String admin_password;

    public Admin(){}
    public Admin(Long admin_id,String admin_password) {
        this.admin_id = admin_id;
        this.admin_password =admin_password;
    }
    public Long getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Long admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }
}
