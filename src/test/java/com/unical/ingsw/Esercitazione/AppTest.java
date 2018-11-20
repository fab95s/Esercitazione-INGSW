package com.unical.ingsw.Esercitazione;

import org.junit.*;

public class AppTest {
    private static App app;
	
	@BeforeClass
	public static void init() {
		app = new App();
	}
	
	@Before
	public void primaDiOgniTest() {
		System.out.println("Prima di ogni test.");
	}
	
	@Test
	public void sumTest() {
		System.out.println("Test della somma.");
		Assert.assertEquals(10, app.sum(5, 5));
	}
	
	@Test(expected=ArithmeticException.class)
	public void divisionTest() {
		System.out.println("Test divisione per 0.");
		app.division(5, 0);
	}
}
