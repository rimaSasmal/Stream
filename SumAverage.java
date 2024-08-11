import java.util.List;

public class SumAverage {
    public void implemenet(){
        List<Integer> list= List.of(1,2,3,4,5,6,7,8,9);
        int sum=list.stream().mapToInt(x->x).sum();
        double avg = list.stream().mapToInt(x->x).average().getAsDouble();
        System.out.println("sum :"+sum+" avg :"+avg);
    }
}
