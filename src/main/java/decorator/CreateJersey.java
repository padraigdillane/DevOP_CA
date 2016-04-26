package decorator;

public class CreateJersey {
    public static void main(String[] args) {
        //TEST RUNjjbjb
        //test
        Jersey short_sleeve = new NumberPrinting(new NamePrinting(new ShortSleeve()));
        Jersey long_sleeve = new NumberPrinting(new LongSleeve());
        Jersey plain_short = new ShortSleeve();
        Jersey plain_long = new LongSleeve();

        System.out.println(long_sleeve.createJersey() + " = " + long_sleeve.cost());
        System.out.println(short_sleeve.createJersey() + " = " + short_sleeve.cost());
        System.out.println(plain_short.createJersey() + " = " + plain_short.cost());
        System.out.println(plain_long.createJersey() + " = " + plain_long.cost());
    }
}
