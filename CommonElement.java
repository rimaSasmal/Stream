import java.util.List;

public class CommonElement {
    public void implement(){
        List<Integer> list1= List.of(3,6,9,12,151,18,21,24,27,30),list2=List.of(6,12,18,24,30,36,60) , list3;
        list3=list1.stream().filter(list2::contains).toList();
        System.out.println(list3);
    }
}
