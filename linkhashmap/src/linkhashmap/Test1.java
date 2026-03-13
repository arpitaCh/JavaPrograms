package linkhashmap;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedHashMap<Integer, Product> lhs= new LinkedHashMap<Integer, Product>();
		lhs.put(111, new Product("pen" , "used to write in copy"));
		lhs.put(222, new Product("pencil" , "used to write in practice purpose"));
		
		Set<Integer> s1=lhs.keySet();
		System.out.println("keys are" +s1);
		
		Collection<Product> col =lhs.values();
		for(Product p1 :col)

			System.out.println(p1.productname +" "+ p1.productDetails);
		
		Set<Entry<Integer,Product>>  s =lhs.entrySet();
		Iterator<Entry<Integer,Product>> ns= s.iterator();

		while(ns.hasNext()) {
		Entry<Integer,Product> n1=	ns.next();
          if(n1.getKey() ==111) {
				ns.remove();
			}
	       while(ns.hasNext()) {
	      	Entry<Integer,Product> n2=	ns.next();
			System.out.println(n2.getKey());
			Product p =  n2.getValue(); 
			System.out.println(p.productDetails +" "+ p.productname);

		
		}
	}
	}
}
