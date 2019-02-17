package pl.mazurmarcin.javastart.podstawy.enkapsulacja;

public class WelcomeTest {

	public static void main(String[] args) {

		WelcomeService welcomeService = new WelcomeService();
		
		welcomeService.sayHelloo(new Client(null, "Mazur"));
		welcomeService.sayHelloo(new Client(null, null));
		welcomeService.sayHelloo(new Client("Marcin", null));
		welcomeService.sayHelloo(new Client("Marcin", "Mazur"));

	}

}
