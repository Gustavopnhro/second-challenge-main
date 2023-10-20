package dio.me.secondchallenge.service.impl;



import org.springframework.stereotype.Service;
import dio.me.secondchallenge.domain.model.Task;
import dio.me.secondchallenge.domain.repository.TaskRepository;
import dio.me.secondchallenge.service.TaskService;

import java.util.NoSuchElementException;

@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;


    public TaskServiceImpl(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    @Override
    public Task findById(Long id) {
        return taskRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Task create(Task taskToCreate) {
        if (taskRepository.existsById(taskToCreate.getId())) {
            throw new IllegalArgumentException("This Task already exists.");
        }
        return taskRepository.save(taskToCreate);
    }
}
