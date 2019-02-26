package pl.mazurmarcin.javastart.lecture14.homework.task14_1;

import java.util.Comparator;

public class ComputerCpuComparator implements Comparator<Computer>{

	@Override
	public int compare(Computer o1, Computer o2) {
		return Integer.compare(o1.getCpu(), o2.getCpu());
	}

}
