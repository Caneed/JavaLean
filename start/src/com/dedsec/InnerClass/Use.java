package com.dedsec.InnerClass;

public class Use {
    public static void main(String[] args) {
        OuterClass outer=new OuterClass();
        OuterClass.InnerClass inner=outer.new InnerClass();
        StaticNestedClass stc=new StaticNestedClass();
        StaticNestedClass.Nested nested=new StaticNestedClass.Nested("aaa");
    }
}
