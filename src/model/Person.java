package model;

import java.util.Objects;

public class Person {
    private String name;
    private String gender;

    public Person(String name, String gender) {
        this.name = name;
        if (gender.equalsIgnoreCase("M"))
            this.gender = "M";
        else if (gender.equalsIgnoreCase("F"))
            this.gender = "F";
        else throw new IllegalArgumentException("The argument for gender must be either \"M\" for masculine or \"F\" for feminine");
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(gender, person.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
