package pl.mazurmarcin.javastart.lecture14.homework.task14_1;

import java.util.Comparator;

public class ComputerNameComparator implements Comparator<Computer>{

	@Override
	public int compare(Computer o1, Computer o2) {		
		return o1.getName().compareToIgnoreCase(o2.getName());
	}

}
