import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter something: ");
        s = sc.nextLine();
        System.out.println("-------");

        //Hàm length() -> take the length of a string
        System.out.println(s.length());
        int doDai = s.length();
        //charAt() -> lấy ra ký tự nằm tại vị trí bất kỳ trong chuỗi
        for(int i = 0; i < doDai; i++){
            System.out.println("Position "+ i + " : " + s.charAt(i));
        }

        System.out.println("-------");

        //getChars(index srcBegin, index srcEnd,char[] dst, index destBegin ) -> take out chars from one String to another String
        char[] arrayChar = new char[6];
        s.getChars(0,3,arrayChar,0);
        for(int i = 0; i < arrayChar.length; i++){
            System.out.println("Position "+ i + " : " + arrayChar[i]);
        }
        // getBytes
        byte[] arrayByte = s.getBytes();
        for(byte b: arrayByte){
            System.out.println(b);
        }







    }
}
