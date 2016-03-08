package decorator;

/**
 * Created by Padraig on 10/6/2015.
 */
public class NamePrinting extends JerseyDecorator {

    public NamePrinting(Jersey jersey){
        super(jersey);
    }

    @Override
    public String createJersey() {
        return tempJer.createJersey() + addName();
    }

    public double cost(){
        return 5.00 + tempJer.cost();
    }

    public String addName(){
        return " + Add Name ";
    }
}
