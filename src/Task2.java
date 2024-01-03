import java.util.function.Predicate;

public class Task2 {
    public static void task(int[] arr){
        Predicate<Integer> pos = x -> x > 0;

        for (int i = 0; i < arr.length; i++) {
            if(pos.test(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
