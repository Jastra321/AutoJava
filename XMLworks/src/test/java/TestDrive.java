import java.math.BigDecimal;
import java.util.GregorianCalendar;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.autojava.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.greaterThan;

@DisplayName("DisplayName Test1Tests")
public class TestDrive {

    @Test
    @DisplayName("DisplayName TestJAXBmarshal")
    void Test1Run() {
        Ticket tt = new Ticket();
        tt.setNum(1);
        tt.setName("Mark");
        tt.setDat( new GregorianCalendar(2024,1,5,10,0,0));
        tt.setCost(new BigDecimal("500.50"));
        String s = Ticket.doJAXBmarshal(tt);
        int size = s.length();
        System.out.println(size);
        assertThat(size, is(greaterThan(70)));
    }


}
