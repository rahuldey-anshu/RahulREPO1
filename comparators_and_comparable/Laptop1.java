package comparators_and_comparable;

public class Laptop1 {
		
		 String brand ;
		 int ram ;
		 int price ;

		public Laptop1(String brand , int ram , int price)
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
			return "Laptop1 = [brand =" + brand + ", Ram=" + ram + ", Price =" + price + "]";
		}
		
	}

