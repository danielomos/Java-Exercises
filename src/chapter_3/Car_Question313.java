public class Car_Question313{
    private String model;
    private String year;
    private double price;

    public Car_Question313(String model, String year, Double price){
        this.model = model;

        this.year = year;

        if (price >= 0.0)
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double applyDiscount(Double discount){
      Double discountedamount = price * discount/100;
      price -= discountedamount;
      return price;
    }
}