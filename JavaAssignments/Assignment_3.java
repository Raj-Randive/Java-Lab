package JavaAssignments;
import java.util.Scanner;

class Apparel{
    String itemId;
    double price;
    String itemType;
    static int counter = 100;

    Apparel(String itemType, double price){
        this.price = price;
        this.itemType = itemType;
        counter++;
        if (itemType.equals("Cotton")){
            itemId = ("C" + counter);
        }
        else if(itemType.equals("Silk")){
            itemId = ("S" + counter);
        }
        else{
            System.out.println("Invalid item type!");
        }
    }

    double calculatePrice(){
        this.price = price + ((float)( ((float)(5/100)) * price));
        return (price);
    }

    void setPrice(int price){
        this.price = price;
    }

    String getItemId(){
        return (this.itemId);
    }

}

class Cotton extends Apparel{
    int discountPercentage;

    Cotton(int discountPercentage, double price){

        super("Cotton", price);
        this.discountPercentage = discountPercentage;
    }

    double calculatePrice(){
        super.calculatePrice();
        this.price = price - ((float)( (discountPercentage*price)/100)) + ((float)( (5*price)/100));

        return (this.price);
    }

    int getDiscount(){
        return (this.discountPercentage);
    }
}

class Silk extends Apparel{
    int points;

    Silk(double price){
        super("Silk", price);
    }

    double calculatePrice(){
        super.calculatePrice();

        double p = this.price;
        if (p > 10000){
            this.points = 10;
        }
        else if (p <= 10000) {
            this.points = 3;
        }
        else {
            System.out.println("Invalid user input!");
        }

        this.price = price + (float)( (10*price)/100 ) + (float)( (5*price)/100 ) ;
        return (this.price);
    }

    int getPoints(){
        return (this.points);
    }
}

public class Assignment_3 {
    public static void main(String args[]){
        Scanner myscan = new Scanner(System.in);

        System.out.print("\nWelcome to the World's finest Apparel Store");

        System.out.print("\n_______________________________________________________________");
        System.out.print("\n\nThe Cotton apparel details: ");
        System.out.print("\nEnter the Price of cotton apparel: ");
        double p = myscan.nextDouble();
        System.out.print("Enter the discount on the cotton apparel: ");
        int d = myscan.nextInt();

        Cotton c = new Cotton(d, p);
        System.out.println("\nThe apparel type is: " + c.itemType);
        System.out.println("The apparel id is: " + c.getItemId());
        System.out.println("The discount on the apparel is: " + c.getDiscount());
        System.out.println("The apparel price is: " + c.calculatePrice());

//        *****************************************************************************************

        System.out.print("\n_______________________________________________________________");
        System.out.print("\n\nThe Silk apparel details: ");
        System.out.print("\nEnter the Price of the apparel: ");
        double p1 = myscan.nextDouble();

        Silk s2 = new Silk(p1);
        System.out.println("\nThe apparel type is: " + s2.itemType);
        System.out.println("The apparel id is: " + s2.getItemId());
        System.out.println("The apparel price is: " + s2.calculatePrice());
        System.out.println("The item points are: " + s2.getPoints());
        System.out.print("\n_______________________________________________________________");

    }
}
