package com.thoughts_be.transaction_util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
        final String[] stringArray = stringList.toArray(new String[stringList.size()]);
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

    public static boolean findAnagramStrings(String stringOne,String stringTwo){

        // Early termination check, if strings are of unequal lengths,
        // then they cannot be anagrams
        if ( stringOne.length() != stringTwo.length() ) {
            return false;
        }
        stringOne=stringOne.toLowerCase();
        stringTwo=stringTwo.toLowerCase();
        char[] charArrayOne = stringOne.toCharArray();
        char[] charArrayTwo = stringTwo.toCharArray();
        Arrays.sort(charArrayOne);
        Arrays.sort(charArrayTwo);
        String sortedStringOne = new String(charArrayOne);
        String sortedStringTwo = new String(charArrayTwo);
        return sortedStringOne.equals(sortedStringTwo);
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

    public static int[] findAndRemoveDuplicates(int[] numbersWithDuplicates) {
    //TODO: IMPROVE THIS STILL SHOW NULL CELLS IN PRIMITIVE ARRAY
        // Sorting array to bring duplicates together
        Arrays.sort(numbersWithDuplicates);

        int[] result = new int[numbersWithDuplicates.length];
        int previous = numbersWithDuplicates[0];
        result[0] = previous;

        for (int i = 1; i < numbersWithDuplicates.length; i++) {
            int ch = numbersWithDuplicates[i];

            if (previous != ch) {
                result[i] = ch;
            }
            previous = ch;
        }
        return result;

    }
    public static String timeConversion(String s) throws ParseException {
        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat amPmParseFormat = new SimpleDateFormat("hh:mm:ssa");
        Date date = amPmParseFormat.parse(s);
        System.out.println(displayFormat.format(date));
        return displayFormat.format(date);
    }
}

