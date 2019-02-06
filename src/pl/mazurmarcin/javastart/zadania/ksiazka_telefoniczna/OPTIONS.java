package pl.mazurmarcin.javastart.zadania.ksiazka_telefoniczna;

import java.util.NoSuchElementException;

public enum OPTIONS {

	ADD_CONTACT(0, "Dodaj kontakt"), SEARCH_BY_NAME(1, "Znajdz po nazwie"), SEARCH_BY_PHONE_NUMBER(2,
			"Znajdz po numerze"), DELETE(3, "Usuń kontakt"), EXIT(4, "Wyjście");

	private int number;
	private String description;

	private OPTIONS(int number, String description) {
		this.number = number;
		this.description = description;
	}
	
	public int getNumber() {
		return number;
	}
	
	static OPTIONS convertToOption(int number) {
		
		if(number < 0 || number > values().length)
			throw new NoSuchElementException();
		
		return values()[number];
	}
	
    @Override
    public String toString() {
        return number + " - " + description;
    }

}
