package com.yuwa.classes;

public class ArrayHandle {

    void mergeTwoArrays(){
        int[] arrA={1,5,6,7,9};
        int[] arrB={2,4,6,8,10, 12, 14,15};
        //int[] newArr = new int[arrA.length + arrB.length - 1];
        int arrLen = arrA.length + arrB.length;
        int[] mergeArray = new int[arrLen];
        int a = 0;
        int b = 0;
        for(int i = 0; i < arrLen; i++){
            if(a < arrA.length && b < arrB.length){
                if(arrA[a] < arrB[b]){
                    mergeArray[i] = arrA[a];
                    a++;

                }else if(arrA[a] > arrB[b]){
                     mergeArray[i] = arrB[b];
                     b++;
                }else if(arrA[a] == arrB[b]){
                    mergeArray[i] = arrB[b];
                    mergeArray[i + 1] = arrA[a];
                    b++;
                    a++;
                }
            }else if(a < arrA.length){
                mergeArray[i] = arrA[a];
                a++;
            }else if(b<arrB.length){
                mergeArray[b] = arrB[b];
                b++;
            }
        }
        for(int i = 0; i < arrLen; i++) {
            System.out.print(" " + mergeArray[i]);
        }
    }
}
