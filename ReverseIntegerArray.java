import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseIntegerArray {
    public void implement(){
        Integer[] arr={1,2,3,4,5,6,7,8};
        IntStream.range(0,arr.length/2).forEach(i->{
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        });
        System.out.println(Arrays.toString(arr));
    }
}
