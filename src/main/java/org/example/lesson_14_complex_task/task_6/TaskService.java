package org.example.lesson_14_complex_task.task_6;

import java.util.*;
import java.util.stream.Collectors;

public class TaskService<T extends Task> {

    private PriorityQueue<T> priorityQueue;

    public TaskService() {
        priorityQueue = new PriorityQueue<>();
    }

    public boolean addTask(T task) {
        if (priorityQueue.stream().noneMatch(x -> task.getId().equals(x.getId()))) return priorityQueue.add(task);
        return false;
    }

    public synchronized void removeTask(T task) {
        priorityQueue.removeIf(x -> x.getId().equals(task.getId()));
    }

    public PriorityQueue<Task> filterByStatus(boolean isStatus) {
        return priorityQueue.stream()
                .filter(x -> x.isStatus() == isStatus)
                .collect(Collectors.toCollection(PriorityQueue::new));
    }

    public PriorityQueue<Task> filterByPriority(int min, int max) {
        return priorityQueue.stream()
                .filter(task -> task.getPriority() >= min && task.getPriority() <= max)
                .collect(Collectors.toCollection(PriorityQueue::new ));
    }

    public List<Task> sortAbcByDate() {
        return priorityQueue.stream().sorted(Comparator.comparing(Task::getDate))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public List<Task> sortDeskByDate() {
        return priorityQueue.stream().sorted(Comparator.comparing(Task::getDate, Comparator.reverseOrder()))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public PriorityQueue<Task> getPriorityQueue() {
        return new PriorityQueue<>(priorityQueue);
    }
}
