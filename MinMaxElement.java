import java.util.List;
import java.util.stream.IntStream;

public class MinMaxElement {
    public void implement(){
        List<Integer> list= List.of(2,4,6,8,3,6,9,4,8,12,5,10,15,6,12,18,7,14,21,8,16,24,9,18,27,10,20);
        int max= list.stream().mapToInt(x->x.intValue()).max().getAsInt();
        int min= list.stream().mapToInt(x->x.intValue()).min().getAsInt();
        System.out.println("max : "+max+" min : "+min);
    }
}
