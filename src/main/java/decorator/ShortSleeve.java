package decorator;

/**
 * Created by Padraig on 10/6/2015.
 */
public class ShortSleeve implements Jersey{
    @Override
    public String createJersey() {
        return " Short Sleeves ";
    }

    @Override
    public double cost() {
        return 45.00;
    }
}
