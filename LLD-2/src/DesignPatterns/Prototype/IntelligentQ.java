package DesignPatterns.Prototype;

public class IntelligentQ extends Student {
    private int iq;
    public IntelligentQ(){};
    private IntelligentQ(IntelligentQ other){
        super(other);
        this.iq=other.iq;
    };

    public void setIq(int i){
        this.iq=i;
    }

    public int getIq(){
        return this.iq;
    }
    @Override
    public IntelligentQ copy() {
        return new IntelligentQ(this);
    };
}
