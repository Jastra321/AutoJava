package org.autojava;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class RunLib {

    public static Boolean doRunLibisEmpty(String a){
        return StringUtils.isEmpty(a);
    }

    public static Boolean doRunLibContainsWithCase(String a, String b){
        return StringUtils.contains(a, b);
    }

    public static Boolean doRunLibEqualsWithCase(String a, String b){
        return StringUtils.equals (a, b);
    }

    public static Boolean doRunLibEqualsWithoutCase(String a, String b){
        return StringUtils.equalsIgnoreCase (a, b);
    }

    public static String doRunLibSubstringFromIdxToEnd(String a, Integer b){
        if ((b > StringUtils.length(a)  ) | ( b < 0)){
            throw new ArrayIndexOutOfBoundsException();
        }
        return StringUtils.substring(a, b);
    }

    public static String doRunLibSubstringFromAToB(String a, Integer b, Integer c){
        if ((b > StringUtils.length(a)  ) | ( b < 0)){
            throw new ArrayIndexOutOfBoundsException();
        } else if ((c > StringUtils.length(a)  ) | ( c < b)) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return StringUtils.substring(a, b, c);
    }

    public static String doRunLibRemoveString(String a, String b){
        return StringUtils.remove(a, b);
    }

    public  static void doFile(String a){
        try {
            File f = new File("~/T.txt");
            FileUtils.write(f,a, StandardCharsets.UTF_8, true);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
