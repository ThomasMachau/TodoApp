package de.kohler.todoapi.item;

import org.springframework.data.repository.CrudRepository;

public interface TodoItemRepository extends CrudRepository<TodoItem, Integer> {

}
