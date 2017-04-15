import java.util.Scanner;

/**
 * Created by alexander on 15.04.17.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        ExecutorEngine executor = new ExecutorEngine();
        double result = executor.parse(input);
        System.out.println(result);

    }
}
