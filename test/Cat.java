package test;

import javax.print.DocFlavor;

public class Cat extends Beast {
    protected String color;

    public Cat (String name, int powsNumer, String color){
        this.name = name;
        this.powsNumber = powsNumer;
        this.color = color;
    }
    public void catInfo (){
        System.out.println("class Cat"+name+"color"+color+"dfvd  "+powsNumber);
    }
}
