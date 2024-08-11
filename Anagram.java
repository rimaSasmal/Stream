import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Anagram {

    public void implement(){
        String s1="Heart",s2="Earth";
        String s1Map= Arrays.stream(s1.split("")).map(String ::toUpperCase).sorted().collect(Collectors.joining());
        String s2Map= Arrays.stream(s2.split("")).map(String ::toUpperCase).sorted().collect(Collectors.joining());
        //System.out.println(s1Map+" "+s2Map);
        System.out.println(s1+" and "+s2+" are"+((s1Map.equals(s2Map)?" ":" not ")+"anagram"));
    }
}
