package com.company;

public class Skill {
    private String skill;
    private  String comRate;

    public Skill (){

    }
    public Skill (String skill, String comRate){
        this.skill = skill;
        this.comRate = comRate;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getComRate() {
        return comRate;
    }

    public void setComRate(String comRate) {
        this.comRate = comRate;
    }
}

