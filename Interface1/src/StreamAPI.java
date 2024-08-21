import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,3,4);
        Stream<Integer> s1 = l1.stream();
        Stream<Integer> s2 = s1.filter(i -> i%2==0);
        Stream<Integer> s3 = s2.map(i -> i*2);
        int result = s3.reduce(0,(a,b) ->a+b);
        System.out.println(result);


    }
}
