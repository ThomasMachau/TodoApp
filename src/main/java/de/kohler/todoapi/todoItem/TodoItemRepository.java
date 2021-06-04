package de.kohler.todoapi.todoItem;

import org.springframework.data.repository.CrudRepository;

public interface TodoItemRepository extends CrudRepository<TodoItem, Integer> {

}
