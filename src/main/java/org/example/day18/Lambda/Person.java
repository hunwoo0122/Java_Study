package org.example.day18.Lambda;

public class Person {
    public void action1(Workable w, String name, String job){
        w.work(name, job);
    }

    public void action2(Speakable s, String content){
        s.speak(content);
    }
}
