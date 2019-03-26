package com.chapter08.javaExer;

/**
 * @author zxfcode
 * @create 2018-11-18 23:24
 */
public class InnerDemo {
    public static void main(String[] args) {
        OuterClass001 out001 = new OuterClass001();
        OuterClass001.InnerClass001 inner001 = out001.new InnerClass001();
        OuterClass001.InnerClass002 inner002 = new OuterClass001.InnerClass002();
    }
}
class OuterClass001{
    class InnerClass001{}
    static class InnerClass002{}
}