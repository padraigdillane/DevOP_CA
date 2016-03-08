package decorator;

/**
 * Created by Padraig on 10/6/2015.
 */
public class NumberPrinting extends JerseyDecorator {
    public NumberPrinting(Jersey jersey){
        super(jersey);
    }

    @Override
    public String createJersey() {
        return tempJer.createJersey() + addNumber();
    }

    public double cost(){
        return 5.00 + tempJer.cost();
    }

    public String addNumber(){
        return " + Add Number ";
    }
}
