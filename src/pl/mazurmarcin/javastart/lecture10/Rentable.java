package pl.mazurmarcin.javastart.lecture10;

public interface Rentable {
	
	boolean isRent();
	void rent(String firstName, String lastName, String id);
	void handOver();
	

}
