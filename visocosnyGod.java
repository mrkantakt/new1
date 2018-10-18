public class LogikOper2902 {
    public static void main(String[] args){
        int month=2;
        int year=2018;
        int numDeys;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDeys = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDeys = 30;
                break;
            case 2:
                if (((year % 4 == 0) && (year % 100 == 0)) || (year % 400 == 0))
                    numDeys = 29;
                else
                    numDeys = 28;
             break;
            default:
            numDeys = 0;
            System.err.println("Не существующий месяц");
            break;
        }
        System.err.println("В месяц" + numDeys + "Дней");
    }
}
