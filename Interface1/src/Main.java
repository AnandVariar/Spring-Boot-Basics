import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main  {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,3,4,5);
        //for(int i : l1) {
          //  System.out.print(i+" ");
        //}

        l1.forEach(i -> System.out.print(i+" "));
    }
}