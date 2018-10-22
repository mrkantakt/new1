package Animals;

public abstract class Animals{
    protected String name;
    protected int run;
    protected int jamp;
    protected int swit;

    public Animals(String name, int run, int jamp, int swit) {
        this.name = name;
        this.run = run;
        this.jamp = jamp;
        this.swit = swit;

    }

    public String Animals (){
        return name;
    }

    abstract  public void render();
}
