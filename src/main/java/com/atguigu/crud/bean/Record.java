package com.atguigu.crud.bean;


public class Record {
    private Integer id;
    private int employeeId;
    private Double realWages;
    private String employeeName;
    private String payTime;

    public Record() {
    }

    public Record(Integer id, int employeeId, Double realWages, String employeeName, String payTime) {
        this.id = id;
        this.employeeId = employeeId;
        this.realWages = realWages;
        this.employeeName = employeeName;
        this.payTime = payTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Double getRealWages() {
        return realWages;
    }

    public void setRealWages(Double realWages) {
        this.realWages = realWages;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }
}
