package com.teb.training.ee.rest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PersonDetails {

    @Id
    @GeneratedValue
    private Long   pdId;
    private String gender;
    private int    height;

    public Long getPdId() {
        return this.pdId;
    }

    public void setPdId(final Long pdIdParam) {
        this.pdId = pdIdParam;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(final String genderParam) {
        this.gender = genderParam;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(final int heightParam) {
        this.height = heightParam;
    }


}
