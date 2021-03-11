package com.yuwa.classes;

import java.util.Hashtable;

public class CollectionHandle {
    void handleHashTable(){
        Hashtable ht = new Hashtable();
        ht.put("one", new Integer(1));
        ht.put("two", new Integer(2));
        Integer n = (Integer)ht.get("two");
        System.out.println(n);

        System.out.println(ht);
    }

}

