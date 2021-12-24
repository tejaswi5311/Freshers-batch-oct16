package DesertItems;

public abstract class Desertitem {
	protected String name;
	public Desertitem()
	{
		name="";
		
	}
	public Desertitem(String name1)
	{
		name=name1;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name1)
	{
		name=name1;
	}
	public abstract double getCost();

}
