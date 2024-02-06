package DesignPatterns.Prototype;

public class Student implements clone<Student> {

    private String name;
    private int age;
    private double psp;
    private String batchName;

    public Student(){};
    Student(Student other){
        this.name=other.name;
        this.age= other.age;
        this.batchName= other.batchName;
        this.psp= other.psp;
    };


    @Override
    public Student copy() {
        return new Student(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }
}
