package PracticalExam;
import java.util.Scanner;

abstract class Restaurant{
    static int var = 3;

    Restaurant(){
        System.out.println("Inside the Restaurant constructor.");
        System.out.println("We have " + var + " varieties of section:");
        System.out.println(" > The available options in this restaurant is: ");
        System.out.println("   > 1. Gujarati Dishes\n   > 2. Punjabi Dishes\n   > 3. Chinese Dishes\n");
    }
}

interface GujaratiFood{
    int noOfDishes = 5;
    void showMenuG();
    void orderG(int ...x);
}

interface PunjabiFood{
    int noOfDishes = 5;
    void showMenuP();
    void orderP(int ...x);
}

interface ChineseFood{
    int noOfDishes = 5;
    void showMenuC();
    void orderC(int ...x);
}

class ComboPlates extends Restaurant implements GujaratiFood,PunjabiFood, ChineseFood{

    final int CombosAvailable = 3;
    static int sum = 0;
    int price;

    ComboPlates(){
        super();
        System.out.println("The combo dishes available are: " + CombosAvailable);
    }

    public void showMenuG(){
        System.out.println("\nShowing the menu of Gujarati Dishes...");
        System.out.println(" > 1. Rice -------------------------------  Rs. 70");
        System.out.println(" > 2. Gujarati Kadi ----------------------  Rs. 90");
        System.out.println(" > 3. Bhindi ki Sabzi --------------------  Rs. 100");
        System.out.println(" > 4. Gujarati Daal ----------------------  Rs. 70");
        System.out.println(" > 5. Khandvi ----------------------------  Rs. 120");
    }

    public void orderG(int ...x){
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 1){
                price = 70;
            }
            else if (x[i] == 2){
                price = 90;
            }
            else if (x[i] == 3){
                price = 100;
            }
            else if (x[i] == 4){
                price = 70;
            }
            else if (x[i] == 5){
                price = 120;
            }
            sum = sum + price;
        }
    }
    public void calculateBillG(){
        System.out.println("The Bill of Dishes you ordered till now is: " + sum);
    }

    public void showMenuP(){
        System.out.println("\nShowing the menu of Punjabi Dishes...");
        System.out.println(" > 1. Kadai Paneer ------------------------  Rs. 110");
        System.out.println(" > 2. Paneer Sabzi ------------------------  Rs. 90");
        System.out.println(" > 3. Aloo Paratha ------------------------  Rs. 50");
        System.out.println(" > 4. Aloo Paratha with Curd --------------  Rs. 70");
        System.out.println(" > 5. Veg. Rice ---------------------------  Rs. 150");
    }

    public void orderP(int ...x){
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 1){
                price = 110;
            }
            else if (x[i] == 2){
                price = 90;
            }
            else if (x[i] == 3){
                price = 50;
            }
            else if (x[i] == 4){
                price = 70;
            }
            else if (x[i] == 5){
                price = 150;
            }
            sum = sum + price;
        }
    }
    public void calculateBillP(){
        System.out.println("The Bill of Dishes you ordered till now is: " + sum);
    }

    public void showMenuC(){
        System.out.println("\nShowing the menu of Chinese Dishes...");
        System.out.println(" > 1. Hakka Noodles ------------------------  Rs. 80");
        System.out.println(" > 2. Manchurians --------------------------  Rs. 90");
        System.out.println(" > 3. Veg. Roll ----------------------------  Rs. 100");
        System.out.println(" > 4. Chinese Bhel -------------------------  Rs. 50");
        System.out.println(" > 5. Chinese Roll ------------- -----------  Rs. 90");
    }

    public void orderC(int ...x){
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 1){
                price = 80;
            }
            else if (x[i] == 2){
                price = 90;
            }
            else if (x[i] == 3){
                price = 100;
            }
            else if (x[i] == 4){
                price = 50;
            }
            else if (x[i] == 5){
                price = 90;
            }
            sum = sum + price;
        }
    }
    public void calculateBillC(){
        System.out.println("The Bill of Dishes you ordered till now is: " + sum);
    }

    public void ShowComboPlates(){
        System.out.println("\nShowing the menu of Combo Plate Dishes...");
        System.out.println(" > 1. Punjabi Thali ------------------------  Rs. 230");
        System.out.println(" > 2. Chinese Thali ------------------------  Rs. 220");
        System.out.println(" > 3. Gujarati Thali -----------------------  Rs. 260");
    }
    void orderCombos(int ...x){
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 1){
                price = 110;
            }
            else if (x[i] == 2){
                price = 90;
            }
            else if (x[i] == 3){
                price = 50;
            }
            else if (x[i] == 4){
                price = 70;
            }
            else if (x[i] == 5){
                price = 150;
            }
            sum = sum + price;
        }
    }
    void calculateBillCombos(){
        System.out.println("\n\n******************************************************************");
        System.out.println("You Bill is: ");
        System.out.println("\n\nThe Final Amount to pay is: " + "Rs. " + sum);

        System.out.println("\n\n******************************************************************");
    }
}


public class P01 {
    public static void main(String args[]){

        Scanner myscan = new Scanner(System.in);

        ComboPlates obj1 = new ComboPlates();
        obj1.showMenuG();
        obj1.orderG(1, 2, 3);
        obj1.calculateBillG();

        obj1.showMenuC();
        obj1.orderC(4, 5);
        obj1.calculateBillC();

        obj1.showMenuP();
        obj1.orderP(2, 3);
        obj1.calculateBillP();

        obj1.ShowComboPlates();
        obj1.orderCombos(1, 2, 3);
        obj1.calculateBillCombos();


    }
}
