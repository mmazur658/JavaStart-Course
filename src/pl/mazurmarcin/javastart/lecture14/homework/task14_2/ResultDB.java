package pl.mazurmarcin.javastart.lecture14.homework.task14_2;

import java.util.ArrayList;
import java.util.List;

public class ResultDB {

	private List<Result> results = new ArrayList<>();

	public void addResult(Result result) {

		if (result == null)
			throw new NullPointerException("Result cannot be null");

		results.add(result);

	}

	public List<Result> getResults() {
		return results;
	}

}
