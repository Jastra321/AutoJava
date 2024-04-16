package org.autojava;

import java.io.File;
import java.util.List;

public class SiteWithEmail extends MainSite implements iNeedChekSizeFile,iChekLang{
    public SiteWithEmail(String login, String pass, String section, List<String> email) {
        super(login, pass, section);
        this.email = email;
    }

    private List<String> email;

    @Override
    public String doChekLang(String a) {
        return "lang";
    }

    @Override
    public Boolean chekSizeFile(File f) {
        if (f.length() < 1000000000 ) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean iNeedChekVirus(File f) {
        return super.iNeedChekVirus(f);
    }
}
