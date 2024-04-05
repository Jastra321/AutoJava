import java.math.BigDecimal;
import java.util.GregorianCalendar;
import org.junit.jupiter.api.Test;
import org.autojava.*;

  public class TestDrive {

    @Test
    void Test1Run() {
        System.out.println("Run test!");
        Ticket tt = new Ticket();
        tt.setNum(1);
        tt.setName("Mark");
        tt.setDat( new GregorianCalendar(2024,1,5,10,0,0));
        tt.setCost(new BigDecimal("500.50"));
        Ticket.doJAXBmarshal(tt);
    }
}
