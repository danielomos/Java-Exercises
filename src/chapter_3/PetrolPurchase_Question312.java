public class PetrolPurchase_Question312 {
    private String location;
    private String petrolType;
    private int quantity;
    private Double price;
    private Double discountPercentage;


    public PetrolPurchase_Question312(String location, String petrolType, int quantity, Double price, Double discountPercentage) {
        this.location = location;
        this.petrolType = petrolType;
        this.quantity = quantity;
        this.price = price;
        this.discountPercentage = discountPercentage;

    }

    public void setDiscountPercentage(Double discountPercentage) {

        this.discountPercentage = discountPercentage;
    }

    public Double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public Double getPurchaseAmount() {

        return price * quantity - (discountPercentage * price / 100);
    }
}