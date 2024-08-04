import java.util.ArrayList;
import java.util.List;

public class ReverseSortDecimal {

    public void implement() {
        List<Float> list = List.of(1.2f, 2.3f, 3.4f, 4.5f, 5.6f, 6.7f);
        list=list.stream().sorted((x,y)->-x.compareTo(y)).toList();
        System.out.println(list);
    }

}
