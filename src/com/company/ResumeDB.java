package com.company;

import java.util.ArrayList;

public class ResumeDB {

        ArrayList<Edicuational> educat_N = new ArrayList<>();
        ArrayList<Experience> experien_C = new ArrayList<>();
        ArrayList<Skill> skil_L = new ArrayList<>();

        public ResumeDB(){

    }
//


    public ResumeDB(ArrayList<Edicuational> educat_N, ArrayList<Experience> experien_C, ArrayList<Skill> skil_L) {
        this.educat_N = educat_N;
        this.experien_C = experien_C;
        this.skil_L = skil_L;
    }

    ResumeDB mz = new ResumeDB();
        Edicuational m = new ("bachlors", "cs", "umd", 2019);


    public ArrayList<Edicuational> getEducat_N() {
        return educat_N;
    }

    public void setEducat_N(ArrayList<Edicuational> educat_N) {
        this.educat_N = educat_N;
    }

    public ArrayList<Experience> getExperien_C() {
        return experien_C;
    }

    public void setExperien_C(ArrayList<Experience> experien_C) {
        this.experien_C = experien_C;
    }

    public ArrayList<Skill> getSkil_L() {
        return skil_L;
    }

    public void setSkil_L(ArrayList<Skill> skil_L) {
        this.skil_L = skil_L;
    }
}
