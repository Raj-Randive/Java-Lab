// Jewellery Example
package Module2.P_09;

class Jewellery{
    String Jewellery_id;
    String Jewellery_type;
    double price;

    static int counter = 100;

    Jewellery(String Jewellery_type, double price){
        counter++;
        this.Jewellery_type = Jewellery_type;
        if (Jewellery_type.charAt(0) == 'G' || Jewellery_type.charAt(0) == 'g') {
            Jewellery_id = ("G" + counter);
        }
        else{
            Jewellery_id = ("P" + counter);
        }

        this.price = price;
    }

}

class Gold extends Jewellery{

    double discount;
    Gold(String Jewellery_type, double price, double discount){
        super(Jewellery_type, price);
        this.price = price - price*(discount/100);
    }
    
    void calculate_price(){
        price = price + price*(0.05);
    }
}

class Platinum extends Jewellery{

    double points;
    Platinum(String Jewellery_type, double price){
        super(Jewellery_type, price);

        if (this.price> 90000) {
            points = 20;
        }
        else{
            points = 7;
        }
    }
    void calculate_price(){
        price = price + price*(0.10);
    }

}


public class P09HierarchicalInheritanceJewelleryExample{
    public static void main(String args[]){

        Gold g1 = new Gold("Gold", 75000, 8);
        Platinum p1 = new Platinum("Platinum", 66000);
        g1.calculate_price();
        p1.calculate_price();

        System.out.println("The price of the gold is: " + g1.price);
        System.out.println("The jewellery type is: " + g1.Jewellery_type);
        System.out.println("The jewellery id is: " + g1.Jewellery_id);
        
        System.out.println("\n\nThe price of Platinum: " + p1.price);
        System.out.println("The jewellery type is: " + p1.Jewellery_type);
        System.out.println("The jewellery id is: " + p1.Jewellery_id);
        System.out.println("The jewellery points is: " + p1.points);

    }

}