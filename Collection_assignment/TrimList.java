import java.util.*;

public class TrimList {

    public static void main(String[] args) {
        List<String> li = new ArrayList<String>();  
        li.add(" Mango ");  
        li.add("  Apple");  
        li.add(" Banana ");  
        li.add(" Grapes  "); 
        System.out.println(li);

        for (int i=0; i < li.size(); i++) {
            li.set(i, li.get(i).trim());
        }
        System.out.println(li);       
    }
}