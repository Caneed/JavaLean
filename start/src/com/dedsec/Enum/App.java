package com.dedsec.Enum;

public class App {
    public static void main(String[] args) {
        System.out.println(WeekDay.MON);//1
        System.out.println(WeekDay.TUE);//2
        System.out.println(WeekDay.WED);//3
        System.out.println(WeekDay.THR);//4
        System.out.println(WeekDay.FRI);//5
        System.out.println(WeekDay.SAT);//6
        System.out.println(WeekDay.SUN);//7
        if(WeekDay.SUN==9){
            System.out.println(true);
        }
//        int day = 1;
//        System.out.println(day == weeks.SUN);//error
        weeks day=weeks.FRI;
        System.out.println(day == weeks.FRI);//true
        System.out.println(day.equals(weeks.FRI));//true

        System.out.println(Color.RED.name());//RED
        System.out.println(Color.RED.ordinal());//0
    }
}
