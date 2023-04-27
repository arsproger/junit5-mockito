package com.example.junit5itacademystarter;

import java.util.ArrayList;
import java.util.List;

public class Array {
    public Integer maxValueList(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).max().orElse(0);
    }

    public List<Integer> sumBinaryList(List<Integer> list1, List<Integer> list2) {
        if (list1.size() != list2.size()) {
            throw new IllegalArgumentException("Массивы должны иметь одинаковую длину");
        }

        // Создаем массив для хранения результата
        List<Integer> result = new ArrayList<>();

        // Вычисляем сумму соответствующих элементов и записываем результат в массив
        for (int i = 0; i < list1.size(); i++) {
            result.add(list1.get(i) + list2.get(i));
        }

        return result;
    }

    public List<Integer> onlyEvenValue(List<Integer> list) {
        return list.stream().filter(e -> e % 2 == 0).toList();
    }

}
