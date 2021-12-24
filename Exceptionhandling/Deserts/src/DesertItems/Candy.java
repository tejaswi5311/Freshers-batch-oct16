package DesertItems;

public class Candy extends Desertitem {
	private double weight;
	private double pricePerDollar;
	public Candy()
	{
		super();
		weight=0;
		pricePerDollar = 0;
		
	}
	public Candy(String name, double w,double prc)
	{
		super(name);
		weight = w;
		pricePerDollar = prc;
		
	}
	public double getWeight() {
		return weight;
		
	}
	public void setWeight(double weight) {
		this.weight=weight;
	}
	public double getPricePerDollar() {
		return pricePerDollar;
	}
	public void setPricePerDollar(double pricePerDollar) {
		this.pricePerDollar = pricePerDollar;
	}
	public double getCost() {
		double total = weight*pricePerDollar;
		total=Math.round(total*100);
		return total;
	}
	public String toString()
	{
		String s = String.format("%-50s $%.2f\\n\\t %.2f lbs @ $.2f",getName(), getCost()/100, weight, pricePerDollar);
		return s;
	}
    
	

}
