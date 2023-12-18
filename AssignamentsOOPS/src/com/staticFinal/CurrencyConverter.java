package com.staticFinal;

//Write a method to convert currency from rs. to dollars. It will take rs. 
//As input and return the equivalent amount in dollars.The exchange rate is 69.2 rs equals 1$
public class CurrencyConverter
{
	public static double convertToUSD(double rsAmount)
	{
      // Exchange rate: 1 Rs. = 1 / 69.2 USD
      double exchangeRate = 1.0 / 69.2;
      double usdAmount = rsAmount * exchangeRate;
      return usdAmount;
  }

  public static void main(String[] args)
  {
      double rsAmount = 1000.0; // Example: 1000 Indian Rupees
      double usdAmount = convertToUSD(rsAmount);
      System.out.println(rsAmount + " Rs. is equivalent to: " + usdAmount + " USD.");
  }

}