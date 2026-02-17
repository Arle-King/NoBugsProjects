package org.example.lesson_14_complex_task.task_6;

import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.DelayQueue;
import java.util.stream.Collectors;

public class TaskService<T extends Task> {

    private PriorityQueue<Task> priorityQueue;

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

    public Deque<Task> sortAbcByDate() {
        return priorityQueue.stream().sorted(Comparator.comparing(Task::getDate))
                .collect(Collectors.toCollection(LinkedList::new));
    }

    public PriorityQueue<Task> sortDeskByDate() {
        return priorityQueue.stream().sorted(Comparator.comparing(Task::getDate, Comparator.reverseOrder()))
                .collect(Collectors.toCollection(PriorityQueue::new));
    }

    public PriorityQueue<Task> getPriorityQueue() {
        return new PriorityQueue<>(priorityQueue);
    }
}
