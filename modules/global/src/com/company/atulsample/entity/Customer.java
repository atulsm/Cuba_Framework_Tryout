package com.company.atulsample.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "ATULSAMPLE_CUSTOMER")
@Entity(name = "atulsample$Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = -3134551831110515514L;

    @Column(name = "NAME", nullable = false, length = 100)
    protected String name;

    @Column(name = "EMAIL", nullable = false, length = 50)
    protected String email;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }


}