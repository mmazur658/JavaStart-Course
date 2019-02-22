package pl.mazurmarcin.javastart.lecture14.homework.task14_2;

import java.util.List;

public class ResultsApp {

	public static void main(String[] args) {

		ResultManager resultManager = new ResultManager();

		resultManager.addResults();
		resultManager.printResults();
		resultManager.exportToFile();

		List<Result> results = resultManager.importFromFile();
		resultManager.printResults(results);

	}

}
