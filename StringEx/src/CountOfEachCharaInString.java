import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountOfEachCharaInString {

	public void characCount(String s) {
		HashMap<Character, Integer> hs= new HashMap<Character, Integer>();
//		 s= "JavaJ2EEJavaJSPJ2EE";
		int maxCount =0;
		Character mostReperatedChar =null;
		char[] ch = s.toCharArray();
		for(char ch1: ch) {
//			if(hs.containsKey(ch1)) {
//				hs.put(ch1,hs.get(ch1)+1);
//			}
//			else {
//				hs.put(ch1, 1);
//			}

			hs.put(ch1, hs.getOrDefault(ch1,0)+1);
		}

		for(Map.Entry<Character,Integer> entry: hs.entrySet()){
		System.out.println( entry.getKey() + " : "+  entry.getValue());

		if(entry.getValue() > maxCount){
			maxCount = entry.getValue();
            mostReperatedChar = entry.getKey();
		}
		}
		System.out.println("most repeted char is "+ mostReperatedChar);
	
	
	Set<Character> hs1 =  hs.keySet();
	for(Character ch1: hs1) {
		if(hs.get(ch1) > 1) {
			System.out.println( ch1 + ": " + hs.get(ch1));
		}
	}
	}
	
	
	public static void wordCount(String s) {
		HashMap<String, Integer> hs= new HashMap<String, Integer>();
		 s= "Java J2EE Java JSP J2EE";
		int count =0;
		String[] s1 = s.split(" ");
		for(String s2: s1) {
//			if(hs.containsKey(s2)) {
//				hs.put(s2,hs.get(s2)+1);
//			}
//			else {
//				hs.put(s2, 1);
//			}

			hs.put(s2,hs.getOrDefault(s2,0)+1);
		}
	

		for(Map.Entry<String,Integer> entry: hs.entrySet()){
			System.out.print("here values are ");
			System.out.print(entry.getKey() +":  "+ entry.getValue());
		}

		Set<String> hs1 = hs.keySet();
		for(String key: hs1){
		    if(hs.get(key) > 1) {
				System.out.println(" method wordCount " + key + ": " + hs.get(key));
			}
			else {
				System.out.println(" method wordCount " + key + ": " + hs.get(key));
			}
		}
	}
	public static void main(String[] args) {
		
		CountOfEachCharaInString gn= new CountOfEachCharaInString();
//		
		gn.characCount("javaj2ee");
		wordCount("Java J2EE Java JSP J2EE");
		wordcount1("arpita satya ARPITA arpita arpita");
		
	}

	
	public static void wordcount1(String s) {
		
		String[] s1= s.split(" ");
		HashMap<String,Integer> hs= new HashMap<String,Integer>();
		int count =0;
		for(String s2:s1) {
			if(hs.containsKey(s2)) {
				hs.put(s2, hs.get(s2)+1);
			}
			else {
				hs.put(s2,1);
			}
		}
		
		Set<String> hs1=hs.keySet();
		for(String s3:hs1) {
			if((hs.get(s3)> 1)) {
				System.out.println("method wordcount1"+s3 +hs.get(s3));
			}
			else
				System.out.println("method wordcount1"+s3 +hs.get(s3));
				
			
			
		}
		
				
	}
}
