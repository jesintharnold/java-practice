package SOLID;
//S - Single Responsibility Principle
// It states that , a method should implement what it is supposed to do , not more than that
public class S {
    static public boolean isCat(String cat){
        //checks if it is cat and returns that's it
        if(cat.length()==3) return true;
        return false;
    }
}
