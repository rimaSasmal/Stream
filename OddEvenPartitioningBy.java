import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddEvenPartitioningBy {
    /*
    Separate odd and even numbers in a list of integers
    Given a list of integers, write a Java 8 program to separate the odd and even numbers into two separate lists.
     */
    public void implement(){
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        Map<Boolean,List<Integer>> map=list.stream().collect(Collectors.partitioningBy(x->x%2==0));
        System.out.println("Odd numbers : "+map.get(false));
        System.out.println("Even Numbers : "+map.get(true));
    }
}
