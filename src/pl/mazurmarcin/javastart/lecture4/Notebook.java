package pl.mazurmarcin.javastart.lecture4;

public class Notebook {

    String producer;
    String model;
    int ram;
    int processor;
    String system;

    public Notebook(String producer, String model, int processor, String system) {
        this(producer, model, processor);
        this.system=system;
    }

    public Notebook(String producer, String model, int ram, int processor) {
        this(producer, model, processor);
        this.ram=ram;
    }

    public Notebook(String producer, String model, int ram, int processor, String system) {
        this(producer, model, processor);
        this.ram=ram;
        this.system=system;
    }

    public Notebook(String producer, String model, int processor) {
        this.producer = producer;
        this.model = model;
        this.processor = processor;
    }
}