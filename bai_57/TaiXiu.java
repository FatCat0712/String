import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
    public static void main(String[] args) {
        boolean flag = true;
        double money = 0;

        while(flag){
            System.out.println("----------BET88.NET----------");
            System.out.println("Chào mừng đến với BET88");
            System.out.println("Bạn đang cần gì ?");
            System.out.println("1. Kiểm tra tài khoản");
            System.out.println("2. Nạp tiền tài khoản");
            System.out.println("3. Bắt đầu chơi");
            System.out.println("4. Lưu trạng thái chơi");
            System.out.println("5. Tiếp tục ở trạng thái chơi trước");
            System.out.println("6. Thoát");
            System.out.println("-----------------------------");
            Locale lc = new Locale("vi","VN");
            NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                        System.out.println("Tài khoản hiện tại của bạn còn: "+numf.format(money));
                        break;
                case 2:
                    System.out.println("Bạn muốn nạp bao nhiêu");
                    Scanner sc2 = new Scanner(System.in);
                    String tienNap = sc2.nextLine();
                    String tienNapThuc = tienNap.replaceAll("\\.","");
                    double tienFinal = Double.parseDouble(tienNapThuc);
                    money += tienFinal;
                    System.out.println("Bạn đã nạp "+numf.format(tienFinal)+" vào tài khoản");
                    break;
                case 3:
                    if(money <= 0){
                        System.out.println("Tài khoản của bạn không đủ để thực hiện trò chơi");
                        System.out.println("Vui lòng nhấn phím 1 để nạp thêm tiền");
                    }
                    else{
                        System.out.println("Trò chơi bắt đầu");
                        System.out.println("bạn muốn đặt bao nhiêu ?");
                        Scanner sc3 = new Scanner(System.in);
                        String tienBet = sc3.nextLine();
                        String tienBetThuc = tienBet.replaceAll("\\.","");
                        double bet = Double.parseDouble(tienBetThuc);
                        while (bet <= 0 || bet > money){
                            if(bet <= 0){
                                System.out.println("Không thể đặt cược với số tiền âm");
                            }
                            else{
                                System.out.println("Bạn không thể đặt cược với lớn hơn với số tiền hiện có");

                            }
                            System.out.println("Mời bạn đặt lại: ");
                            String tienDatlai = sc3.nextLine();
                            String tienDatLaiThuc = tienDatlai.replaceAll("\\.","");
                            bet = Double.parseDouble(tienDatLaiThuc);

                        }
                        System.out.println("Bạn đã đặt "+numf.format(bet));
                        System.out.println("Bạn chọn tài hay xỉu:");
                        String choose = sc3.nextLine();
                        while(!choose.equalsIgnoreCase("Tai") && !choose.equalsIgnoreCase("Xiu")){
                            System.out.println("Lựa chọn không hợp lệ. Mời bạn đặt lại !");
                            choose =sc3.nextLine();
                        }
                        int ketqua = 0;
                        Random rd  = new Random();
                        for(int i = 0; i < 3; i++){
                            ketqua += rd.nextInt(1,7);
                        }
                        if(ketqua == 3 || ketqua == 18){
                            System.out.println("Kết quả: " + ketqua);
                            System.out.println("Nhà cái ăn. Bạn đã thua");
                            money -= bet;
                        }
                        else if(ketqua > 4 && ketqua < 10){
                            System.out.println("Kết quả: " + ketqua + " --> "+"Xỉu");
                            if(choose.equalsIgnoreCase("Xiu")){
                                System.out.println("Chúc mừng. Bạn đã thắng!");
                                money += bet;
                            }
                            else{
                                System.out.println("Bạn đã thua");
                                money -= bet;
                            }
                        } else if (ketqua >= 11) {
                            System.out.println("Kết quả: " + ketqua + " --> "+"Tài");
                            if(choose.equalsIgnoreCase("Tai")){
                                System.out.println("Chúc mừng. Bạn đã thắng!");
                                money += bet;
                            }
                            else{
                                System.out.println("Bạn đã thua");
                                money -= bet;
                            }
                        }
                        System.out.println(ketqua);
                        System.out.println("Vui lòng chọn phím 3 để tiếp tục chơi !");

                    }


                    break;
                case 4:
                    Scanner sc4 = new Scanner(System.in);
                    System.out.println("Nhập tên file bạn muốn lưu: ");
                    String fileSave = sc4.nextLine();
                    File f = new File(fileSave);
                    try {
                        FileOutputStream fos = new FileOutputStream(f);
                        String data = money + "";
                        byte[] arr = data.getBytes();
                        fos.write(arr);
                        fos.flush();
                        fos.close();
                    }catch (IOException e){
                        e.getCause();
                    }
                    break;
                case 5:
                    Scanner sc5 = new Scanner(System.in);
                    System.out.println("Nhập tên trạng thái mà bạn muốn quay lại: ");
                    StringBuilder myMoneyBack = new StringBuilder();
                    String fileRead = sc5.nextLine();
                    File file = new File(fileRead);
                    try {
                        FileInputStream fis = new FileInputStream(file);
                        while (fis.available() > 0){
                            myMoneyBack.append((char) fis.read());
                        }
                        fis.close();
                    }catch (IOException e){
                        e.getCause();
                    }
                    double moneyBack = Double.parseDouble(myMoneyBack.toString());
                    money += moneyBack;
                    System.out.println("Số tiền hiện tại của bạn: "+numf.format(money));
                    break;
                case 6:
                    System.out.println("Bạn đã chọn thoát. Hẹn gặp lại");
                    flag = false;
                    break;


            }



        }
    }
}
