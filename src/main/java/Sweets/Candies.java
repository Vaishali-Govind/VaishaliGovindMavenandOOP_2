package Sweets;

public abstract class Candies extends sweet {
         
	  public String candy_flavour;

	public String getCandy_flavour() {
		return candy_flavour;
	}

	public void setCandy_flavour(String candy_flavour) {
		this.candy_flavour = candy_flavour;
	}

	public Candies() {
		super();
		
	}
	  
}
