package com.restcalculator.logic;

import com.restcalculator.client.ICalculator;

public class GreenCalculator {

	public long number1;
	public long number2;
	
	public long number3;
	public long number4;
	
	public long number5;
	public long number6;
	
	public long number7;
	public long number8;
	
	public long number9;
	public long number10;
	
	public long number7;
	public long number8;
	
	public long number9;
	public long number10;
	
	public GreenCalculator()
	{
	}
		
	public long Sum(ICalculator calculator)
	{
		return calculator.Sum(this.number1, this.number2);
	}
	
}
