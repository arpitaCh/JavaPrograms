import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class treesetEx {

	public static void main(String[] args) {
	TreeSet t = new TreeSet();
	t.add("arpita");
	t.add("yuio");
	t.add("ar89pita");
	t.add("0909");
	System.out.println(t);
//	t.add(null);
//	System.out.println(t);
//	t.add(12);
    System.out.println(t);
    
    
    Map<String,String> gfg = new HashMap<String,String>(); 
    
    // enter name/url pair 
    gfg.put("GFG", "geeksforgeeks.org"); 
    gfg.put("Practice", "practice.geeksforgeeks.org"); 
    gfg.put("Code", "code.geeksforgeeks.org"); 
    gfg.put("Quiz", "quiz.geeksforgeeks.org"); 
    
  Set<Entry<String,String>> set=  gfg.entrySet();
	Iterator<Entry<String,String>> itr=set.iterator();
	while(itr.hasNext()) {
		Entry<String,String> e = itr.next();
		System.out.println("key "+ e.getKey() + "value " + e.getValue());
	}
	
	for(Entry<String,String> map : gfg.entrySet()) {
		System.out.println(map.getKey() +" value: "+ map.getValue());
	}
	}

}
