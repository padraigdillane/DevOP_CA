package decorator;

/**
 * Created by Padraig on 10/6/2015.
 */
public class LongSleeve implements Jersey{

    @Override
    public String createJersey() {
        return " Long Sleeves ";
    }

    @Override
    public double cost() {
        return 60.00;
    }
}
