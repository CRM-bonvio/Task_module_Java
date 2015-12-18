package net.bonvio.controller.implementations;

import net.bonvio.controller.generic.implementations.GenericControllerImpl;
import net.bonvio.model.AssignToPerformer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by igorjan on 18.12.15.
 * Banana
*/

@Controller
@RequestMapping("/assigntoperformer")
public class AssignToPerformerController extends GenericControllerImpl<AssignToPerformer> {}
