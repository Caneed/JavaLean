package com.dedsec.InnerClass;

public class AnonymousClass {
    public class Outer{
        String name;
        Outer(String name){
            this.name=name;
        }

        void hello(){
            Runnable r=new Runnable() {
                @Override
                public void run() {
                    System.out.println("name is:"+Outer.this.name);
                }
            };
            new Thread(r).start();
        }
    }
}
