package org.example.lesson_14_complex_task.task_1;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class EntityManager<T extends Entity> {
    private List<T> entityes;

    public EntityManager() {
        entityes = new CopyOnWriteArrayList<>();
    }

    public void add(T entity) {
        this.entityes.add(entity);
    }

    public boolean remove(T entity) {
        return this.entityes.remove(entity);
    }

    public List<T> getEntityes() {
        return List.copyOf(this.entityes);
    }

    public List<T> filterByAge(int minAge, int maxAge) {
        return entityes.stream()
                .filter(value -> minAge <= value.getAge() && value.getAge() <= maxAge)
                .collect(Collectors.toList());
    }

    public List<T> filterByName(String name) {
        return entityes.stream()
                .filter(value -> name.equals(value.getName()))
                .collect(Collectors.toList());
    }

    public List<T> filterByActive(boolean isActive) {
        return entityes.stream()
                .filter(value -> isActive == value.isActive())
                .collect(Collectors.toList());
    }
}
