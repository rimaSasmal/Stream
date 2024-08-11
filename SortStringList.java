import java.util.List;

public class SortStringList {
    public void implement(){
        List<String> list=List.of("abcde","abcd","abc","ab","a");
        list=list.stream().sorted((x,y)->{
           if(x.length()>y.length())
               return 1;
           else if (x.length()<y.length())
               return -1;
           else return 0;
        }).toList();
        System.out.println("sorted list "+list);
    }
}
