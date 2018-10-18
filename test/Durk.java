package test;

import javax.print.DocFlavor;

public class Durk extends Birds{
    public Durk(String name){
        this.name = name;
    }
    public void swim(){
        System.out.println("class Durk"+this.name);
    }
}
