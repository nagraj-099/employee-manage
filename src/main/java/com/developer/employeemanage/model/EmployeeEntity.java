package com.developer.employeemanage.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="mt_employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="emp_id")
    private Long Id;

    @Column(name = "name")
    private String Name;

    @Column(name = "gender")
    private String Gender;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "address")
    private String Address;

    public EmployeeEntity() {
    }

    public EmployeeEntity(Long id, String name, String gender, Date dateOfBirth, String address) {
        Id = id;
        Name = name;
        Gender = gender;
        this.dateOfBirth = dateOfBirth;
        Address = address;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
