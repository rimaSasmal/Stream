import java.util.List;

public class SecondLargestSkipFindFirst {
    public void implement(){
        List<Integer> list = List.of(1,2,3,4,5,6,7,7,8,9,10);
        Integer num= list.stream().sorted((x,y)->-x.compareTo(y)).skip(1).findFirst().get();
        System.out.println(num);
    }
}
