package com.teb.training.ee.rest.lab;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

    private Long       customerId;
    @NotNull(message = "username null olamaz")
    @Size(min = 6, max = 20, message = "username 6 ile 20 arasında olmalı")
    private String     username;
    @NotEmpty
    @NotBlank
    private String     name;
    private String     surname;
    private BigDecimal amount;


    public Customer() {
    }

    public Customer(final Long customerIdParam,
                    final String usernameParam,
                    final String nameParam,
                    final String surnameParam,
                    final BigDecimal amountParam) {
        super();
        this.customerId = customerIdParam;
        this.username = usernameParam;
        this.name = nameParam;
        this.surname = surnameParam;
        this.amount = amountParam;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(final String usernameParam) {
        this.username = usernameParam;
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

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(final BigDecimal amountParam) {
        this.amount = amountParam;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.amount,
                            this.name,
                            this.surname,
                            this.username);
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Customer other = (Customer) obj;
        return Objects.equals(this.amount,
                              other.amount)
               && Objects.equals(this.name,
                                 other.name)
               && Objects.equals(this.surname,
                                 other.surname)
               && Objects.equals(this.username,
                                 other.username);
    }

    @Override
    public String toString() {
        return "Customer [username="
               + this.username
               + ", name="
               + this.name
               + ", surname="
               + this.surname
               + ", amount="
               + this.amount
               + "]";
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(final Long customerIdParam) {
        this.customerId = customerIdParam;
    }


}
