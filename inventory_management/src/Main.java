import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Inventory management System");
        Scanner sc = new Scanner(System.in);
        int id=0;
        Inventory inv = new Inventory();
        while(true){
            System.out.println("Enter 1 to add Product");
            System.out.println("Enter 2 to remove Product");
            System.out.println("Enter 3 to update Product");
            System.out.println("Enter 4 to get Product by id");
            System.out.println("Enter 5 to viewall Product");
            System.out.println("Enter any other key to Exit");
            int val = sc.nextInt();
            sc.nextLine();
            if(val==1){
                id++;
                addProduct(sc,id,inv);
            }
            else if(val==2){
                removeProduct(sc,inv);
            }
            else if(val==3){
                updateProduct(sc,inv);
            }
            else if(val==4){
                getProduct(sc,inv);
            }
            else if(val==5){
                viewallProduct(sc,inv);
            }
            else{
                break;
            }

        }

    }

    private static void viewallProduct(Scanner sc, Inventory inv) {
        inv.viewAllProduct();
    }

    private static void getProduct(Scanner sc, Inventory inv) {
        System.out.println("Enter id of the product you want to see");
        int id=sc.nextInt();
        inv.getProduct(id);
    }

    private static void updateProduct(Scanner sc, Inventory inv) {
        System.out.println("Enter id of the product to update from the list");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter quantity of the product to update for" + id);
        int quantity= sc.nextInt();
        sc.nextLine();
        inv.updateQuantity(id,quantity);
    }

    private static void removeProduct(Scanner sc, Inventory inv) {
        System.out.println("Enter id of the product to remove it from the list");
        int id = sc.nextInt();
        sc.nextLine();
        inv.removeProduct(id);
    }

    private static void addProduct(Scanner sc, int id, Inventory inv){
        System.out.println("Enter name of the product");
        String name = sc.nextLine();
        System.out.println("Enter quantity of the product");
        int quantity= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter price of the product");
        int price = sc.nextInt();
        sc.nextLine();
        Product P = new Product(id,name,quantity,price);
        inv.addProduct(P);
    }
}