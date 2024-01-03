import java.util.function.Consumer;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void task(String st) {
        Consumer<String> conv = x -> {
            String str = "^\\d+ BYN$";
            Pattern pattern = Pattern.compile(str);
            Matcher matcher = pattern.matcher(x);
            if (matcher.find()) {
                String[] arr = x.split(" BYN");
                double sum = Double.parseDouble(arr[0]);
                System.out.println(sum/3.22 + " $");
            }
            else {
                System.out.println("некоректные данные");
            }
        };

        conv.accept(st);
    }
}
