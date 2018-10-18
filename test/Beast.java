package test;

public class Beast extends Animal {
    protected int powsNumber;

    public Beast(){
        this.name = "blablabla";
        this.powsNumber = 4;
    }
    public  Beast (String name, int powsNumber){
        this.name = name;
        this.powsNumber = powsNumber;
    }
    public void beastInfo(){
        System.out.println("class Beast: "+name+"with"+powsNumber+"paws");
    }
}
