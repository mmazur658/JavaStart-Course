package pl.mazurmarcin.javastart.lecture4;

/**
 * zadanie-java-33
 */
public class Device {

    private String code;
    private String producer;
    private String type;
    private double price;


    public String getInfo() {
        return ("Kod: " + code + ", producent: " +
                producer + ", typ: " + type + ", cena: " + price);
    }


    public Device(String code, String producer, String type, double price){
        this(code, producer, type);
        this.price=price;
    }

    public Device(String code, String producer, String type) {
        this.code = code;
        this.producer = producer;
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
