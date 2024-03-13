public class Test {
    public static void main(String[] args) {
        String s1 = "hai";
        String s2 = "son";
        String s3 = "hai";

        System.out.println("-- Testing equals() --");

        //equals() => so sánh 2 chuỗi giống nhau, có phân biệt hoa thường
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println();
        System.out.println();


        //equalsIgnoreCase()
        System.out.println("-- Testing equalsIgnoreCase() --");
        s3 = "HAI";
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));

        //compareTo()
        System.out.println("-- Testing compareTo() --");
        String sv1 = "Nguyen Van A";
        String sv2 = "Nguyen Van B";
        String sv3 = "Nguyen Van";

        System.out.println(sv1.compareTo(sv2));
        System.out.println(sv1.compareTo(sv3));
        System.out.println(sv1.compareTo(sv1));

        //compareToIgnoreCase()
        System.out.println("-- Testing compareToIgnoreCase() --");
        sv1 = "Nguyen Van A";
        sv2 = "Nguyen Van a";
        System.out.println(sv1.compareToIgnoreCase(sv2));

        //regionMathches
        System.out.println("-- Testing regionMatches() --");
        String r1 = "sonhai";
        String r2 = "Hai";
        System.out.println(r1.regionMatches(3,r2,0,3));
        //So sánh khong phan biet hoa thuong
        System.out.println(r1.regionMatches(true,3,r2,0,3));

        // 0937 456 789
        // 0937 455 765
        String num1 = "0937 456 789";
        String num2 = "0937 455 765";
        System.out.println(num1.regionMatches(0,num2,0,4));

        //startsWith
        System.out.println("-- Testing startsWith() --");
        String sdt = "037456789";
        System.out.println(sdt.startsWith("037"));
        System.out.println(sdt.startsWith("034"));

        //endWith
        System.out.println("-- Testing endWith() --");
        String pic = "picture.jpg";
        if(pic.endsWith(".jpg")){
            System.out.println("This is a picture");
        }
        else{
            System.out.println("This is a file");
        }

        String file = "file.pdf";
        if(file.endsWith(".jpg")){
            System.out.println("This is a picture");
        }
        else{
            System.out.println("This is a file pdf");
        }




    }
}
