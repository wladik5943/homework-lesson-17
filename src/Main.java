import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate data = LocalDate.of(2005,4,29);

        System.out.println(data);
        System.out.println(Task1.task(data));


        int[] arr = {9,5,-6,-9,2,-3,0,6,-12};
        Task2.task(arr);


        String str = "800 BYN";
        System.out.println(Task3.task(str));

        String st = "500 BYN";
        Task4.task(st);

        System.out.println(Task5.task());
    }
}