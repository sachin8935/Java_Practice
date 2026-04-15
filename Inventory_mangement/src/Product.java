public class Product {
    private int id;
    private String name;
    private int price;
    private int quantity;
    private String category;
    Product(int id,String name,int price,int quantity,String category){
        this.id=id;
        this.name=name;
        setPrice(price);
        setQuantity(quantity);
        this.category=category;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        if(price<=0){
            throw new IllegalArgumentException("Price should be greater than 0");
        }
        this.price=price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        if(quantity<0){
            throw new IllegalArgumentException("Quantity cannot be less than 0");
        }
        this.quantity=quantity;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category=category;
    }
}
