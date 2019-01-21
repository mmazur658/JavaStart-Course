package pl.mazurmarcin.javastart.lecture3.task59;

public class SpecialOffer {

    private Product product;
    private String offerDescription;
    private String startDay;
    private String endDay;

    /**
     * The value of the discount cannot be less then 0 and greater then 1
     */
    private double discount;

    public SpecialOffer() {
    }

    public SpecialOffer(Product product, String offerDescription, String startDay, String endDay, double discount) {
        this.product = product;
        this.offerDescription = offerDescription;
        this.startDay = startDay;
        this.endDay = endDay;
        this.discount = discount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getOfferDescription() {
        return offerDescription;
    }

    public void setOfferDescription(String offerDescription) {
        this.offerDescription = offerDescription;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "SpecialOffer{" +
                "product=" + product +
                ", offerDescription='" + offerDescription + '\'' +
                ", startDay='" + startDay + '\'' +
                ", endDay='" + endDay + '\'' +
                ", discount=" + discount +
                '}';
    }
}
