
interface Travelling{
    int percentage_advance_price = 7;

    double Calc_discount(int packagePrice);
    void setPackage(int packagePrice);
    int getPackage();
}

class Domestic implements Travelling{

    String SeasonName;
    double packagePrice;
    double discount_per = 10;

    public void setPackage(int packagePrice){
        this.packagePrice = packagePrice;
    }

    public double Calc_discount(int packagePrice) {
        this.packagePrice = ((float)(percentage_advance_price/100) * this.packagePrice) + this.packagePrice - (this.packagePrice)*((float)(discount_per/100));
        return 0;
    }
    public int getPackage(){
        System.out.println("The package price after discount for Domestic is: " + this.packagePrice);
        return 0;
    }
}

class International implements Travelling{

    double packagePrice;
    double discount_per = 3;
    boolean getVisa(String Countryname){
        return true;
    }

    public void setPackage(int packagePrice){
        this.packagePrice = packagePrice;
    }

    public double Calc_discount(int packagePrice) {
        this.packagePrice = ((float)(percentage_advance_price/100) * packagePrice) + packagePrice - (packagePrice)*((float)(discount_per/100));
        return 0;
    }
    public int getPackage(){
        System.out.println("The package price after discount for International is: " + this.packagePrice);
        return 0;
    }

}

public class Midsem_Q_3 {
    public static void main(String args[]){

        Domestic obj1 = new Domestic();
        obj1.setPackage(12000);
        obj1.Calc_discount(12000);
        obj1.getPackage();

        International obj2 = new International();
        obj2.setPackage(12000);
        obj2.Calc_discount(12000);
        obj2.getPackage();

    }
}
