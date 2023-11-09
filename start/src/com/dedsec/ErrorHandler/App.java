package com.dedsec.ErrorHandler;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
//        try {
//            String s = processFile(“C:\\test.txt”);
//            // ok:
//        } catch (FileNotFoundException e) {
//            // file not found:
//        } catch (SecurityException e) {
//            // no read permission:
//        } catch (IOException e) {
//            // io error:
//        } catch (Exception e) {
//            // other error:
//        }
//        -------------------------------------------------
//        byte[] bs = toGBK("说中文");
//        System.out.println(Arrays.toString(bs));
//-----------------------------------------------------------
//        try {
//            process1();
//            process2();
//            process3();
//        } catch (IOException e) {
////              dosth
//        } catch (NullPointerException e) {
////            dosth
//        }
    }

    static byte[] toGBK(String s) {
        try {
            return s.getBytes("GBK");

        } catch (UnsupportedEncodingException e) {
            System.out.println(e);
            return s.getBytes();
        }
    }
}
