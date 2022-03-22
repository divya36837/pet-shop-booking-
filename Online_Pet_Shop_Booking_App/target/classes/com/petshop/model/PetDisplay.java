package com.petshop.model;

public class PetDisplay {
	private String petName;
	private int petPrice;
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public int getPetPrice() {
		return petPrice;
	}
	public void setPetPrice(int petPrice) throws Exception{
		if(petPrice<=500) {
			throw new Exception("Pet price should be greater than 500");
		}
		this.petPrice = petPrice;
	}
	@Override
	public String toString() {
		return "PetDisplay [petName=" + petName + ", petPrice=" + petPrice + "]";
	}


}
