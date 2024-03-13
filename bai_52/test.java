public class test {
    public static void main(String[] args) {
        //concat
        String s1 = "son";
        String s2 = "hai";
        System.out.println("--Testing concat()--");
        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2));

        //replace
        System.out.println("--Testing replace()--");
        s1 = "titv.vn";
        String s3 = s1.replace("titv","hai");
        System.out.println(s3);

        //replaceAll()
        s1 = "a_b_c_d";
        String s4 = s1.replaceAll("_","1");
        System.out.println(s4);

        //toLowerCase
        System.out.println("--Testing toLowerCase()--");
        s1 = "AaBbcCDd";
        System.out.println(s1.toLowerCase());
        //toUpperCase
        System.out.println("--Testing toUpperCase()--");
        System.out.println(s1.toUpperCase());

        //substring
        System.out.println("--Testing substring()--");
        s2 = "sonhai";
        String s5 = s2.substring(3,5);
        System.out.println(s5);






    }
}
