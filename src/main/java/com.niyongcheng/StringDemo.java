package com.niyongcheng;

public class StringDemo {

    public static void main(String[] args){
        String str1 = "abc";
        String str2 = new String("abc");
        String str3 = str2.intern();

        //string constant pool and heap
        //if we use new String() to init the String Object, it will create this object on heap
        //if we use "" or .inter(), it will init this object in the pool and return it directly
        //so the str1 == str3 is true, other two cases are false
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str1 == str3);
    }
}
