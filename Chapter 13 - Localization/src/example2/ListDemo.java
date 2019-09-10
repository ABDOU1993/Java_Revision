package example2;

import java.util.Locale;
import java.util.ResourceBundle;

public class ListDemo {
	 
	   static void displayValues(Locale currentLocale) {
	 
	      ResourceBundle stats = 
	         ResourceBundle.getBundle("StatsBundle",currentLocale);
	 
	      Integer gdp = (Integer)stats.getObject("GDP");
	      System.out.println("GDP = " + gdp.toString());
	      Integer pop = (Integer)stats.getObject("Population");
	      System.out.println("Population = " + pop.toString());
	      Double lit = (Double)stats.getObject("Literacy");
	      System.out.println("Literacy = " + lit.toString());
	       
	   } // displayValues
	 
	   static public void main(String[] args) {
	 
	      Locale l = new Locale("ja","JP");
	      System.out.println("Locale = " + l);
	      displayValues(l);
	      
	      
	 
	   } 
	 
	}
