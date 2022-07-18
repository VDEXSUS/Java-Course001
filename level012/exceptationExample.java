package com.Vdexsus.level012.exceptation.ExceptationExample;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeoutException;

public class exceptationExample {
    public static void main(String[] args) {
        System.out.println("main start");
       try {
           unsafe(10);
       } catch (TimeoutException exception) {
           // handle exeptation
           exception.printStackTrace();
       } catch(Exception exception) {
           // handle exeptation
           exception.printStackTrace();
       } finally {
           System.out.println("finally");
       }
        System.out.println("main end");
       // code
    }

    public static void unsafe(int value) throws FileNotFoundException, TimeoutException {
        System.out.println("unsafe start");
        if (value > 0) {
            throw new FileNotFoundException();
        }
        System.out.println("unsafe end");
        // code

    }


}
