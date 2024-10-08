package br.com.meli.calculadoradecalorias.model;

public class Ingredient {
	private String name;
	private Integer calories;
	public Ingredient(String name, Integer calories) {
		super();
		this.name = name;
		this.calories = calories;
	}
	public Ingredient() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCalories() {
		return calories;
	}
	public void setCalories(Integer calories) {
		this.calories = calories;
	}
	@Override
	public String toString() {
		return "Ingredient [name=" + name + ", calories=" + calories + "]";
	}
	

}
