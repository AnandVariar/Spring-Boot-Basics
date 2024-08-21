import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {

    @org.junit.jupiter.api.Test
    void sub() {
        Demo d = new Demo();
        int result = d.sub(4,3);
        int expect = 1;
        assertEquals(result,expect);

    }

    @Test
    void rev() {
        Demo d1 = new Demo();
        String s1 = d1.rev("java");
        String expected = "avaj";
        assertEquals(expected,s1);
    }


    @Test
    void swap() {
        Demo d2 = new Demo();
        int[] arr = d2.swap(2,3);
        int[] exected = {3,2};
        assertArrayEquals(arr,exected);
    }
}