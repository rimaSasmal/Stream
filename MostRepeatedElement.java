import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedElement {
    public void implement(){
        List<Integer> list= List.of(1,2,2,3,3,4,4,4,4,4,5,5,5,5,5,5,5,5,5,6,66,6,6,7,3,4,4,2);
        Map<Integer,Long> map=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map.Entry<Integer,Long> max=null;
        for(Map.Entry<Integer,Long> entry:map.entrySet()){
            if(max==null)
                max=entry;
            else if (max.getValue()<entry.getValue())
                max=entry;
        }
        System.out.println("most repeated element : "+max.getKey());
    }
}
