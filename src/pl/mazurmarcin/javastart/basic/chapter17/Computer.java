package pl.mazurmarcin.javastart.basic.chapter17;

import java.util.Objects;

public class Computer {

	private String producer;
	private int model;

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public Computer(String producer, int model) {
		this.producer = producer;
		this.model = model;
	}

	public Computer() {

	}

	@Override
	public String toString() {
		return "Computer [producer=" + producer + ", model=" + model + "]";
	}

	@Override
	public int hashCode() {		
		return Objects.hash(producer, model);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computer other = (Computer) obj;
		if (model != other.model)
			return false;
		if (producer == null) {
			if (other.producer != null)
				return false;
		} else if (!producer.equals(other.producer))
			return false;
		return true;
	}

}
