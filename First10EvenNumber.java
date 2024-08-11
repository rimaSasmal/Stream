import java.util.stream.IntStream;

public class First10EvenNumber {
    public void implement(){
        IntStream.rangeClosed(0,100).filter(x->x%2==0).limit(10).forEach(System.out::println);
    }
}
