package com.teb.training.ee.rest;

import java.util.Date;

public class GreetingResponse {

    private String  personName;
    private Boolean started;
    private Date    date;

    public String getPersonName() {
        return this.personName;
    }

    public void setPersonName(final String personNameParam) {
        this.personName = personNameParam;
    }

    public Boolean getStarted() {
        return this.started;
    }

    public void setStarted(final Boolean startedParam) {
        this.started = startedParam;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(final Date dateParam) {
        this.date = dateParam;
    }


}
