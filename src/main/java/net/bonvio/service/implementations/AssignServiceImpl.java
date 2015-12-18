package net.bonvio.service.implementations;

import net.bonvio.service.generic.implementations.GenericServiceImpl;
import net.bonvio.model.Assign;
import net.bonvio.service.interfaces.AssignService;
import org.springframework.stereotype.Service;


/**
 * Created by igorjan on 18.12.15.
 * Banana
*/

@Service

public class AssignServiceImpl extends GenericServiceImpl<Assign> implements AssignService {}
