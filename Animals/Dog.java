package Animals;

class Dog extends Animals {
    public Dog(String name, int run, int jamp, int swit){
        super(name, run, jamp, swit);
    }
    public static boolean RunCat (int run) {
        return (run >= 0 && run <= 5500);
    }
    public static boolean JampCat (int jamp) {
        return (jamp >= 0 && jamp <= 1);
    }
    public static boolean SwitCat (int swit) {
        return (swit >= 0 && swit <= 80);
    }

    public void render() {
        System.out.println();
        System.out.println("Собака: " + name );
        System.out.println("Бегает: " + run +" "+ RunCat(run));
        System.out.println("Прыгает: " + jamp +" "+ JampCat(jamp));
        System.out.println("Плавает: " + swit +" "+ SwitCat(swit));
    }
}

