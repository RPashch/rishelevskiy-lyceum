package com.company;

public class Task3 {

    public static void main(String[] args) {

        String out = "";

        for (int i = 8; i > 0; i--){
            for (int n = i; n > 0; n--){
                out += "*";
            }
            System.out.println(out);
            out = "";
        }

    }

}
