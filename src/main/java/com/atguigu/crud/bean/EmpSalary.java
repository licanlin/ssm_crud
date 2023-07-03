package com.atguigu.crud.bean;

public class EmpSalary {
    private Integer id;
    private String month;
    private String year;
    private Double wagesJob;
    private Double allowance;
    private Double tax;
    private Double award;
    private Double fine;
    private Double realWages;
    private Integer employeeId;

    public EmpSalary() {
    }

    public EmpSalary(Integer id, String month, String year, Double wagesJob, Double allowance, Double tax, Double award, Double fine, Double realWages, Integer employeeId) {
        this.id = id;
        this.month = month;
        this.year = year;
        this.wagesJob = wagesJob;
        this.allowance = allowance;
        this.tax = tax;
        this.award = award;
        this.fine = fine;
        this.realWages = realWages;
        this.employeeId = employeeId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Double getWagesJob() {
        return wagesJob;
    }

    public void setWagesJob(Double wagesJob) {
        this.wagesJob = wagesJob;
    }

    public Double getAllowance() {
        return allowance;
    }

    public void setAllowance(Double allowance) {
        this.allowance = allowance;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getAward() {
        return award;
    }

    public void setAward(Double award) {
        this.award = award;
    }

    public Double getFine() {
        return fine;
    }

    public void setFine(Double fine) {
        this.fine = fine;
    }

    public Double getRealWages() {
        return realWages;
    }

    public void setRealWages(Double realWages) {
        this.realWages = realWages;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "EmpSalary{" +
                "id=" + id +
                ", month='" + month + '\'' +
                ", year='" + year + '\'' +
                ", wagesJob=" + wagesJob +
                ", allowance=" + allowance +
                ", tax=" + tax +
                ", award=" + award +
                ", fine=" + fine +
                ", realWages=" + realWages +
                ", employeeId=" + employeeId +
                '}';
    }
}
