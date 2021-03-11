package com.yuwa.classes;

public class NetwrokHandle {

    public boolean isSameSubset(String ip1, String ip2){

        String subNetMask = "255.255.255.0";
        String[] mask = subNetMask.split("\\.");
        String[] ip1Arr = ip1.split("\\.");
        String[] ip2Arr = ip2.split("\\.");

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(int i =0; i < mask.length; i++){
            int v = Integer.valueOf(ip1Arr[i]) & Integer.valueOf(mask[i]);
            sb1.append(Integer.toBinaryString(v)).append(" ");

            int v2 = Integer.valueOf(ip2Arr[i]) & Integer.valueOf(mask[i]);
            sb2.append(Integer.toBinaryString(v2)).append(" ");
        }

        System.out.println(sb1.toString());
        System.out.println(sb2.toString());
        return sb1.toString().equals(sb2.toString());
    }
}
