package pl.akademiakodu.taskMenager.dao;

import pl.akademiakodu.taskMenager.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskDaoImp implements TaskDao {

    private static List<Task> tasks = new ArrayList<>();

    @Override
    public List<Task> findAll() {
        return null;
    }

    @Override
    public void add(Task task) {

    }

    @Override
    public Task findById(int id) {
        return tasks.stream().
                filter(task -> task.getId()==id).
                findFirst().get();
    }

    @Override
    public void deleteById(int id) {
        Task task = findById(id);
        tasks.remove(task);

    }
}
