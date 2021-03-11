package com.yuwa;
import com.yuwa.classes.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        //HandleFiles hf = new HandleFiles();
        //hf.readFromFile("TC", "file1.txt");
        String ip1 = "192.168.1.3";
        String ip2 = "192.168.1.6";
        NetwrokHandle nh = new NetwrokHandle();
        System.out.println(nh.isSameSubset(ip1, ip2));
    }

}
