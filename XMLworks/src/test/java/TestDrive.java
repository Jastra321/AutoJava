import org.autojava.*;
import java.math.BigDecimal;
import java.util.GregorianCalendar;

  public class TestDrive {


    public static void Test1Run() {
        Ticket tt = new Ticket();
        tt.setNum(1);
        tt.setName("Mark");
        tt.setDat( new GregorianCalendar(2024,1,5,10,0,0));
        tt.setCost(new BigDecimal("500.50"));
        Ticket.doJAXBmarshal(tt);
    }
}