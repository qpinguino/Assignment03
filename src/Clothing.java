public class Clothing extends Item implements  Discount,Tax{
    private String brand;
    private double price, units, discount;
    final double taxPercent = 0.085;

    public Clothing(String itemCode, String name, String brand, Double price, Double units, Double discount){
        super(itemCode,name);
        this.brand = brand;
        this.price = price;
        this.units = units;
        this.discount = discount;
    }
    public double computeDiscount(){
        return (price*units*discount);
    }

    public double computeTax(){
        return (price*units*(1-discount)*taxPercent);
    }

    public double computeTotalPrice(){
        return price*units-computeDiscount()+computeTax();
    }

    public void displayClothing(){
        System.out.println("\nItemCode: \t"+itemCode);
        System.out.println("Name: \t"+name);
        System.out.println("Brand: \t"+brand);
        System.out.println("Unit Price: \t"+price);
        System.out.println("Units: \t"+units);
        System.out.println("Savings: \t"+computeDiscount());
        System.out.println("Subtotal: \t"+(price*units-computeDiscount()));
        System.out.println("Tax: \t"+computeTax());
        System.out.println("Final Price: \t"+computeTotalPrice());
        System.out.println();
    }
}
