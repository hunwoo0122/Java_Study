package org.example.day18.DesignPattern;

public class ObjectCreateFactory {
    public Object getInstance(String name) {
           if (name.equalsIgnoreCase("apple")){
               return new AppleClass();
           }else if (name.equalsIgnoreCase("banana")){
               return new BananaClass();
           }else{
               return null;
           }
    }
}
