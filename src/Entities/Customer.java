package Entities;

import java.util.Date;

public class Customer implements Entity {
    private int id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String nationalityId;

    public Customer(int id, String firstName, String lastName, Date dateOfBirth, String nationalityId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationalityId = nationalityId;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getNationalityId() {
        return nationalityId;
    }
}
