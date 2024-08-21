import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream2 {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(11,12,13,14,15);
        Stream<Integer> s1 = l1.stream();
        Stream<Integer> s2 = s1.filter(i -> i%2==0);
        //s2.forEach(i -> System.out.println(i+" "));
        Stream<Integer> s3 = s2.map(i -> i+2);
        //s3.forEach(i -> System.out.println(i+" "));
        int result = s3.reduce(0,(a,b) -> a+b);
        System.out.println(result);
    }
}
