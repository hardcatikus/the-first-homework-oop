package com.netcracker.employee;

import java.util.Objects;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName(){
        return firstName + " " + lastName;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return salary * 12;
    }

    public int raiseSalary(int percent){
        salary += salary * percent / 100;
        return salary;
    }

    @Override
    public String toString(){
        return "Employee[id=" + id +
                ",name=" + getName() +
                ",salary=" + salary +
                "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (!(o instanceof Employee)){
            return false;
        }
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary
                && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31*result + id;
        result = 31*result + firstName.hashCode();
        result = 31*result + lastName.hashCode();
        result = 31*result + salary;
        return result;
    }
}
