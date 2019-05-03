package com.company;

import java.util.ArrayList;

public class ResumeDB {

    private ArrayList<Education> educat_L = new ArrayList<Education>();
    private ArrayList<Experience> experien_L = new ArrayList<Experience>();
    private ArrayList<Skill> skil_L = new ArrayList<Skill>();
    private ArrayList<Name> name_L = new ArrayList<Name>();

    public ResumeDB() {

    }


    public ResumeDB(ArrayList<Name> name_L, ArrayList<Education> educat_L, ArrayList<Experience> experien_L, ArrayList<Skill> skil_L) {
        this.name_L = name_L;
        this.educat_L = educat_L;
        this.experien_L = experien_L;
        this.skil_L = skil_L;

    }


    Name mz = new Name("Meron", "meronomz@gamil.com");
    //name_L.add(mz);
    Education mz1 = new Education("masters", "CS", "umd", 2019);
    Experience mz2 = new Experience("Electritian", "pepco", "May 3, 2018", " present", "team leader");
    Skill mz3 = new Skill("java", "expert");

    public void addName(Name nm) {
        name_L.add(nm);
    }

    public Name getName() {
        return name_L.get(i);
    }

    public void addEmail(Name em) {
        name_L.add(em);
    }

    public Name getEmai(int i) {
        return name_L.get(i);
    }

    public void addEducation(Education ed) {
        educat_L.add(ed);
    }

    public Education getEducaton(int i) {
        return educat_L.get(i);

    }

    public void addExperi(Experience exp) {
        experien_L.add(exp);
    }

    public Experience getExperi(int i) {
        return experien_L.get(i);
    }

    public void addSkill(Skill sk) {
        skil_L.add(sk);
    }

    public Skill getSkill(int i) {
        return skil_L.get(i);
    }
}
