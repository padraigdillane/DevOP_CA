package decorator;

import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

/**
 * Created by User on 13/03/2016.
 */
public class DecoratorTest {

    @Test
    public void testMOCKLongSleeveWithNumberCost() throws Exception {

        LongSleeve longSleeveMock = mock(LongSleeve.class);
        when(longSleeveMock.cost()).thenReturn(Double.valueOf(60f));

        Jersey jersey = new NumberPrinting(longSleeveMock);
        Jersey jersey1 = new NumberPrinting(new LongSleeve());

        double expected = 65.00f;
        double actual = jersey.cost();
        double actual1 = jersey1.cost();

        Assert.assertEquals(expected, actual, 0.01f);
        Assert.assertEquals(expected, actual1, 0.01f);
    }

    @Test
    public void testPlainShortJerseyCost() throws Exception {
        Jersey jersey = new ShortSleeve();

        double expected = 45.00f;
        double actual = jersey.cost();

        Assert.assertEquals(expected, actual, 0.01f);
    }

    @Test
    public void testLongSleeveWithNumberCost() throws Exception {
        Jersey jersey = new NumberPrinting(new LongSleeve());

        double expected = 65.00f;
        double actual = jersey.cost();

        Assert.assertEquals(expected, actual, 0.01f);
    }

    @Test
    public void testShortSleeveWithNameCost() throws Exception {
        Jersey jersey = new NumberPrinting(new NamePrinting(new ShortSleeve()));

        double expected = 55.00f;
        double actual = jersey.cost();

        Assert.assertEquals(expected, actual, 0.01f);
    }

    @Test
    public void testLongSleeveWithNameCost() throws Exception {
        Jersey jersey = new NumberPrinting(new NamePrinting(new LongSleeve()));

        double expected = 70.00f;
        double actual = jersey.cost();

        Assert.assertTrue(expected == actual);
    }

    @Test
    public void testJerseyOutput() throws Exception {
        Jersey jersey = new NumberPrinting(new NamePrinting(new LongSleeve()));

        String expected = " Long Sleeves  + Add Name  + Add Number ";
        String actual = jersey.createJersey();

        Assert.assertEquals(expected, actual);
    }
}