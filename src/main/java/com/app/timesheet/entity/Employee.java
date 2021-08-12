package com.app.timesheet.entity;

import javax.persistence.*;

@Entity
@Table(name ="employees")
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_generator")
    @Column
    private int id;

    @Column
    private String firstName ;

    @Column
    private String lastName;

    @Column
    private String role;

    @Column
    private int iBan;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getiBan() {
        return iBan;
    }

    public void setiBan(int iBan) {
        this.iBan = iBan;
    }
}
