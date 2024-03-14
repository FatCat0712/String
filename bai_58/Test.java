import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        System.out.println("--- Testing currentTimeMillis ---");
        long t1 = System.currentTimeMillis();
        int sum = 0;
        for(int i = 0; i < 1000000; i++){
            for(int j = 0; j < 10000; j++){
                sum += j;
            }
        }
        System.out.println(sum);
        long t2 = System.currentTimeMillis();
        System.out.println((double) (t2 - t1)/1000);

        System.out.println("--- Testing TimeUnit ---");
        System.out.println(TimeUnit.DAYS.toSeconds(3000*365));
        System.out.println(TimeUnit.HOURS.toSeconds(24));
        System.out.println(TimeUnit.DAYS.toMinutes(3));


        System.out.println("--- Testing Date ---");
        Date d = new Date(System.currentTimeMillis());
        System.out.println(d.getDate()+"-"+(d.getMonth()+1)+"-"+(d.getYear()+1900));

        System.out.println("--- Testing Calendar ---");
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.HOUR)+ ":"+calendar.get(Calendar.MINUTE) + ":" +calendar.get(Calendar.SECOND));

        System.out.println(calendar.get(Calendar.DATE)+ "-" + (calendar.get(Calendar.MONTH) + 1) +"-" +calendar.get(Calendar.YEAR));

        calendar.add(Calendar.HOUR,30);
        System.out.println(calendar.get(Calendar.DATE)+ "-" + (calendar.get(Calendar.MONTH) + 1) +"-" +calendar.get(Calendar.YEAR));

       calendar.add(Calendar.DATE,14);
        System.out.println(calendar.get(Calendar.DATE)+ "-" + (calendar.get(Calendar.MONTH) + 1) +"-" +calendar.get(Calendar.YEAR));

        calendar.add(Calendar.HOUR,30);
        System.out.println(calendar.get(Calendar.DATE)+ "-" + (calendar.get(Calendar.MONTH) + 1) +"-" +calendar.get(Calendar.YEAR));


        System.out.println("-- Testing simpleDateFormat ---");
        Date d1 = new Date(System.currentTimeMillis());
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(df.format(d1));

        df = new SimpleDateFormat("HH:mm:ss");
        System.out.println(df.format(d1));



    }
}
