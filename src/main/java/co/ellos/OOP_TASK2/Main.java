package co.ellos.OOP_TASK2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        final Random random = new Random(); // For more interest
        Printer printer = new Printer(); //For debug only

        Boar kolya = new Boar(3, "Kolya", true); //Создать кабана по имени Коля

        Vulture yaroslav = new Vulture(2, "Yaroslav", true); //Создать стервятника Ярослава

        Fish[] kosiak = {(new Fish(3, "Varvara", true)), (new Fish(3, "Tamara", true))}; //Создать массив из 2 рыб (1 рыба Варвара, 2 рыба Тамара)

        Crocodile[] crocs = {(new Crocodile(5, "Ivan", true)), (new CrocodilePorohobot(7, "Dima", true))}; //Создать массив из 2 крокодилов ( 1 крокодил Иван, 2 крокодил-порохобот Дима)

        TwoLeggedWalkers[] dolboeby = new TwoLeggedWalkers[10];
        for (int i = 0; i < 10; i++) {
            dolboeby[i] = new TwoLeggedWalkers(random.nextInt(100), "name" + i, true);
        } //Создать массив из 10 зеленых-двуногих ( имена дать рандомные, возраст тоже )

        printer.printAge(dolboeby); //For debug only
        System.out.println("Sorted into:"); //For debug only

        for (int i = 0; i < dolboeby.length; i++) {
            TwoLeggedWalkers objMin = dolboeby[i];

            for (int j = i; j < dolboeby.length; j++)
                if (dolboeby[j].age < objMin.age) {
                    objMin = dolboeby[j];
                    TwoLeggedWalkers tempStorage = dolboeby[i];
                    dolboeby[i] = dolboeby[j];
                    dolboeby[j] = tempStorage;
                }
        } //Отсортировать зеленых-двуногих по возрасту

        printer.printAge(dolboeby); //For debug only

        kolya.walks(); //Кабан бегает

        for (int i = 0; i < kosiak.length; i++) {
            kosiak[i].swims();
        } //Рыбы плывут

        kolya.talks(); //Кабан кричит

        for (int i = 0; i < kosiak.length; i++) {
            kosiak[i].talks();
        } //Рыбы кричат

        for (int i = 0; i < crocs.length; i++) {
            crocs[i].talks();
        } //Крокодилы кричат

        for (int i = 0; i < dolboeby.length; i++) {
            dolboeby[i].talks();
        } //Зеленые-двуногие кричат

        kolya.feeds(kosiak[0]); //Кабан сьел 1 рыбу из массива

        crocs[0].feeds(kolya); //Крокдил Иван сьел кабана

        for (int i = 0; i < kosiak.length; i++) {
            crocs[1].feeds(kosiak[i]);
        } //Крокодил Дима сьел массив рыб

        for (int i = 0; i < kosiak.length; i++) {
            crocs[0].feeds(kosiak[i]);
        } //Крокодил Иван сьел массив рыб

        crocs[0].feeds(kolya); //Крокодил Дима попытался сьесть Кабана, но увидел что это его труп и не сьел

        yaroslav.feeds(kolya); //Стервятник Ярослав сьел Кабана

        for (int i = 0; i < dolboeby.length; i++) {
            crocs[1].feeds(dolboeby[i]);
        } //Крокодил Дима сожрал всех зеленых-двуногих

        crocs[0].feeds(crocs[1]); //Крокодил Иван съел Крокодила Диму

        crocs[0].feeds(yaroslav); //Крокодил Иван пытается съесть Стервятника

    }
}