import java.util.List;
import java.util.stream.Collectors;

public class StringJoining {
    /*
    Join a list of strings with '[' as prefix, ']' as suffix, and ',' as delimiter
     */
    public void implement(){
        List<String> list=List.of("Hello","good","evening","I","am","Rima");
        String sentence=list.stream().collect(Collectors.joining(" ","{","}"));
        System.out.println(sentence);
    }
}
