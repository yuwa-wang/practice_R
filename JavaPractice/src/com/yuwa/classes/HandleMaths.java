package com.yuwa.classes;
import java.util.*;

public class HandleMaths {
    void revertSort1(){
        Integer	arr[] = {212,4,662,123,78,345,34,56,85,211};
        Arrays.sort(arr, (x,y) -> Integer.compare(y, x));
        System.out.println(Arrays.toString(arr));

    }
    void revertSort2(){
        Integer	arr[] = {212,4,662,123,78,345,34,56,85,211};
        //System.out.println(Arrays.toString(Arrays.sort(arr)));
        //Arrays.sort(arr, Collections.reverseOrder());
        //System.out.println(Arrays.toString(arr));
    }
    void printArray(){
        Integer	arr[] = {212,4,662,123,78,345,34,56,85,211};
        for(int num: arr) {
            System.out.print(" " + num + ' ');
        }
    }

    void findSmallest(){
        Integer	arr[] = {212,4,662,123,78,345,34,56,85,211};
        int smallest = arr[0];
        for(int i = 1; i< arr.length; i++){
            if (arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.printf("The smallest is %d", smallest);
    }
    void findBiggest (){
        Integer	arr[] = {212,4,662,123,78,345,34,56,85,211};
        int biggest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > biggest) {
                biggest = arr[i];
            }
        }
        System.out.printf("The biggest is %d \n", biggest);
    }

    void findSecondLargest(){
        Integer	arr[] = {212,4,662,23, 123,78,345,34,56,85,211};
        int largest;
        int size = arr.length;
        for(int i = 0; i < arr.length; i++){
            for (int j = 1; j <arr.length; j++){
                if(arr[i] > arr[j]){
                    largest = arr[i];
                    arr[i] = arr[j];
                    arr[j] = largest;
                }
            }
        }
        System.out.printf("The second largest number is %d\n", arr[size - 1]);
    }

    void sortArray(){
        Integer	arr[] = {212,4,662,23, 123,78,345,34,56,85,211};
        int bigger;
        int arrLength = arr.length;
        Integer newArr[] = new Integer[arrLength];

        for (int i = 0; i < arrLength; i++){
            for(int j = i; j < arrLength;j++){
                if(arr[i]>arr[j]){
                    bigger = arr[i];
                    arr[i] = arr[j];
                    arr[j] = bigger;
                }
            }
        }
        for (int num : arr){
            System.out.print(" " + num);
        }
    }

    void handleArrayList(){
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMV");
        System.out.println(cars);
        System.out.println(cars.size());
        cars.clear();
        System.out.println(cars.size());

    }
    void handleFizzBuzz(){
        int[] arr = {3,4,6,8,10,67};
        for(int i = (arr.length -1); i >= 0; i--){
            if((arr[i] % 3 == 0) &&(arr[i] % 5 == 0)){
                System.out.print(" "+ "FizzDizz");
            }else if(arr[i] % 3 == 0){
                System.out.print(" "+ "Dizz");
            }else if(arr[i] % 5 == 0){
                System.out.print(" "+ "Fizz");
            }else
                System.out.print(" " + arr[i]);
        }
    }

    void calcTimesOfChar(){
        String str = "Long long time ago";
        char searchChar = 'o';
        int counter = 0;
        char[] charArray = str.toCharArray();
       for(char item : charArray){
           if (item == searchChar){
               counter++;
           }
       }
       System.out.println(counter);
    }

    void calcCharOccurs(){
        String str1 = "everyone in the room has an idea.";
        str1 = str1.replace(" ", "");
        System.out.println(str1);
        char[] charArray = str1.toCharArray();

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(char item: charArray){
            map.put(item,map.containsKey(item)? (map.get(item) + 1):1);
        }
        System.out.print(map);
    }



    void reverseString(){
        String str = "Long long time ago";

        StringBuffer strBuffer = new StringBuffer(str);
        strBuffer.reverse();
        System.out.println(strBuffer);
    }

    void calAllCharsInString(){
        String str = "Long long time ago";
        char[] charArray = str.toCharArray();
        Map<Character, Integer> calcMap = new HashMap<Character, Integer>();
        for (char item: charArray){
            calcMap.put(item, calcMap.containsKey(item)?calcMap.get(item) + 1:1);
        }
        System.out.println(calcMap);
    }
    void calCharsInAString(){
        String str1 = "everyoneintheroomhasanidea.";
        char[] charArray = str1.toCharArray();
        ArrayList<Integer> arrList = new ArrayList();
        int[] arr = new int[256];
        System.out.printf("character %c is placed at %d", charArray[0], (int)charArray[0]);
        for(char item : charArray){
            arr[(int)item] += 1;
        }
        for(int counter:arr){
            if(counter > 0 ) {
                System.out.printf("Character appears %d\n",
                         counter);
            }else if(counter < 0){
                System.out.println("Unexcepted error occurs.");
            }
        }
    }
}