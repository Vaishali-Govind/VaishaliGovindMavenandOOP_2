package Sweets;

public abstract class sweet implements Comparable<sweet> {

	   public String name;
	   public int weight;
	   public int price;
	   public int calories;
	   
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	@Override
	public String toString() {
		return "sweet [name=" + name + ", weight=" + weight+"gm" + ", price = Rs. "+ price + ", calories=" + calories + "]";
	}
	

	@Override
	public int compareTo(sweet sweets) {
		return (this.getWeight() < sweets.getWeight() ? -1
                : (this.getWeight() == sweets.getWeight() ? 0 : 1));
	} 
	   
}