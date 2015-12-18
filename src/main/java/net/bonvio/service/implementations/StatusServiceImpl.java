package net.bonvio.service.implementations;

import net.bonvio.service.generic.implementations.GenericServiceImpl;
import net.bonvio.model.Status;
import net.bonvio.service.interfaces.StatusService;
import org.springframework.stereotype.Service;


/**
 * Created by igorjan on 18.12.15.
 * Banana
*/

@Service

public class StatusServiceImpl extends GenericServiceImpl<Status> implements StatusService {}
