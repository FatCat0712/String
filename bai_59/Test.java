public class Test {
    public static void main(String[] args) {
       PizzaStatus status = PizzaStatus.DAT_HANG;
       if(status == PizzaStatus.DAT_HANG){
           System.out.println("Đơn hàng đã được đặt");
       }
       for (PizzaStatus s: PizzaStatus.values()){
           System.out.println(s);
       }
       for (PizzaStatus s: PizzaStatus.values()){
           System.out.printf("%10s%5d\n",s,s.getThoiGian());
       }

    }
}
