package hashMap_program;
import java.util.*;

 class Key {

	String key ;
	
	public Key(String key)
	{
		this.key = key ;
	}
	
	@Override
	public int hashCode()
	{
		int hash = (int)key.charAt(0) ;
		System.out.println("hashcode for key :" +key + "=" + hash);
		
		return hash ;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		return key.equals(((Key)obj).key);
	}
	
}

public class Internal_Function_of_HashMap {
	public static void main(String[] args) {
		
		Map map= new HashMap<>() ;
		map.put(new Key("Rahul") , 20) ;
		map.put(new Key("vishal") , 24) ;
		map.put(new Key("sachin") , 25) ;
		
		System.out.println(); 
        System.out.println("Value for key sachin: " + map.get(new Key("sachin"))); 
        System.out.println("Value for key vishal: " + map.get(new Key("vishal"))); 
        System.out.println("Value for key Rahul: " + map.get(new Key("Rahul")));
		
	}
}
