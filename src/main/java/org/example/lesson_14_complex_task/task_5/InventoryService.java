package org.example.lesson_14_complex_task.task_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InventoryService {

    public static boolean isInventoryOpen = false;

    Map<String, List<Product>> map;

    public InventoryService() {
        map = new HashMap<>();
    }

    public boolean addProduct(Product product) {
        if (!isInventoryOpen) {
            return false;
        }
        return map.computeIfAbsent(product.getCategory(), k -> new ArrayList<>()).add(product);
    }

    public List<Product> getProducts (String category) {
        if (!isInventoryOpen) {
            return null;
        }
        if (!map.containsKey(category)) {
            throw new OutOfStockException("Такой категории не существует");
        }
        //return map.get(category); // сделал через stream
        return map.entrySet()
                .stream()
                .filter(K -> K.getKey().equals(category))
                .map(Map.Entry::getValue).findFirst().get();
    }

    //Страшно, очень страшно, но работает
    public List<Product> filterByPrice(int min, int max) {
        return map.entrySet()
                .stream()
                .filter(e -> e.getValue()
                        .stream()
                        .anyMatch(product ->
                                product.getPrice() >= min && product.getPrice() <= max))
                .collect(Collectors.toMap(Map.Entry::getKey,
                        product -> product
                                .getValue()
                                .stream()
                                .filter(e -> e.getPrice() >= min && e.getPrice() <= max)
                                .collect(Collectors.toList())))
                .values().stream().flatMap(List::stream).collect(Collectors.toList());
    }

}
