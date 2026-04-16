import java.util.*;
class Pair{
    int first;
    int second;
    Pair(int first, int second){
        this.first=first;
        this.second=second;
    }
}
public class Inventory {
    Map<Integer,Product> Items= new HashMap<>();
    Product P;
    public void addProduct(Scanner sc, int id){
        String name;
        int price;
        int quantity;
        String category;
        System.out.println("Enter the name of the product");
        name = sc.nextLine();
        System.out.println("Enter the price of the product");
        price = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the quantity of the product");
        quantity= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the category of the product");
        category=sc.nextLine();
        P = new Product(id,name,price,quantity,category);
        Items.put(id,P);
        System.out.println("The product is added successfully");
        System.out.println("id "+id + " name "+name +" price "+price+ " quantity "+ quantity+ " category "+ category);
    }
    public void deleteProduct(Scanner sc){
        int id;
        System.out.println("Enter id of the product you want to delete");
        id = sc.nextInt();
        sc.nextLine();
        Product deletedValue= Items.remove(id);
        if(deletedValue!=null){
            System.out.println("The product is deleted successfully ");
            System.out.println("id "+ deletedValue.getId() + " name "+deletedValue.getName()+" price "+deletedValue.getPrice()+ " quantity "+ deletedValue.getQuantity()+ " category "+ deletedValue.getCategory());
        }
        else{
            System.out.println("there were no product with the given id");
        }
    }
    public void updateProduct(Scanner sc){
        int id;
        System.out.println("Enter the id of the product for which you need to make an update");
        id=sc.nextInt();
        sc.nextLine();
        if(Items.containsKey(id)){
            System.out.println("The key is valid");
            String newName;
            int newPrice;
            int newQuantity;
            String  newCategory;
            System.out.println("Enter new name of the product");
            newName= sc.nextLine();
            System.out.println("Enter new price of the product");
            newPrice= sc.nextInt();
            sc.nextLine();
            System.out.println("Enter new quantity of the product");
            newQuantity= sc.nextInt();
            sc.nextLine();
            System.out.println("Enter new Category of the product");
            newCategory=sc.nextLine();
            P= new Product(id,newName,newPrice,newQuantity,newCategory);
            Items.replace(id,P);
        }
        else{
            System.out.println("There is no product with this key");
        }
    }
    public void searchProduct(Scanner sc){
        int val;
        System.out.println("Enter 1 if you want to serach by name");
        System.out.println("Enter 2 if you want to serach by category");
        val=sc.nextInt();
        sc.nextLine();
        if(val==1){
            String name;
            System.out.println("Enter the name to search");
            name = sc.nextLine();
            Items.forEach((key,value)->{
                if(name.equalsIgnoreCase(value.getName())){
                    System.out.println("The product is found");
                    System.out.println("id "+ value.getId() + " name "+value.getName()+" price "+value.getPrice()+ " quantity "+ value.getQuantity()+ " category "+ value.getCategory());
                }
            });
        }
        else if(val==2){
            String cat;
            System.out.println("Enter the category to search");
            cat = sc.nextLine();
            Items.forEach((key,value)->{
                if(cat.equalsIgnoreCase(value.getCategory())){
                    System.out.println("The product is found");
                    System.out.println("id "+ value.getId() + " name "+value.getName()+" price "+value.getPrice()+ " quantity "+ value.getQuantity()+ " category "+ value.getCategory());
                }
            });
        }
        else{
            System.out.println("Please enter a valid key");
        }
        }
    public void sortProduct(Scanner sc){
        int val;
        System.out.println("Enter 1 if you want to sort product by price");
        System.out.println("Enter 2 if you want to sort product by quantity");
        val=sc.nextInt();
        if(val==1){
            ArrayList<Pair> arr= new ArrayList<>();
            Items.forEach((key,value)->{
                arr.add(new Pair(value.getPrice(), value.getId()));
            });
            Collections.sort(arr, (a,b)->{
                if(a.first!=b.first){
                    return a.first-b.first;
                }
                return a.second-b.second;
            });
            for(Pair P:arr){
                System.out.println(" Id "+ P.second + " Price " + P.first);
            }
        }
        else if(val==2){
            ArrayList<Pair> arr= new ArrayList<>();
            Items.forEach((key,value)->{
                arr.add(new Pair(value.getQuantity(), value.getId()));
            });
            Collections.sort(arr, (a,b)->{
                if(a.first!=b.first){
                    return a.first-b.first;
                }
                return a.second-b.second;
            });
            for(Pair P:arr){
                System.out.println(" Id "+ P.second + " Quantity " + P.first);
            }
        }
        else{
            System.out.println("Please enter a valid key");
        }

    }
}
