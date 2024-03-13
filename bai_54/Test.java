public class Test {
    public static void main(String[] args) {
        Student sv1 = new Student(1,"Tran Quang Khai","AN2001",6.5);
        Student sv2 = new Student(2,"Do Duy Anh","AN2002",8.5);
        Student sv3 = new Student(3,"Nguyen Duy Tan","AN2003",8);

        System.out.println(sv2.compareTo(sv1));
        System.out.println(sv3.compareTo(sv2));


    }
}
