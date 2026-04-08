import java.util.*;

public class Inventory {
    Map<Integer,Product> m = new HashMap<>();
     void addProduct(Product p){
        m.put(p.getId(),p);
    }
    void removeProduct(int id){
        if(m.containsKey(id)){
            m.remove((id));
            System.out.println("The product was removed successfully");
            return;
        }
        System.out.println("The product with this id was not found");
    }
    void updateQuantity(int id, int quantity){
        Product p = m.get(id);
        if(p!=null){
        p.setQuantity(quantity);
        m.replace(id,p);
            System.out.println("The new quantity for "+ id + "is " + quantity);
            return;
        }
        System.out.println("the id was invalid");
    }
    void getProduct(int id){
        Product p = m.get(id);
        if(p!=null){
            System.out.println(p.getName());
        }
        else{
            System.out.println( "Product Not found");
        }
    }
    void viewAllProduct(){
         m.forEach((key,value)->{
             System.out.println("id-> "+key +  " name "+ value.getName()+" quantity "+value.getQuantity() + " price "+value.getPrice());
         });
    }
}
