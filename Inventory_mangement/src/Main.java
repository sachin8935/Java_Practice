import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Inventory items = new Inventory();
        System.out.println("Welcome to the inventory management system");
        while(true){
            System.out.println("Enter 1 if you want to add a product");
            System.out.println("Enter 2 if you want to delete a product");
            System.out.println("Enter 3 if you want to update a product");
            System.out.println("Enter 4 if you want to search product");
            System.out.println("Enter 5 if you want to see the product sorted by price or by quantity");
            System.out.println("Enter any other key to exit.");
            int input =sc.nextInt();
            sc.nextLine();
            if(input==1){
                items.addProduct();
            }
            else if(input==2){
                items.deleteProduct();
            }
            else if(input==3){
                items.updateProduct();
            }
            else if(input==4){
                items.searchProduct();
            }
            else if(input==5){
                items.sortProduct();
            }
            else{
                break;
            }
        }
    }
}