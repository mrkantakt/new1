package Sotrudniki;

public class Sotrudniki {
    String FIO;
    String DOLJNOST;
    String EMAIL;
    int TELEFON;
    int ZARPLATA;
    int VOZRAST;

    public Sotrudniki (String FIO, String DOLJNOST, String EMAIL, int TELEFON, int ZARPLATA, int VOZRAST){
        this.FIO = FIO;
        this.DOLJNOST = DOLJNOST;
        this.EMAIL = EMAIL;
        this.TELEFON = TELEFON;
        this.ZARPLATA = ZARPLATA;
        this.VOZRAST = VOZRAST;
    }
    public void SotrudnikiInfo(){
        System.out.println ();
        System.out.println ("Сотрудник");
        System.out.println ("ФИО: "+ FIO);
        System.out.println ("Должность: "+ DOLJNOST);
        System.out.println("Email: "+ EMAIL);
        System.out.println("Номер телефона: "+ TELEFON);
        System.out.println("Зарплата: "+ ZARPLATA);
        System.out.println("Возраст: "+ VOZRAST);
    }
}
