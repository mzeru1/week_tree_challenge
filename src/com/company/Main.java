package com.company;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<Integer, String> resumeMap = new HashMap<Integer, String>();
        Scanner scan = new Scanner (System.in);
        ResumeDB res = new ResumeDB();
     //
        // ArrayList<ResumeDB> s = new ArrayList<ResumeDB>();

        System.out.println("do you wnat to build resumme?");
        while(!false){
            ResumeDB person1 = new ResumeDB();
        //    person1.addName(Name mz);
            Name person = new Name();
          //  Education edu = new Education();
            System.out.println("enter your name");
            person.setName(scan.nextLine());
            person.setEmail(scan.nextLine());
            person1.addName(person);

            //


        }

//        Education mast = new Education("Associate", "Cs", "UMD", 2018);
//        person1.setEducat_N(s,mast);
     /*   s.add(0,res);
        System.out.println(s);*/
//        System.out.println("........\t ");
        System.out.println(res.mz);
        System.out.println(res.mz1);
        System.out.println(res.mz2);
        System.out.println(res.mz3);

    }
}
