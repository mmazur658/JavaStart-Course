package pl.mazurmarcin.javastart.lecture15.homework;

public enum OnlineStoreMainMenu {
	SORT(1), CHANGE_STATUS(2), ADD_ORDER(3), EXIT(0);

	private final int option;

	private OnlineStoreMainMenu(int option) {
		this.option = option;
	}

	public int getValue() {
		return option;
	}
	
	public static OnlineStoreMainMenu findByValue(int value) {
		
		for (OnlineStoreMainMenu onlineStoreMainMenu : OnlineStoreMainMenu.values()) {
			if(onlineStoreMainMenu.getValue() == value)
				return  onlineStoreMainMenu;
		}
		
		return null;
	}

}
