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
            System.out.println("4. Thoát");
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
                    double tienNap = sc.nextDouble();
                    money += tienNap;
                    System.out.println("Bạn đã nạp "+numf.format(tienNap)+" vào tài khoản");
                    break;
                case 3:
                    System.out.println("Trò chơi bắt đầu");
                    System.out.println("bạn muốn đặt bao nhiêu ?");
                    double bet = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Bạn đã đặt "+numf.format(bet));
                    if(money <= 0){
                        System.out.println("Tài khoản của bạn không đủ để thực hiện trò chơi");
                        System.out.println("Vui lòng nhấn phím 1 để nạp thêm tiền");
                    }
                    else if(bet > money){
                        System.out.println("Bạn không thể đặt cược với lớn hơn với số tiền hiện có");

                    }
                    else{
                        System.out.println("Bạn chọn tài hay xỉu:");
                        String choose = sc.nextLine();
                        int ketqua = 0;
                        Random rd  = new Random();
                        for(int i = 0; i < 3; i++){
                            ketqua += rd.nextInt(7);
                        }
                        if(ketqua == 3 || ketqua == 18){
                            System.out.println("Kết quả: " + ketqua);
                            System.out.println("Nhà cái ăn. Bạn đã thua");
                            money -= bet;
                        }
                        else if(ketqua > 4 && ketqua < 10){
                            System.out.println("Kết quả: " + ketqua + " --> "+"Xỉu");
                            if(choose.equalsIgnoreCase("Xỉu")){
                                System.out.println("Chúc mừng. Bạn đã thắng!");
                                money += bet;
                            }
                            else{
                                System.out.println("Bạn đã thua");
                                money -= bet;
                            }
                        } else if (ketqua >= 11 && ketqua <= 17) {
                            System.out.println("Kết quả: " + ketqua + " --> "+"Tài");
                            if(choose.equalsIgnoreCase("Tài")){
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
                    System.out.println("Bạn đã chọn thoát. Hẹn gặp lại");
                    flag = false;
                    break;


            }



        }
    }
}
