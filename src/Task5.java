import java.util.Scanner;
import java.util.function.Supplier;

public class Task5 {
    public static String task(){
        Supplier<String> inv = () -> {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            return new StringBuilder(str).reverse().toString();
        };
        return inv.get();
    }
}
