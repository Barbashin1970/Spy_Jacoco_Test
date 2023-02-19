import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class NameSpyTest {

    @Spy
    private NameConverter nameConverter;

    @Test
    public void getFullNameByName() {
        nameConverter.getFullNameByName("Тамара");
        // вызови тестируемый метод с параметром «Тамара»
        Mockito.verify(nameConverter, Mockito.times(1)).getFullName("Тамара", null);
        // проверь, что внутри ровно один раз
        //вызвался именно нужный метод
        // c нужными параметрами
    }

    @Test
    public void getFullNameBySurname() {
        nameConverter.getFullNameBySurname("Петрова");
        // вызови тестируемый метод с параметром Петрова
        Mockito.verify(nameConverter, Mockito.times(1)).getFullName(null, "Петрова");
        // проверь, что внутри ровно один раз
        //вызвался именно нужный метод
        // c нужными параметрами
    }

}
