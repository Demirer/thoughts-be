package com.thoughts_be.transaction_util;

import java.util.*;
import java.util.stream.Collectors;

public class Util {

    public static  int[] convertArrayListToIntArray(List<Integer> integerArrayList){
        final int[] convertedIntArray = integerArrayList.stream().mapToInt(i -> i).toArray();
        return convertedIntArray;
    }

    public static  List<Integer> convertIntArrayToArrayList (int[] intArray){
        final List<Integer> intArrayList = Arrays.stream(intArray).boxed().collect(Collectors.toList());
        return intArrayList;
    }

    public static  List<String> convertStringArrayToStringArrayList (String[] stringArray){
        final List<String> stringList = Arrays.asList(stringArray);
        return stringList;
    }

    public static  String[] convertStringArrayListToStringArray(List<String> stringList){
        final String[] stringArray = stringList.toArray(new String[0]);
        return stringArray;
    }

    public static ArrayList<Integer> parseIntArrayToDigits (int[] intArray){
        ArrayList<Integer> dividedDigitList = new ArrayList<>();
        for(int i=0;i < intArray.length; i++){
            while(intArray[i]>0){
                dividedDigitList.add(intArray[i]%10);
                intArray[i] = intArray[i]/10;
            }
        }
        return dividedDigitList;
    }

    public static ArrayList<Integer> findHashMapMaxValueKeysList(HashMap<Integer,Integer> hashmap){
        int max = Collections.max(hashmap.values());
        ArrayList<Integer> maxValueResultKeys = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : hashmap.entrySet()) {
            if (entry.getValue()==max) {
                maxValueResultKeys.add(entry.getKey());
            }
        }
        return maxValueResultKeys;
    }

    public static HashMap<String, Integer> sortHashMapByValue(HashMap<String, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list =
                new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    public static ArrayList<Character> findNumberOfCommonLetterInString (String firstString, String secondString){
        ArrayList<Character> commonLetters = new ArrayList<>();
        for(int i = 0; i < firstString.length() && i < secondString.length(); i++) {
            if(firstString.charAt(i) == secondString.charAt(i)){
                commonLetters.add(firstString.charAt(i));
            }
        }
        return commonLetters;
    }
}
