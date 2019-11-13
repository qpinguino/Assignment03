public class demoDepartmentBilling {
    public static void main(String[] args){

        Grocery g1 = new Grocery("11","Bread", 1.50,2.0,0.0);
        Grocery g2 = new Grocery("12","Apple", 0.75,6.0,0.01);

        Clothing c1 = new Clothing("21", "Jeans", "Levis", 35.0, 1.0,0.0);
        Clothing c2 = new Clothing("22", "Dress Shirt", "Izod", 25.0, 2.0,0.10);

        g1.displayGrocery();
        g2.displayGrocery();

        c1.displayClothing();
        c2.displayClothing();

        Double total = g1.computeTotalPrice()+g2.computeTotalPrice()+c1.computeTotalPrice()+c2.computeTotalPrice();
        System.out.println("Total Price: \t"+total);

    }
}
