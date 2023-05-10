package com.iv;

public class Employee {
    private int employeeID;
    private String name;
    private String department;
    private float payRate;
    private int hoursWorked;

    public Employee(int employeeID, String name, String department, float payRate, int hoursWorked) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getPayRate() {
        return payRate;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public float getTotalPay(){
        return this.hoursWorked * this.payRate;
    }
    public int getRegularHours() {
        if (this.hoursWorked > 40) {
            return 40;
        } else {
            return this.hoursWorked;
        }
    }
    public int getOvertimeHours() {
        if (this.hoursWorked > 40) {
            return this.hoursWorked - 40;
        } else {
            return 0;
        }
    }
}
