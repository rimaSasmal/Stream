import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ElementFrequency {

    public void implement(){
        Student st1=new Student("abc","1"),st2=new Student("cde","2"),st3=new Student("cde","4");
        List<Student> students= List.of(st1,st2,st3);
        Map<String,Long> map = students.stream().collect(Collectors.groupingBy((Student :: getName),Collectors.counting()));
        System.out.println("name count : "+map);
    }
}
