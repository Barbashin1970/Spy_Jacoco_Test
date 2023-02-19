import org.junit.Assert;
import org.junit.Test;

public class NameTest {

    private final NameConverter nameConverter = new NameConverter();
    @Test
    public void getFullNameBySurnameAndName() {
        String expected = nameConverter.getFullName("Тамара", "Петрова");
        Assert.assertEquals(expected, "Петрова Тамара");
    }
    @Test
    public void getFullNameException() {
        try {
            String expected = nameConverter.getFullName(null, null);
            Assert.assertNull(expected);}
        catch (Exception exception) {
            Assert.assertEquals(exception.getMessage(),"Не введено ни одно значение");
        }
    }
}
