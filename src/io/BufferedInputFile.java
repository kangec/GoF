package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author Ardien
 * @Date 2020/5/6 9:16
 * @Email ardien@126.com
 * @Version 1.0
 **/
public class BufferedInputFile {
    public static void read(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String s = null;
        List<String> sb = new LinkedList<>();
        while ((s = br.readLine()) != null) {
            sb.add(s);
        }
        /*for (int i = sb.size()-1;i>=0;i--) {
            System.out.println(sb.get(i));
        }*/
        sb.stream().map(String::toUpperCase).forEach(System.out::println);

        br.close();
    }

    public static void main(String[] args) throws IOException {
        read("M:\\Design Pattern\\src\\io\\HTMLHandler.txt");
        //read(args[0]);
    }
}
