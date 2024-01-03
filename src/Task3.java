import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static Double task(String st) {
        Function<String, Double> conv = x -> {
            String str = "^\\d+ BYN$";
            Pattern pattern = Pattern.compile(str);
            Matcher matcher = pattern.matcher(x);
            if (matcher.find()) {
                String[] arr = x.split(" BYN");
                double sum = Double.parseDouble(arr[0]);
                return sum / 3.22;
            }
            System.out.println("некоректные данные");
            return 0.0;
        };

        return conv.apply(st);
    }
}
