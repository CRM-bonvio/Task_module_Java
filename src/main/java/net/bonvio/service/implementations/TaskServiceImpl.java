package net.bonvio.service.implementations;

import net.bonvio.model.Task;
import net.bonvio.service.generic.GenericServiceImpl;
import net.bonvio.service.interfaces.TaskService;
import org.springframework.stereotype.Service;

/**
 * Created by igorjan on 15.12.15.
 * Banana
 */

@Service
public class TaskServiceImpl extends GenericServiceImpl<Task> implements TaskService {}
