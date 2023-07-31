package org.anisht.springwar;

public class ENV {
    public static void main(String[] args){
        System.out.println(System.getenv("JAVA_HOME"));
        System.out.println(System.getenv("TEMP"));
    }
}
