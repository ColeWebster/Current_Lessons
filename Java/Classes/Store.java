package Java.Classes;

public class Store {
    String productType;
    
    public Store() {
        System.out.println("I am inside the constructor method. ");
    }

    public static void main(String[] args) {
        System.out.println("This code is inside the main method");

        Store lemonadeStand = new Store();

        System.out.println(lemonadeStand);
    }
}
