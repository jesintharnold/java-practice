package DesignPatterns.Prototype;

public class Client {
    public static void main(String[] args) {
        Student S=new Student();
        S.setAge(25);
        S.setName("Jesinth");
        S.setBatchName("Nov-22");
        S.setPsp(85);
        Student S2=S.copy();


        IntelligentQ I=new IntelligentQ();
        I.setAge(25);
        I.setPsp(85);
        I.setName("Jesinth");
        I.setBatchName("Nov-22");
        I.setIq(275);

        IntelligentQ I1=I.copy();
        System.out.println("DEBUG");

    }
}
