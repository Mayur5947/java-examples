class mini extends ola
{
	int price =10;
	mini(String from , String to , String name , int km)
	{
		super(from, to,name, km);
		this.from = from;
		this.to = to;
		this.name= name;
		this.km = km;
	}
	public static int bill(int km)
	{
		int price= km*10;
		return price; 
	}

}