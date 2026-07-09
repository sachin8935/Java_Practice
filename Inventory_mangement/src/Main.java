import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Inventory inv = new Inventory();
        int id=1;
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
                inv.addProduct(sc,id);
                id++;
            }
            else if(input==2){
                inv.deleteProduct(sc);
            }
            else if(input==3){
                inv.updateProduct(sc);
            }
            else if(input==4){
                inv.searchProduct(sc);
            }
            else if(input==5){
                inv.sortProduct(sc);
            }
            else{
                break;
            }
        }
        //hello world here.
    }
}
