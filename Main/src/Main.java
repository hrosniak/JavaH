public class Main {
    public static void main(String[] args) {

        Math zero = new Math();
        zero.math();
        try{ Thread.sleep(1000); } catch(Exception e){ }
        Wielkie lib = new Wielkie();
        lib.wielkie();
        try{ Thread.sleep(1000); } catch(Exception e){ }
        Operatory ope = new Operatory();
        ope.operatory();
        try{ Thread.sleep(1000); } catch(Exception e){ }
        Odczyt odczyt = new Odczyt();
        odczyt.hubi();



        String a = "Hubert";
        String b = "Rośniak";
        String c = "wiek 26";

        int d = 6;
        short e = 7;
        double f = 1.5;
        String maslo = "rama";
        String mleko = "UHT";
        String napoj = "woda" ;
        String razem = maslo+ " " + mleko+ " " + napoj;
        System.out.println(razem);

        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        System.out.println(a + " " + b + " " + c);

        // zmienne typu double + operatory matematyczne
        double x = 1.0;
        double y = 1.5;
        double z = 2.2;
//"(a+b)*c"
        System.out.println((x + y) * z);
// a - b / c
        System.out.println(x - y / z);

        x++;
        y++;
        z++;

        // (a+b)>c
        System.out.println((x + y) > z);
        // a == b
        System.out.println(x == y);
// konwersje rozszerzające i zawężające
    int h = 8;
    char j = 'a';
    char k = 101;

        System.out.println(h + j + k);
// Definiowanie for each
        String[] names = {"Hubert", "Monika", "Arkadiusz", "Maciej", "Aneta", "Magdalena"};
        for(int u = 0; u < names.length; u++){
            System.out.println(names[u]);
        }
    }
}
