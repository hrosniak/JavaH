import java.math.BigInteger;

import static java.lang.StrictMath.pow;


public class Wielkie {
    BigInteger a = new BigInteger("-5333364485265488488848448448488415158548484848488");
    BigInteger b = new BigInteger("8154852154858484841818518181818181818188181");
    public void wielkie(){
        System.out.println("a + b="+a.add(b).toString());
        System.out.println("a - b="+a.subtract(b).toString());
        System.out.println("a * b="+a.multiply(b).toString());
        System.out.println("a / b="+a.divide(b).toString());
        System.out.println("a^12="+a.pow(12));
        System.out.println("|a|"+a.abs());

    }
}
