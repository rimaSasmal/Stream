import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeSort2ArrayIn1 {
    public void implement(){
     int[] ar1= {56,4,6,1,4,7,87,23,43,12,9},ar2={1,3,2,4,2,5,4,64,23,12,21,72,9},ar3=new int[40];
        ar3= IntStream.concat(Arrays.stream(ar1).sorted(),Arrays.stream(ar2).sorted()).sorted().toArray();
        System.out.println("with duplicate"+Arrays.toString(ar3));
        System.out.println("with out duplicate : "+ Arrays.toString(Arrays.stream(ar3).distinct().toArray()));
    }
}
