package decorator;

/**
 * Created by Padraig on 10/6/2015.
 */
public abstract class JerseyDecorator implements Jersey {

    protected Jersey tempJer;

    public JerseyDecorator(Jersey jersey){
        this.tempJer = jersey;
    }

    public String createJersey(){
        return tempJer.createJersey();
    }

    public double cost() {
        return tempJer.cost();
    }
}
