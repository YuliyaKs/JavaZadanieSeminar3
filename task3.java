// Задание
// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;

public class task3 {
    public static void main(String[] args) {
        // Создаем произвольный список целых чисел
        ArrayList<Integer> ar_list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 15; i++) {
            ar_list.add(r.nextInt(30));
        }
        System.out.println(ar_list);

        // 1) Нужно удалить из него чётные числа
        Iterator<Integer> iterator = ar_list.iterator();
        while (iterator.hasNext()) { 
            int i = iterator.next();
            if (i % 2 == 0) iterator.remove();
        }
        System.out.println(ar_list);

        // 2) Найти минимальное значение
        int min = ar_list.get(0);
        for (Integer item : ar_list) {
            if (item < min) min = item;
        }
        System.out.println("Минимальное значение равно " + min);

        // 3) Найти максимальное значение
        int max = ar_list.get(0);
        for (Integer item : ar_list) {
            if (item > max) max = item;
        }
        System.out.println("Максимальное значение равно " + max);

        // 4) Найти среднее значение
        double[] sum = {0};
        ar_list.forEach(n -> sum[0] += n);
        double mean = sum[0] / ar_list.size();
        System.out.println(String.format("Среднее значение равно %.2f ", mean));
    }
}
