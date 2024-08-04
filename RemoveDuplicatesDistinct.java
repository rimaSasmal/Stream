import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesDistinct {
    public void implement(){
        List<Integer> list=List.of(1,2,3,4,5,6,7,2,4,6,8,1,3,4,6,8,9);
        list=list.stream().distinct().toList();
        System.out.println("Unique list : "+list);
    }
}
