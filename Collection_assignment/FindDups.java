import java.util.*;

public class FindDups {

    static Comparator<String> compare_case = new Comparator<String>() {
        public int compare(String s1, String s2) {
            return s1.compareToIgnoreCase(s2);
        }
    };

    public static void main(String[] args) {
        
        SortedSet<String> sSet = new TreeSet<String>(compare_case);
        for (String arg : args) {
            sSet.add(arg);
        }
        System.out.println("There are "+sSet.size() + " distinct words in the given input: " + sSet);
    }
}