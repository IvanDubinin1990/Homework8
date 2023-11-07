import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут

        Random ran = new Random();
        int[] arrPeopleWeight = new int[10];
        float summaWeight = 0;
        int count = 0;

        System.out.println("Вес 10 людей (в кг.): ");

        for (int i = 0; i < arrPeopleWeight.length; i++) {
            arrPeopleWeight[i] = ran.nextInt(60) + 40;
            System.out.print(arrPeopleWeight[i] + " ");
            summaWeight += arrPeopleWeight [i];
            if (arrPeopleWeight[i] > 60 && arrPeopleWeight[i] <= 80) {
                count++;
            }
        }

        System.out.println();
        float averageWeight = summaWeight / arrPeopleWeight.length;
        System.out.printf("Средний вес людей составляет: %.2f", averageWeight);
        System.out.println();
        if (count == 2 || count == 3 || count == 4) {
            System.out.println("В данном массиве " + count + " человека с весом от 60 до 80 кг.");
        }else{
            System.out.println("В данном массиве " + count + " человек с весом от 60 до 80 кг.");
        }
    }
}
