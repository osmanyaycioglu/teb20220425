package com.teb.training.java.streams;

import java.util.Objects;

public class Person implements Comparable<Person> {

    private String  name;
    private String  surname;
    private Integer height;
    private Integer weight;

    public Person() {
    }

    public Person(final String nameParam,
                  final String surnameParam,
                  final Integer heightParam,
                  final Integer weightParam) {
        super();
        this.name = nameParam;
        this.surname = surnameParam;
        this.height = heightParam;
        this.weight = weightParam;
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

    public Integer getHeight() {
        return this.height;
    }

    public void setHeight(final Integer heightParam) {
        this.height = heightParam;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public void setWeight(final Integer weightParam) {
        this.weight = weightParam;
    }

    @Override
    public String toString() {
        return "Person [name="
               + this.name
               + ", surname="
               + this.surname
               + ", height="
               + this.height
               + ", weight="
               + this.weight
               + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.height,
                            this.name,
                            this.surname,
                            this.weight);
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
        Person other = (Person) obj;
        return Objects.equals(this.height,
                              other.height)
               && Objects.equals(this.name,
                                 other.name)
               && Objects.equals(this.surname,
                                 other.surname)
               && Objects.equals(this.weight,
                                 other.weight);
    }

    @Override
    public int compareTo(final Person oParam) {
        return this.getName()
                   .compareTo(oParam.getName());
    }


}
