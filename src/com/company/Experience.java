package com.company;


import java.util.ArrayList;

public class Experience {
    // initialization of class
    private String company;
    private String jobTitle;
    private String startDate;
    private String endDate;
    private String duty;
    //   private ArrayList<String> dutyList;

    // default constactro

    public Experience() {
    }
    // overloaded constractor

    public Experience(String company, String jobTitle, String startDate, String endDate, String duty) {
        this.company = company;
        this.jobTitle = jobTitle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.duty = duty;
        //  this.dutyList = dutyList;

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

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    /* public ArrayList<String> getDutyList()
     {
         return dutyList;
     }

     public void addDuty(String duty) {

         dutyList.add(duty);
     }*/
    @Override
    public String toString() {
        String ret = getJobTitle() + "\n" + getCompany() +
                ", " + getStartDate() + "-" + getEndDate() + "\n" +
                "- Duty " + getDuty();


        //   for(int i=0; i< dutyList.size();i++){
        //     ret += "- Duty "+i+", " + dutyList.get(i) +"\n";

        System.out.println(ret);
          return ret;
    }
}
