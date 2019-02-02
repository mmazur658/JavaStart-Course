package pl.mazurmarcin.javastart.podstawy.kolejki;

import java.util.Objects;

public class Task implements Comparable<Task> {

	private String name;
	private String description;
	private Priority priority;

	public Task(String name, String description, Priority priority) {
		this.name = name;
		this.description = description;
		this.priority = priority;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, description, priority);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (priority != other.priority)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Zadanie nazwa: " + name + ", opis: " + description + ", prioritet: " + priority;
	}

	@Override
	public int compareTo(Task object) {
		return priority.compareTo(object.priority);
	}

	public enum Priority {
		HIGH, MODERATE, LOW;
	}

}
