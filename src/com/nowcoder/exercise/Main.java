package com.nowcoder.exercise;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Chris on 2016/7/22.
 */
public class Main {
    public static void main(String[] args){
        demoFunction();
    }
    public static void collectionTest(){
        String[] arr = {"3","8","5","9","6","7","2","1"};
        ArrayList<String> strlis1 = new ArrayList<String>(10);
        for (int i = 0; i < 8; i++){
            strlis1.add(String.valueOf(i * i));
        }
        System.out.println(strlis1);
        Collections.reverse(strlis1);
        System.out.println(strlis1);
        Collections.sort(strlis1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(strlis1);
    }
    public static void demoMapTable(){
        Map<String, String> map = new HashMap<String, String>();
        for (int i=0;i < 5; ++i){
            map.put(String.valueOf(i), String.valueOf(i*i));
        }
        System.out.println(map);
    }
    public static void demoException(){
        try {
            int k = 3;
//            k = k / 0;
            if (k == 3)
                throw new Exception("我故意的！");
        }catch (Exception e){
            System.out.println("2 " + e.getMessage());
        }finally {
            System.out.println("3 " + "finally");
        }
    }
    public static void demoFunction(){
        Random random = new Random();
//        random.setSeed(380);
        System.out.println(random.nextInt(1000));
        System.out.println(random.nextFloat());

        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        /*yyyy-MM-dd hh:mm:ss 2016-07-22 11:49:51
        * yyyy-MM-dd HH:mm:ss 2016-07-22 23:50:39
        * */
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(date));

        System.out.println(Math.log10(10));
        System.out.println(Math.ceil(2.6));
        System.out.println(Math.floor(2.6));
        System.out.println(Math.sqrt(9.0));
        System.out.println(Math.round(2.3));
    }
}
