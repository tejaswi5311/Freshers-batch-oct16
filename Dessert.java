package desert;

import java.util.Scanner;



abstract class Dessert
{


abstract int getCost();
public static Dessert getInstance()
	{
	return null;
	}
	}
class Desert extends Dessert
	{
	public int getcost()
	{
	return(2*60);
	}



	@Override
	int getCost() {
	// TODO Auto-generated method stub
	return 0;
	}
	}
	class Cookie extends Dessert
	{
	public int getcost()
	{
	return 3*70;
	}



	@Override
	int getCost() {
	// TODO Auto-generated method stub
	return 0;
	}
	}
	class IceCream extends Dessert
	{
	public int getcost()
	{
	return 5;
	}



	@Override
	int getCost() {
	// TODO Auto-generated method stub
	return 0;
	}
	}



    public class Dessert {
	

	public static void main(String[] args) {
		Candy cnd=new Candy();
		Cookie ck=new Cookie();
		IceCream ic=new IceCream();
		System.out.println("press 1 if you are owner \n press 2 if you are customer");
		Scanner s=new Scanner(System.in);
		int v=s.nextInt();
		if(v==1)
		{
		System.out.println("Dessert Items \n candy:"+cnd.getcost()+"\n Cookie:"+ck.getcost()+"\nIceCream:"+ic.getcost());
		}
		else if(v==2)
		{
		System.out.println("\n place order");
		}

	}

}

