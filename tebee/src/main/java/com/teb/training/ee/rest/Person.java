package com.teb.training.ee.rest;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "kisi")
public class Person {

    @Id
    @GeneratedValue
    private Long          personId;
    @NotEmpty
    @Size(min = 2, max = 25, message = "name 2 ile 25 arasında olmalı")
    private String        name;
    @NotEmpty
    @Size(min = 3, max = 30, message = "surname {min} ile {max} arasında olmalı")
    private String        surname;
    @Max(123890129083129038L)
    @Min(128373L)
    private Long          startTime;
    @Max(150)
    @Min(10)
    private Integer       age;
    @DecimalMax("360")
    @DecimalMin("0")
    private Double        angle;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private PersonDetails personDetails;

    // @Transient
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Phone> phoneNumbers;

    public Set<Phone> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public void setPhoneNumbers(final Set<Phone> phoneNumbersParam) {
        this.phoneNumbers = phoneNumbersParam;
    }

    public PersonDetails getPersonDetails() {
        return this.personDetails;
    }

    public void setPersonDetails(final PersonDetails personDetailsParam) {
        this.personDetails = personDetailsParam;
    }

    public Long getPersonId() {
        return this.personId;
    }

    public void setPersonId(final Long personIdParam) {
        this.personId = personIdParam;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }

    public Long getStartTime() {
        return this.startTime;
    }

    public void setStartTime(final Long startTimeParam) {
        this.startTime = startTimeParam;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(final Integer ageParam) {
        this.age = ageParam;
    }

    public Double getAngle() {
        return this.angle;
    }

    public void setAngle(final Double angleParam) {
        this.angle = angleParam;
    }


}
