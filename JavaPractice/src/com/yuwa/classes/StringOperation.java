package com.yuwa.classes;

public class StringOperation {
    void stringCompare(){
        String strA = "how are you, mamma";
        String strB = "how are you";
        if(strA.equals(strB)){
            System.out.println("the two strings are the same.");
        }
        int index1= strA.indexOf('a');
        int lastIndex = strA.lastIndexOf('a');
        System.out.println(lastIndex);
        String t1= "5" ;
        String t2= "4" ;
        System.out.println(t1.compareTo(t2));
    }

    void alterString(){
        StringBuffer sb1 = new StringBuffer("how are you");
        String strA = "about me";
        sb1.insert(sb1.length(), '?');

        sb1.append("I am good.");
        System.out.println(sb1);
        System.out.println(strA.replace('a','h'));
        String strNew = strA.concat("book");
        System.out.println(strNew);

    }
}
