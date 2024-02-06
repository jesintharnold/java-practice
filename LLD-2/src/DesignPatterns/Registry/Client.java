package DesignPatterns.Registry;

import DesignPatterns.Prototype.IntelligentQ;
import DesignPatterns.Prototype.Student;

public class Client {
    public static void main(String[] args) {

        StudentRegistry registry=new StudentRegistry();

        Student S=new Student();
        S.setAge(25);
        S.setName("Jesinth");
        S.setBatchName("Nov-22");
        S.setPsp(85);
        registry.register("A",S);
        //--------------------------------------------------------------
        IntelligentQ I=new IntelligentQ();
        I.setAge(25);
        I.setPsp(85);
        I.setName("Jesinth");
        I.setBatchName("Nov-22");
        I.setIq(275);
        registry.register("B",I);
        //---------------------------------------------------------------

        Student Q=registry.getFromRegistry("B");
        System.out.println("DEBUG");




    }
}
