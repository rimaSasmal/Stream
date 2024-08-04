import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyGroupingByCount {
    public void implement(){
        List<Integer> list=List.of(1,2,3,4,5,6,7,2,4,6,8,1,3,4,6,8,9);
        Map<Integer,Long> characterIntegerMap=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("frequency : "+characterIntegerMap);
    }
}
