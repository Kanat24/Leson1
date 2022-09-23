public class Main {
    public static void main(String[] args) {
// Homework1
        // Task1
        for (int i =1; i<=10; i++){
            System.out.print (i+ " ");
        }
        System.out.println();
        //Task2
        for (int i=10; i>0; i--){
            System.out.print(i+ " ");
        }
        System.out.println();

        //Task3
        for (int i=0; i<=17; i=i+2 ){
            System.out.print(i+ " ");
        }
        System.out.println();

        //Task4
        for (int i =10; i>=-10; i--){
            System.out.print(i+ " ");
        }
        System.out.println();


// Homework 2
        //Task1
        for (int i= 1904; i<=2096; i=i+4){
            System.out.println(i+ " год является високосным");
        }


        //Task2
        for (int i=7; i<=98; i=i+7){
            System.out.print(i+ " ");
        }
        System.out.println();


        //Task3
        for (int i=1; i<=512; i=i*2){
            System.out.print(i+ " ");
        }
        System.out.println();

//Homework3
        //Task1
        int sum = 29000;
        int total = 0;
        for (int i=1; i<=12; i++){
            total=total+sum;
            System.out.println("Месяц "+ i+ ", сумма накоплений равна "+ total + " рублей");
        }


        //Task2
        float summa=29000f;
        float total1 = 0f;
        for (int i=1; i<=12; i++){
            summa = summa + summa/100;
            total1 = summa + total1;
            System.out.printf("\n" +"Месяц "+ i+ ", сумма накоплений равна "+ "%.2f" + " рублей", total1);
        }


    }
}