import java.util.stream.IntStream;

public class SumNaturalNumber {
    public void implement(){
        int x=10;
        int sum=IntStream.rangeClosed(1,x).sum();
        System.out.println(sum);
    }
}
