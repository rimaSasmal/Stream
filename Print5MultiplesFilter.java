import java.util.List;

public class Print5MultiplesFilter {
    public void implement(){
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16);
        list.stream().filter(x->x%5==0).forEach(x->System.out.print(x+" "));
    }
}
