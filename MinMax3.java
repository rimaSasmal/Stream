import java.util.List;

public class MinMax3 {
    public void implement(){
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        List<Integer> min=list.stream().sorted().limit(3).toList();
        List<Integer> max = list.stream().sorted((a,b)->-a.compareTo(b)).limit(3).toList();
        System.out.println("min : "+min +"\nmax :"+max);
    }
}
