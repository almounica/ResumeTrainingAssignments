package com.example.MongoSprindData.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@ToString
@Data
@NoArgsConstructor
@Document(collection="Employee")
public class Employee {
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDepartment(String department) {
        this.designation = designation;
    }

    public Employee(int eid, String name, int age, int salary, String department) {
        super();
        this.eid = eid;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }

    @Id
    @Field("eid")
    private int eid;

    private String name;


    private int salary;

    private String designation;


}


