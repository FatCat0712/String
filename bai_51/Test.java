public class Test {
    public static void main(String[] args) {
        String q = "I want to be a Java developer in this year";
        String s = "in";

        //Index of
        System.out.println("--- Testing indexOf() ---");
        System.out.println(q.indexOf(s));
        // Sử dụng vị trí bắt đầu
        char a = 'a';
        System.out.println(q.indexOf(a,4));
        System.out.println(q.indexOf('z'));


        //lastIndexOf()
        System.out.println("--- Testing lastIndexOf() ---");
        System.out.println(q.lastIndexOf(a));



    }
}
