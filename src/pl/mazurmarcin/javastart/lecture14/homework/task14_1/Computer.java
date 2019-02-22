package pl.mazurmarcin.javastart.lecture14.homework.task14_1;

public class Computer implements Comparable<Computer> {

	private String name;
	private int cpu;
	private int memory;

	public Computer(String name, int cpu, int memory) {
		this.name = name;
		this.cpu = cpu;
		this.memory = memory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCpu() {
		return cpu;
	}

	public void setCpu(int cpu) {
		this.cpu = cpu;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	@Override
	public String toString() {
		return "Komputer " + name + ", cpu: " + cpu + ", ram: " + memory;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cpu;
		result = prime * result + memory;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
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
		if (cpu != other.cpu)
			return false;
		if (memory != other.memory)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Computer object) {

		if (this.cpu > object.cpu) {
			return 1;
		} else if (this.cpu == object.cpu) {
			if (this.memory > object.memory)
				return 1;
			else if (this.memory == object.memory)
				return this.name.compareTo(object.toString());

		}

		return -1;
	}

}
