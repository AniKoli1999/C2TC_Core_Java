package javaTutorial;
import java.util.*;
import java.util.stream.*;
public class StreamApiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Integer> list1 = List.of(12,45,32,67,54,11,89,56);
    System.out.println(list1);
    
    /*List<Integer> evenlist = new ArrayList<>();
    for(Integer i: list1) {
    	
    	if(i%2==0)
    		evenlist.add(i);
    	
    }
    System.out.println(evenlist);*/

    Stream<Integer> stream =list1.stream();
    List<Integer> evenlist =stream.filter(i->i%2==0).collect(Collectors.toList());
    System.out.println(evenlist);

	}

}
