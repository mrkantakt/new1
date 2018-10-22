package Sotrudniki2;
public class a1 {
        String FIO;
        String DOLJNOST;
        String EMAIL;
        int TELEFON;
        int ZARPLATA;
        int VOZRAST;

        public a1 (String FIO, String DOLJNOST, String EMAIL, int TELEFON, int ZARPLATA, int VOZRAST){
            this.FIO = FIO;
            this.DOLJNOST = DOLJNOST;
            this.EMAIL = EMAIL;
            this.TELEFON = TELEFON;
            this.ZARPLATA = ZARPLATA;
            this.VOZRAST = VOZRAST;
        }
        public void Info1() {
            System.out.println();
            System.out.println("Сотрудник");
            System.out.println("ФИО: " + FIO);
            System.out.println("Должность: " + DOLJNOST);
            System.out.println("Email: " + EMAIL);
            System.out.println("Номер телефона: " + TELEFON);
            System.out.println("Зарплата: " + ZARPLATA);
            System.out.println("Возраст: " + VOZRAST);
        }
        public void Info2(){
            System.out.print("Сотрудник не подходит по возрасту");
        }

        public void VOZRAST(){
            if (VOZRAST >= 40){
                System.out.println();
                Info1();
            }
            else {
                System.out.println();
                Info2();
            }
        }
}
