import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;
public class Ex83StreamSortedMethod{
	
public static void main(String [] args){
	
ArrayList<Integer> l1 = new ArrayList<Integer>();
l1.add(0);
l1.add(10);
l1.add(15);
l1.add(5);
l1.add(20);
l1.add(25);

System.out.println(l1);
//Sorting in natural order
List<Integer> l2 = l1.stream().sorted().collect(Collectors.toList());
System.out.println("Sorted list natural order: "+l2);

//Sorting in descending/reverse order
List<Integer> l3 = l1.stream().sorted((i1,i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
System.out.println("Sorted list reverse order: "+l3);
}
}