package com.dedsec.CoreClass;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;

public class App {
    public static void main(String[] args) throws IntrospectionException {
//        String s="hello";
////        String s1=new String(new char[]{'h','e','l','l','0'});
//        String s1="hello";
//        s=s.toUpperCase();
//        System.out.println(s);
//        System.out.println(s.equals(s1));//false
//        System.out.println(s.equalsIgnoreCase(s1));//true
//        System.out.println(s.contains("LLO"));//true
//        ----------------------------------------------------------------------
//        StringBuilder sb=new StringBuilder(1024);
//        for(int i=0;i<999;i++){
//            sb.append(i);
//        }
//        System.out.println(sb);//0-998
//
//        StringBuilder sb2=new StringBuilder();
//        sb2.append("Hello").append("world").append("!").insert(3,"insert");
//        System.out.println(sb2);//Helinsertloworld
//        -------------------------------------------------------------------------------------\

//        String names[] = {"aaa","bbb","ccc"};
//        StringJoiner sj=new StringJoiner(":","start","end");
////        for(String name:names){
////            sj.add(name);
////        }
////        System.out.println(sj);//aaa:bbb:ccc
////        for(String name:names){
////            sj.add(name);
////        }
////        System.out.println(sj);//startaaa:bbb:cccend
//        System.out.println(String.join("", names));//aaabbbccc
//         ---------------------------------------------------------------------------------------------
//        String s=null;
//        int n=null;//err

//        Integer n=null;
//        Integer n2=new Integer(999);
//        int n3=n2.intValue();

//        ----------------------------------------------------------------------------------------------------
        BeanInfo beanInfo= Introspector.getBeanInfo(PersonBean.class);
        System.out.println(beanInfo);
    }
}
