package AMPackage2;
import AMPackage1.DefaultSum;

public class DefaultSub extends DefaultSum{

    public DefaultSub(double a, double b){
        super(a, b);
        this.a = a;
        this.b = b;
    }
    public double calculateSub(){
        return (a-b);
    }
}
