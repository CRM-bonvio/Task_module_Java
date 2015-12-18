package net.bonvio.controller.implementations;

import net.bonvio.model.Employee;
import net.bonvio.controller.generic.implementations.GenericControllerImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mil on 27.11.15.
 * Banana
 */

@Controller
@RequestMapping("/employee")
public class EmployeeController extends GenericControllerImpl<Employee> {}
