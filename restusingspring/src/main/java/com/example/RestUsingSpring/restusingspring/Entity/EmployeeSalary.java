package com.example.RestUsingSpring.restusingspring.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="employee_salary")
public class EmployeeSalary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private int Id;

    @Column(name ="account_number")
    private String accountNumber;

    @Column(name ="salary")
    private int salary;

    public EmployeeSalary(){

    }

    public EmployeeSalary(String accountNumber, int salary) {
        this.accountNumber = accountNumber;
        this.salary = salary;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "EmployeeSalary{" +
                "Id=" + Id +
                ", accountNumber=" + accountNumber +
                ", salary=" + salary +
                '}';
    }
}
