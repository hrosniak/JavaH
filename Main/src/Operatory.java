import java.util.Scanner;

public class Operatory {
    int a = 1;
    int b = 1;
    int c = 3;



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
        }else if(smart == 727315090) {
            System.out.println("To chyba nie twoje !!!");
        }else{
            System.out.println("To nie jest poprawny numer");
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj swoją zmierzoną temperaturę: ");
        int smart2 = scan.nextInt();
        switch(smart2){
            case 34:
                System.out.println("Jestem słaby i mi baaaardzo zimno!!!");
                break;

            case 35:
                System.out.println("Jestem osłabiony");
                break;
            case 36:
                System.out.println("Wszystko w normie");
                break;
            case 37:
                System.out.println("Mam stan podgorączkowy");
                break;
            case 38:
                System.out.println("Mam gorączke potrzebuje wolnego");
                break;
            case 40:
                System.out.println("Chyba mam Coronawirusa muszę iść na kwarantannę");
                break;
            default:
                System.out.println("Nic nie podałeś");
                break;
        }
// Zmienna switch składa się z kliku stringów zawsze występuje case sout break =
            Scanner jak = new Scanner(System.in);
            System.out.println("Wpisz jak się zwiesz: ");
            String nazwa = jak.nextLine();

            switch(nazwa){
                case "Hubert":
                    System.out.println("Masz śliczne imię");
                    break;
                case "Łukasz":
                    System.out.println("Nie tak ładne jak Hubert ale może być");
                    break;
                case "Monika":
                    System.out.println("Miłośc mojego życia");
                    break;
                case "Aneta":
                    System.out.println("To moja musia");
                    break;
                case "Kuba":
                    System.out.println("A to mały belzebup");
                    break;
                default:
                    System.out.println("Czy kogoś zapomniałem");
                    break;

            }
            for (int str = 0; str <= 10; str++){
                System.out.println(str);
            }
// Pętla Do While warunek wykona się przynajmniej raz
            int ha = 0;
        do {
            System.out.println(ha);
            ha++;
        }    while(ha >= 10);
                System.out.println("Koniec Pętli");
// Pętla for w nawiasie definiujemy parametry jakie mają się wykonać
                for(int i=10; i<=20; i++){
                    System.out.println("To jest pętelka");
                }
        System.out.println("I koniec pętelki ");
    }

}
