package Sotrudniki2;

public class a2 {
    public static void main(String[] args ) {
        a1[] s = new a1 [5];
        s[0] = new a1("Иванов Иван Иванович", "Инженер", "vanov@gmail.com", 447865, 38000, 34);
        s[1] = new a1("Динисов Михаил Анатольевич", "Водитель", "mihail@gmail.com", 552334, 21500, 54);
        s[2] = new a1("Тюрин Евгений Игорьевич", "Маркшрейдер", "jenya@gmail.com", 687698, 54000, 27);
        s[3] = new a1("Талипов Александр Викторович", "Проходчик", "sasha@gmail.com,", 899887, 69300, 42);
        s[4] = new a1("Карибов Владимир Романович", "Электрик", "vladimir@gmail.com", 988977, 39000, 44);
        for(int i = 0; i<s.length; i++){
            s[i].VOZRAST();
        }
    }
}
