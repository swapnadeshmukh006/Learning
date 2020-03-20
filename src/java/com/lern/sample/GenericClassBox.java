package com.lern.sample;

public class GenericClassBox<T> {
    private T t;
    public void add(T t){
        this.t = t;
    }
    public T get(){
        return t;
    }

    public static void main(String[] args) {
        GenericClassBox<Integer> integerbox = new GenericClassBox<Integer>();
        GenericClassBox<String> stringBox = new GenericClassBox<String>();
        integerbox.add(new Integer(10) );
        stringBox.add(new String("Hello World"));
        System.out.printf("Integer Value :%d\n\n", integerbox.get());
        System.out.printf("String Value :%s\n", stringBox.get());


    }
}
