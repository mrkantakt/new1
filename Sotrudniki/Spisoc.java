package Sotrudniki;

public class Spisoc {
    public static void main(String[] args ){
        Sotrudniki sotrudnik1=new Sotrudniki("Иванов Иван Иванович", "Инженер", "vanov@gmail.com", 447865, 38000, 34);
        Sotrudniki sotrudnik2=new Sotrudniki("Динисов Михаил Анатольевич", "Водитель", "mihail@gmail.com", 552334, 21500, 24);
        Sotrudniki sotrudnik3=new Sotrudniki("Тюрин Евгений Игорьевич", "Маркшрейдер", "jenya@gmail.com", 687698, 54000, 27);
        Sotrudniki sotrudnik4=new Sotrudniki("Талипов Александр Викторович", "Проходчик", "sasha@gmail.com,", 899887, 69300, 42);
        Sotrudniki sotrudnik5=new Sotrudniki("Карибов Владимир Романович", "Электрик", "vladimir@gmail.com", 988977, 39000, 44 );
        sotrudnik1.SotrudnikiInfo();
        sotrudnik2.SotrudnikiInfo();
        sotrudnik3.SotrudnikiInfo();
        sotrudnik4.SotrudnikiInfo();
        sotrudnik5.SotrudnikiInfo();



    }
}
