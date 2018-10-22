package Animals;

class Cat extends Animals {
    public Cat(String name, int run, int jamp, int swit){
        super(name, run, jamp, swit);
    }
    public static boolean RunCat (int run) {
        return (run >= 0 && run <= 3000);
    }
    public static boolean JampCat (int jamp) {
        return (jamp >= 0 && jamp <= 2);
    }
    public static boolean SwitCat (int swit) {
        return (swit >= 0 && swit <= 15);
    }

    public void render() {
        System.out.println();
        System.out.println("Кот: " + name );
        System.out.println("Бегает: " + run +" "+ RunCat(run));
        System.out.println("Прыгает: " + jamp +" "+ JampCat(jamp));
        System.out.println("Плавает: " + swit +" "+ SwitCat(swit));
    }
}
