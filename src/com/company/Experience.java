package com.company;

public class Experience extends ResumeDB {
    // initialization of class
    private String company;
    private String jobTitle;
    private String startDate;
    private String endDate;
    private String jobDesc;
   // default constactro
    public Experience(){
    }
    // overloaded constractor
    public Experience(String company, String jobTitle, String startDate, String endDate, String jobDesc){
        this.company =  company;
        this.jobTitle = jobTitle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.jobDesc = jobDesc;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

    public String toString(){
        return getJobTitle()+"\n"+getCompany()+
                ", "+getStartDate()+"-"+getEndDate()+"\n"+ getJobDesc();
    }
}
