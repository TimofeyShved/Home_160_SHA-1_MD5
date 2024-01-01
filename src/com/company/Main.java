package com.company;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException {
	    // Кодировка в SHA-1 и MD5
        String str = "hello world";

        // кодировки
        MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
        MessageDigest md5 = MessageDigest.getInstance("MD5");

        // получаем байт поток
        System.out.println("MD5");
        byte[] bytes1 = md5.digest(str.getBytes());
        for (byte b: bytes1){
            System.out.print(b+"|");
        }
        System.out.println("");

        System.out.println("SHA-1");
        byte[] bytes2 = sha1.digest(str.getBytes());
        for (byte b: bytes2){
            System.out.print(b+"|");
        }
        System.out.println("");

        System.out.println("16 бит");
        byte[] bytes3 = md5.digest(str.getBytes());
        StringBuilder builder = new StringBuilder();
        for (byte b: bytes3){
            builder.append(String.format("%02X" + " | ", b));
        }
        System.out.println(builder.toString());


    }
}
