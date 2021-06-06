package de.kohler.todoapi.todoItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/item")
public class TodoItemController {
    @Autowired
    private TodoItemRepository todoItemRepository;

    @CrossOrigin(origins = "*")
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/add"
    )
    public @ResponseBody String addTodoItem (@RequestBody String name) {
        TodoItem item = new TodoItem();
        item.setName(name);
        todoItemRepository.save(item);
        return String.format("Saved %s", name);
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/all")
    public @ResponseBody Iterable<TodoItem> getAllItems() {
        return todoItemRepository.findAll();
    }
}
