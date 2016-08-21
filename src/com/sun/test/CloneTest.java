package com.sun.test;

import java.util.Date;

/**
 * Created by Chris on 2016/8/21.
 */
public class CloneTest {
    public static void main(String[] args) {
        testPrimitiveType();
//        testQuote();
        testClonePrimiType();
    }
    public static void testClonePrimiType(){
        ObjIntClone o1 = new ObjIntClone(1);
        System.out.println(o1.getI());
        ObjIntClone o2 = (ObjIntClone) o1.clone();
        o2.setI(2);
        System.out.println(o1.getI());
        System.out.println(o2.getI());
    }
    public static void testCloneQuote() {
        ObjInt objInt = new ObjInt(5);
        change(objInt);
        System.out.println(objInt.getI());
    }
    public static void testPrimitiveType() {
        int i = 0;
        change(i);
        System.out.println(i);

        ObjInt o1 = new ObjInt(1);
        ObjInt o2 = o1;
        o2.setI(2);
        System.out.println(o1.getI());
    }
    public static void testQuote(){
        ObjInt objInt = new ObjInt(5);
        change(objInt);
        System.out.println(objInt.getI());
    }
    public static void change(ObjInt objInt){
        objInt.setI(8);
    }
    public static int change(int i) {
        return i + 10;
    }

}
class ObjIntClone implements Cloneable {
    private int i;

    public ObjIntClone(int i) {
        this.i = i;
    }

    public Object clone() {
        Object o = null;
        try {
            o = (ObjIntClone)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
class ObjInt {
    private int i;

    public ObjInt(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
class Obj{
    private int i;
    private Date birth;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
