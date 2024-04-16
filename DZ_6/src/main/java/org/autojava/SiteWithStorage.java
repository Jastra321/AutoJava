package org.autojava;

import java.io.File;
import java.util.ArrayList;

public class SiteWithStorage extends MainSite implements iNeedChekSizeFile,iChekLang{
    public SiteWithStorage(String login, String pass, String section, Integer storageByte, ArrayList<String> fileNames) {
        super(login, pass, section);
        this.storageByte = storageByte;
        this.fileNames = fileNames;
    }
    private Integer storageByte;
    private ArrayList<String> fileNames;

    @Override
    public String doChekLang(String a) {
        return "lang";
    }

    @Override
    public Boolean iNeedChekVirus(File f) {
        return super.iNeedChekVirus(f);
    }

    @Override
    public Boolean chekSizeFile(File f) {
        if (f.length() < 1000000000000L ) {
            return true;
        } else {
            return false;
        }
    }

}
