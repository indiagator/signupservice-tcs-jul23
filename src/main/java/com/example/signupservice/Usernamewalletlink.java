package com.example.signupservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usernamewalletlinks")
public class Usernamewalletlink {
    @Id
    @Column(name = "username", nullable = false, length = 50)
    private String id;

    @Column(name = "walletid", length = 10)
    private String walletid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWalletid() {
        return walletid;
    }

    public void setWalletid(String walletid) {
        this.walletid = walletid;
    }

}