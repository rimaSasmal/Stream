import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {
    public void implement(){
        String word = "Piyush let's go for a long drive";
        String reverseWord =Arrays.stream(word.split(" ")).map(x->{
            StringBuilder sb= new StringBuilder(x);
            return sb.reverse().toString();
        }).collect(Collectors.joining(" "));
        System.out.println(reverseWord);
    }
}
