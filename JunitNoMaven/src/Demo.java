public class Demo {
    public static int sub(int a,int b) {
        return a-b;
    }
    public static String rev(String str) {
        int len = str.length();
        StringBuilder s2 = new StringBuilder();
        for(int i=len-1;i>=0;i--) {
            s2.append(str.charAt(i));
        }
        return s2.toString();
    }

    public static int[] swap(int a,int b) {
        int temp =0;
        temp = a;
        a = b;
        b = temp;

        return new int[] {a,b};
    }
}
