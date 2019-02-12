package pl.mazurmarcin.javastart.lecture11.homework.task_11_3;

public class Hdd extends Component {

	private int capacity;

	public Hdd(String model, String producer, String serialNumber, int capacity) {
		super(model, producer, serialNumber);
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return super.toString() + ", typ: " + this.getClass().getSimpleName() + ", pojemność: " + capacity + "GB";
	}

}
