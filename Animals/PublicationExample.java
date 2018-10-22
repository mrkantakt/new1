package Animals;

public class PublicationExample {
    public static void main(String[] args){
        Animals[] Animals = new Animals[8];

        Animals[0]= new Cat("Барсик", 1000, 1,10);
        Animals[1]= new Cat("Муська", 2000, 2, 20);
        Animals[2]= new Cat("Рыжик", 3000, 3, 30);
        Animals[3]= new Cat("Пушок", 4000, 2, 15);

        Animals[4]= new Dog("Шарик", 4000, 1,50);
        Animals[5]= new Dog("Бобик", 5000, 2, 46);
        Animals[6]= new Dog("Бакс", 6000, 2, 147);
        Animals[7]= new Dog("Арон", 7000, 3, 100);

        for (Animals pub : Animals){
            pub.render();
        }

    }
}
