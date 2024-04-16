import org.autojava.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSite {

    @Test
    void doTesting(){
        ArrayList<String> files = new ArrayList<>(Arrays.asList("file1", "file2", "file3"));
        MainSite a = new SiteWithStorage("user1", "pwd", "about", 10000, files);
        assertEquals(a.getSection(), "about");
        MainSite b = new SiteWithStorage("user2","pwd", "documents", 9999999, files);
        ArrayList<MainSite> sites = new ArrayList<>(Arrays.asList(a, b));
        for (MainSite m: sites) {
            System.out.println(m.getSection());
        }
    }
}
