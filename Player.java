package testng;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Player {    
    private String name;
    private String country;
    private String role;
    
    @JsonProperty("price-in-crores")
    private double priceInCrores;    
    
    public Player() {
    }
    
	public Player(String name, String country, String role, double priceInCrores) {
		super();
		this.name = name;
		this.country = country;
		this.role = role;
		this.priceInCrores = priceInCrores;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public double getPriceInCrores() {
		return priceInCrores;
	}
	public void setPriceInCrores(double priceInCrores) {
		this.priceInCrores = priceInCrores;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", country=" + country + ", role=" + role + ", priceInCrores=" + priceInCrores
				+ "]";
	}
    
    
    
}