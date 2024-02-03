package SOLID;
//L - Liskov's Substitution Method
//This informs that ,the subclass you created from the class(parents) should pocess/behaves the same as your parent.

;
public class L extends Bird{

    public L(String name){
      super(name);
    };

    @Override
    public void eat() {
        //Your own behaviour
    }
}
