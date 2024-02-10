package Examples.basic.StringBuilder;

public class ex04 {
    public static void main(String[] args) {
        System.out.println(task9("101"));
    }

    static boolean task9(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        String str2 = stringBuilder.reverse().toString();
        return str.equals(str2);
    }
}
