package dio.me.secondchallenge.service;

import dio.me.secondchallenge.domain.model.Task;

public interface TaskService {
    
    Task findById(Long id);

    Task create(Task taskToCreate);
}
