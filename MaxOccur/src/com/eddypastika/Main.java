package com.eddypastika;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String input = "zzzzzededdeddyee";
        HashMap<String, Integer> test = new HashMap<String, Integer>();

        test = maxOccur(input);

        //Find Max
        ArrayList<Integer> list =  new ArrayList<Integer>();
        List maxList = new ArrayList(test.keySet());
        for (int i = 0; i < test.size(); i++) {
            list.add(test.get(maxList.get(i)));
        }

        // Store max value from arraylist
        int maxVal = Collections.max(list);

        // Store first key that have max value
        List<String> firstKey = new ArrayList<String>();

        // Find Key from Max value (use Entry)
        for (Map.Entry<String, Integer> entry : test.entrySet()) {
            if (entry.getValue().equals(maxVal)) {
                firstKey.add(entry.getKey());
            }
        }
        System.out.println("Max occur char: "+firstKey.get(0));



    }

    public static HashMap<String,Integer> maxOccur(String in){

       //HashMap<String, String> hmap1 = new HashMap<String, String>();
        HashMap<String, Integer> hmap2 = new HashMap<String, Integer>();
        char[] arrayChar = in.toCharArray();
        int val = 0;

        // Distinct String
        for (int i = 0; i < arrayChar.length; i++) {
            //hmap1.put(""+arrayChar[i], ""+arrayChar[i]);
            hmap2.put(""+arrayChar[i], 0);
        }

        //List keys = new ArrayList(hmap1.keySet());
        List keys2 = new ArrayList(hmap2.keySet());
        String a = keys2.get(1).toString();
        int b = hmap2.get(a);

        for (int i = 0; i < arrayChar.length; i++) {
            for (int j = 0; j < keys2.size(); j++) {

                if (keys2.get(j).equals(""+arrayChar[i])){
                    hmap2.merge(keys2.get(j).toString(),1, Integer::sum);
                }
            }

        }




        return hmap2;
    }
}
