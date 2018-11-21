package com.unical.ingsw.Esercitazione;

public class App 
{
	
	public int sum(int x, int y) {
		return x + y;
	}
	
    public int division(int x, int y) {
    	if(y == 0) {
    		throw new ArithmeticException();
    	}
    	return x / y;
    }
}
