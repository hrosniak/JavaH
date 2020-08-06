import java.util.Scanner;

public class Operatory {
    int a = 1;
    int b = 1;
    int c = 3;
    int number;
    String imie;

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
            Scanner newia = new Scanner(System.in);
        System.out.println("Wpisz swój numer telefonu: ");
        int smart = newia.nextInt();
        if(smart == 600581902){
            System.out.println("Numer poprawny");
        }else if(smart == 727315090 ) {
            System.out.println("To chyba nie twoje !!!");
        }else{
            System.out.println("To nie jest poprawny numer");
        }
    }
}
