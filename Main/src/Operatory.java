import java.util.Scanner;

public class Operatory {
    int a = 1;
    int b = 1;
    int c = 3;
    int number;

    public void operatory() {
        System.out.println(a == b);
        System.out.println(b >= c);
        System.out.println(a <= b);
        System.out.println(a != b);
        System.out.println(a == c);
        System.out.println((a == b) && (a == c));
        System.out.println(a == b || a < c);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Jaką masz temperaturę: ");
        int number = scanner.nextInt();
        if (36 >= number) {
            System.out.println("Mam stan podgorączkowy");
        } else{
            System.out.println("Jestem chory");
        }

    }
}
