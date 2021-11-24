package methodstructure.pendrives;

public class Pendrive {
    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }
    @Override
    public String toString(){
        return name+" "+capacity+" "+price;
    }

    public void risePrice(int percent) {
        price += price*percent/100;
        System.out.println("New price: "+price);
        //this.price += this.price * (percent / 100.0);
    }

    public int comparePricePerCapacity(Pendrive other) {
        double pricePerCap =price/capacity;
        double otherPricePerCap = other.getPrice()/ other.getCapacity();
        if ( pricePerCap > otherPricePerCap) {
            return 1;
        } else if (pricePerCap < otherPricePerCap) {
            return -1;
        }
        return 0;
    }

    public boolean isCheaperThan(Pendrive other) {
        if ( price < other.getPrice()) {
            return true;
        }
        return  false;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }
}
