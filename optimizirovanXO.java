import java.util.Random;
import java.util.Scanner;

public class optimizirovanXO {

    //блок настроек игры
    private static char[][] map; //матрица игры
    private static final int SIZE = 3; //размерность поля

    private static final char DOT_EMPTY='+'; //символ свободного поля
    private static final char DOT_X='X'; //символ Х
    private static final char DOT_O='O'; //символ О

    private static final boolean SILLY_MODE = false; //режим глупого компьютера
    private static final boolean SCORING_MODE = true; //режим быстрого компьютера

    private static Scanner scanner=new Scanner(System.in); //для ввода пользователем
    private static Random random=new Random();

    public static void main(String[] args) { //в методе mein и последующих методах будем строить логику игры
        initMap(); //инициализация игры
        printMap(); //показывает символы свободного поля
        while (true) { //бесконечный цикл
            humanTurn(); //ход человека
            if (isEndGame(DOT_X)) { //если игра закончилась крестиком
                break; //тогда выход из игры
            }
            computerTurn(); //ход компьютера
            if (isEndGame(DOT_O)) { //если игра заканчивается ноликом
                break; // тогда выход из игры
            }
        }
        System.out.println("Игра окончена");
    }
    private static void initMap(){ //метод подготовки игрового поля
        map=new char[SIZE][SIZE];
        for (int i=0; i<SIZE; i++){
            for (int j=0; j<SIZE; j++){
                map[i][j]=DOT_EMPTY;
            }
        }
    }
    private static void printMap(){ //метод вывода игрового поля на экран
        for (int i=0; i<SIZE; i++){ //отоброжение горизонтальных координат
            System.out.print("  "+(i+1)); //верхнее 1 2 3
        }
        System.out.println();
        for (int i=0; i<SIZE; i++){ //строка поля
            System.out.print((i+1)+" "); //отоброжение вертикальных координат
            for (int j=0; j<SIZE; j++){ //столбец поля
                System.out.print(map[i][j]+"  "); //отображение таблицы поля
            }
            System.out.println();
        }
        System.out.println();
    }
    private static void humanTurn(){ //ход человеком
        int x, y; //координаты строки и столбца
        do{
            System.out.println("Введите координаты ячейки через пробел");
            y = scanner.nextInt() -1;
            x = scanner.nextInt() -1;
        }while(!isCellValid(x,y));

        map[y][x]=DOT_X;
    }


    private static void computerTurn(){
        int x = -1;
        int y = -1;

        if (SILLY_MODE) {
            do {
                y = random.nextInt(SIZE);
                x = random.nextInt(SIZE);
            } while (!isCellValid(x, y));
        }
        else { // компьютер ищет свой символ и решает можно ли продолжить последовательность для выйгрыша
            if (!SCORING_MODE){ //маркер того что ход найден
                boolean moveFound = false;
                //упрощённый алгоритм
                for (int i=0; i<SIZE; i++){
                    for (int j=0; j<SIZE; j++){ //обходим массив
                        if (map[i][j]==DOT_EMPTY){ //если мы работаем с пустой клеткой то начинаем определять текущее значение
                            if ( i-1 >=0 && j-1 >=0 && map[i-1][j-1] == DOT_O){ //диагональ - лево верх
                                y = i;
                                x = j;
                                moveFound = true;
                                System.out.println("LU ");
                            }
                            else if(i-1>=0 && map[i-1][j] == DOT_O){ //вверх
                                y = i;
                                x = j;
                                moveFound = true;
                                System.out.println("U ");
                            }
                            else if(i-1>=0 && j+1 < SIZE && map[i-1][1+1] == DOT_O){ //диагональ вверх право
                                y = i;
                                x = j;
                                moveFound = true;
                                System.out.println("RU ");
                            }
                            else if(j+1 < SIZE && map[i][j+1] == DOT_O){ //право
                                y = i;
                                x = j;
                                moveFound = true;
                                System.out.println("R ");
                            }
                            else if(i+1 < SIZE && j + 1 <SIZE && map[i+1][j+1] == DOT_O){ //диагональ право низ
                                y = i;
                                x = j;
                                moveFound = true;
                                System.out.println("RD ");
                            }
                            else if(i+1<SIZE&&map[i+1][j]==DOT_O){ // низ
                                y = i;
                                x = j;
                                moveFound = true;
                                System.out.println("B ");
                            }
                            else if(i+1<SIZE && j-1>=0&&map[i+1][j-1]==DOT_O){ // диагональ низ лево
                                y = i;
                                x = j;
                                moveFound = true;
                                System.out.println("LB ");
                            }
                            else if(j-1>=0&&map[i][j-1] == DOT_O){ // лево
                                y = i;
                                x = j;
                                moveFound = true;
                                System.out.println("L ");
                            }
                        }
                        if (moveFound){
                            break;
                        }
                    }
                    if (moveFound){
                        break;
                    }
                }


            }
            else{
                int maxScoreFieldX = -1;
                int maxScoreFieldY = -1;
                int maxScore = 0;

                for(int i=0; i<SIZE; i++){
                    for(int j=0; j<SIZE; j++){
                        int fieldScore = 0;

                        if(map[i][j] == DOT_EMPTY){

                            if ( i-1 >=0 && j-1 >=0 && map[i-1][j-1] == DOT_O){
                                fieldScore++;
                                System.out.println("LU ");
                            }
                            if(i-1>=0 && j+1 < SIZE && map[i-1][1+1] == DOT_O){
                                fieldScore++;
                                System.out.println("U ");
                            }
                            if(j+1 < SIZE && map[i][j+1] == DOT_O){
                                fieldScore++;
                                System.out.println("RU ");
                            }
                            if(i+1 < SIZE && j + 1 <SIZE && map[i+1][j+1] == DOT_O){
                                fieldScore++;
                                System.out.println("R ");
                            }
                            if(i+1 < SIZE && j + 1 <SIZE && map[i+1][j+1] == DOT_O){
                                fieldScore++;
                                System.out.println("RD ");
                            }
                            if(i+1<SIZE&&map[i+1][j]==DOT_O){
                                fieldScore++;
                                System.out.println("B ");
                            }
                            if(i+1<SIZE && j-1>=0&&map[i+1][j-1]==DOT_O){
                                fieldScore++;
                                System.out.println("BL ");
                            }
                            if(j-1>=0&&map[i][j-1] == DOT_O){
                                fieldScore++;
                                System.out.println("L ");
                            }

                        }
                        if ( fieldScore > maxScore ){
                            maxScore = fieldScore;
                            maxScoreFieldX = j;
                            maxScoreFieldY = i;
                        }
                    }
                }
                //если в цикле найденна наилучшая клетка
                if(maxScoreFieldX != -1){
                    x = maxScoreFieldX;
                    y = maxScoreFieldY;
                }
            }
            //если ни чего не нашли делаем глуппый ход
            if(x == -1){
                do {
                    y = random.nextInt(SIZE);
                    x = random.nextInt(SIZE);
                } while (!isCellValid(x, y));
                System.out.println("random");
            }

        }


        System.out.print("Компьютер выбрал ячейку "+(y+1)+" "+(x+1));
        System.out.println();
        map[y][x] = DOT_O;
    }




    private static boolean isCellValid(int x, int y){ //валидность запрашиваемой ячейки на корректность
        boolean result=true;
        if (x<0 || x>=SIZE || y<0 || y>=SIZE){ //проверка координат
            result = false;
        }
        if (map[y][x] != DOT_EMPTY){ //проверка заполненности ячейки
            result=false;
        }
        return result;
    }

    private static boolean isEndGame(char playerSymbol){ //метод проверки игры на завершение
        boolean result = false;

        printMap();

        if(chekWin(playerSymbol)){ //проверяем необходимость следующего хода
            System.out.println("Победили " + playerSymbol);
            result = true;
        }

        if(isMapFull()){ //проперка на заполненность поля
            System.out.println("Ничья");
            result = true;
        }
        return result;
    }
    private static boolean isMapFull(){
        boolean result = true;

        for (int i=0; i<SIZE;  i++){
            for (int j=0; j<SIZE; j++){
                if (map[i][j] == DOT_EMPTY) //найдена пустая клетка
                    result = false; //выход из внутреннего цикла
            }
        }
        return result;

    }
    private static boolean chekWin(char playerSymbol){
        boolean result = false;
        /*if((map[0][0] == playerSymbol && map[0][1]==playerSymbol && map[0][2]==playerSymbol) ||
           (map[1][0] == playerSymbol && map[1][1]==playerSymbol && map[1][2]==playerSymbol) ||
           (map[2][0] == playerSymbol && map[2][1]==playerSymbol && map[2][2]==playerSymbol) ||
           (map[0][0] == playerSymbol && map[1][0]==playerSymbol && map[2][0]==playerSymbol) ||
           (map[0][1] == playerSymbol && map[1][1]==playerSymbol && map[2][1]==playerSymbol) ||
           (map[0][0] == playerSymbol && map[1][2]==playerSymbol && map[2][2]==playerSymbol) ||
           (map[0][0] == playerSymbol && map[1][1]==playerSymbol && map[2][2]==playerSymbol) ||
           (map[2][0] == playerSymbol && map[1][1]==playerSymbol && map[0][2]==playerSymbol)){
            result = true;
        }*/
        if (checkWinDiagonals(playerSymbol) || checkWinLines(playerSymbol)){
            result = true;
        }
        return result;
    }
    private static boolean checkWinDiagonals(char playerSymbol){
        boolean leftRight, rightLeft, result;

        leftRight = true;
        rightLeft = true;
        result = false;

        for (int i=0; i<SIZE; i++){
            leftRight &= (map[i][i] == playerSymbol); //заменяет одной строкой ниже указанный код в коменте:
            // if(leftRight && (map[i][i] == playerSymbol)){
            //     leftRight = true;
            // }
            // else {
            //     leftRight = false
            // }
            rightLeft &= (map[SIZE-1-i][i] == playerSymbol);
        }

        if (leftRight || rightLeft){
            result = true;
        }
        return result;
    }

    private static boolean checkWinLines(char playerSymbol){
        boolean cols, rows, result;

        result = false;

        for (int col=0; col<SIZE; col++){
            cols = true;
            rows = true;

            for (int row=0; row<SIZE; row++){
                cols &= (map[col][row] == playerSymbol);
                rows &= (map[row][col] == playerSymbol);
            }
            //Это условие после каждой проверки колонки и столбца
            //позволяет остановить дальнейшее выполнение, без проверки
            //всех остальных столбцов и строк
            if (cols || rows){
                result = true;
                break;
            }
            if (result){
                break;
            }
        }
        return result;
    }


}
