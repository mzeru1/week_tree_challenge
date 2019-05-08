package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //HashMap<Integer, String> resumeMap = new HashMap<Integer, String>();
        ArrayList<Person> pp = new ArrayList<>();
        ArrayList<String> dutyListt = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Person person1 = null;
        Education education;
        Experience experience;
        Skill skl;
        String buildResume;
        // ResumeDB res = new ResumeDB();
//        do{

        // ArrayList<ResumeDB> s = new ArrayList<ResumeDB>();
        //       System.out.println("Do you want to build a resume? Enter y or N : ");
        //      buildResume = scan.nextLine();

        //      while (buildResume.equalsIgnoreCase("y")) {
        // checks user input if building resume response was yes or no
        //          if (buildResume.equalsIgnoreCase("Y")) {

        person1 = new Person();
        System.out.print("enter name : ");
        person1.setName(scan.nextLine());
        System.out.print("enter email : ");
        person1.setEmail(scan.nextLine());
        //        person1.toString();


   /*     boolean addEducation = true;
        while (addEducation) {*/
            education = new Education();
            System.out.print("enter your Degree type : ");
            education.setDegree(scan.nextLine());
            System.out.print("enter your major : ");
            education.setMajor(scan.nextLine());
            System.out.print("enter school name : ");
            education.setUnivName(scan.nextLine());
            System.out.print("enter graduation year : ");
            education.setGradYear(scan.nextInt());
            scan.nextLine();
            person1.addEducation(education);
/*
            System.out.println("More education to add? Y or N ");
            String choice = scan.nextLine();
            if (!choice.equalsIgnoreCase("Y")) {
                addEducation = false;
                System.out.println("loop tester ...1");
                //                      break;
                //              } else {
                System.out.println("loop tester ");*/

                experience = new Experience();
                System.out.print("enter your experience : ");
                experience.setCompany(scan.nextLine());
                System.out.print("enter your job title : ");
                experience.setJobTitle(scan.nextLine());
                System.out.print("enter start date : ");
                experience.setStartDate(scan.nextLine());
                System.out.print("enter end date : ");
                experience.setEndDate(scan.nextLine());
                System.out.println("enter duty");
                experience.setDuty(scan.nextLine());


              skl = new Skill();

        for(int i=0; i<3;i++){
            System.out.println("enter 3 skills");
            skl.setSkill(scan.nextLine());
            System.out.println("enter rating");
            skl.setComRate(scan.nextLine());

               }
               person1.addSkill(skl);


                //  String decision = "";
  /*              boolean moerDuty = true;
                while (moerDuty) {
                    System.out.println("enter Duty : ");
                    dutyListt.add(scan.nextLine());
                   System.out.println("Add more duty? Y or N ");
                    String decision = scan.nextLine();
                    if (decision.equalsIgnoreCase("y")) {
                        moerDuty = true;
                    } else {
                        moerDuty = false;
                    }*/
                    //                          person1.addExperience(experience);
                person1.addExperience(experience);


   //         }
    //            person1.addExperience(experience);

//                        break;
 //           }

 //       }
 //       pp.add(person1);

        System.out.println(person1.toString());
   //     System.out.println(experience.toString());


        //       break;
        //           } else {
        //             System.out.println("Thank you see you next time !");
    }

}
  //      }
         /*   System.out.println(".......................................................");
            System.out.println(" print checker \n " + person1.toString());*/
//        } while (buildResume.equalsIgnoreCase("y"));
//        if (person1 != null) {
 //           for (Person i : pp) {
 //               System.out.println(person1.toString());
         //       System.out.println(i.toString());

 //           }
   //     }
       // experience.toString();
<<<<<<< HEAD
 //
=======
 //   }

>>>>>>> 5bafb0d06f16bce007ea2b30735922d23bf1d3b6
//}

// Bachelor's