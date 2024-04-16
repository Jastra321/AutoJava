package org.autojava;

import java.io.File;

public interface iNeedChekVirus {
    default Boolean iNeedChekVirus(File f) {
        if (isDrVeb(f) & isDefender(f) & isAvira(f)) {
            return true;
        } else {
            return false;
        }
    }

    private Boolean isDefender(File f){
        if (f.equals("virus") ) {
            return false;
        } else {
            return true;
        }

    }

    private Boolean isDrVeb(File f){
        if (f.equals("virus") ) {
            return false;
        } else {
            return true;
        }

    }

    private Boolean isAvira(File f){
        if (f.equals("virus") ) {
            return false;
        } else {
            return true;
        }

    }

}
