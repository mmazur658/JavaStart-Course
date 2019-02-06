package pl.mazurmarcin.javastart.zadania.ksiazka_telefoniczna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TeleBook implements Iterable<Contact>{

	private Map<String, Contact> contacts = new TreeMap<>();

	public TeleBook() {

	}

	public TeleBook(Map<String, Contact> contacts) {
		this.contacts = contacts;
	}

	public boolean addContact(String name, String phoneNumber) {

		if (name == null || phoneNumber == null)
			throw new NullPointerException("The name and phone number cannot be null");

		if (name.isEmpty() || phoneNumber.isEmpty())
			throw new IllegalArgumentException("The name and phone number cannot be empty");

		if (!contacts.containsKey(name)) {
			contacts.put(name, new Contact(name, phoneNumber));
			return true;
		} else
			return false;
	}

	public boolean deleteContact(String name) {
		return contacts.remove(name) != null;
	}

	public List<Contact> findByName(String name) {

		List<Contact> contactsList = new ArrayList<>();

		for (Map.Entry<String, Contact> entry : contacts.entrySet()) {
			if (entry.getKey().contains(name))
				contactsList.add(entry.getValue());
		}

		return contactsList;
	}

	public List<Contact> findByPhoneNumber(String phoneNumber) {

		List<Contact> contactsList = new ArrayList<>();

		for (Contact contact : contacts.values()) {
			if (contact.getPhoneNumber().contains(phoneNumber))
				contactsList.add(contact);
		}

		return contactsList;
	}

	@Override
	public Iterator<Contact> iterator() {		
		return contacts.values().iterator();
	}

}
