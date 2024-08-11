import java.util.Arrays;

public class SumDigit {
    public void implement(){
        Integer num= 201;
       int sum = Arrays.stream(num.toString().split("")).mapToInt(Integer::parseInt).sum();
       System.out.println("sum : "+sum);
    }
}
