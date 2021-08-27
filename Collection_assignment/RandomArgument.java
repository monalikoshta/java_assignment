import java.util.*;

public class RandomArgument {

    public static void main(String[] args) {

        // Question 1
        List<String> nlist = new ArrayList<String>();  
        for (String element: args){
            nlist.add(element);
        }

        System.out.print("Original List: ");
        for (int i=0; i < nlist.size(); i++) {
            System.out.print(nlist.get(i)+' ');
        }
        
        Collections.shuffle(nlist);
        
        System.out.print("\nShuffled list with for loop: ");
        for (String element : nlist) {
            System.out.print(element+' ');
        }

        System.out.print("\nShuffled list with stream: ");
        nlist.stream().forEach(st->System.out.print(st+' '));

    }
}