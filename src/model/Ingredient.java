package model;

import exceptions.NegativeNumberException;

public class Ingredient {
	private String name;
	private double weight;
	
	public Ingredient(String n, double w) throws NegativeArraySizeException {
		if(w>0) {
			name = n;
			weight = w;
		} else{
			throw new NegativeNumberException();
		}
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void addWeight(double additionalW) throws NegativeArraySizeException {
		if(additionalW>0) {
			weight = weight + additionalW;
		}else {
			throw new NegativeArraySizeException();
		}
	}
	public void removeWight(int toRemove) throws NegativeNumberException {
		if(weight - toRemove>=0 && toRemove>0) {
			weight = weight - toRemove;
		}else {
			throw new NegativeArraySizeException();
		}
	}
	
}
