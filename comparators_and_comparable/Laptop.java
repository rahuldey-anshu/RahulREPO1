package comparators_and_comparable;

public class Laptop implements Comparable <Laptop> {
	
	private String brand ;
	private int ram ;
	private int price ;

	public Laptop(String brand , int ram , int price)
	{
		this.brand = brand ;
		this.ram = ram ;
		this.price = price ;
	}
	public String getbrand()
	{
		return brand ;
	}
	public void setbrand(String brand)
	{
		this.brand = brand ;
	}
	
	public int getram()
	{
		return ram ;
	}
	
	public void setram(int ram)
	{
		this.ram = ram ;
	}
	
	public int getprice()
	{
		return price ;
	}
	
	public void setprice(int price)
	{
		this.price=price;
	}
	
	public String toString()
	{
		return "Laptop = [brand =" + brand + ", Ram=" + ram + ", Price =" + price + "]";
	}
	@Override
	public int compareTo(Laptop lap2) {
		if(this.ram > lap2.ram)
		return 1;
		else if(this.ram < lap2.ram)
			return -1 ;
		else
		return this.brand.compareTo(lap2.brand);
	}

}
