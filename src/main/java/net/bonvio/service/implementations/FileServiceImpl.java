package net.bonvio.service.implementations;

import net.bonvio.service.generic.implementations.GenericServiceImpl;
import net.bonvio.model.File;
import net.bonvio.service.interfaces.FileService;
import org.springframework.stereotype.Service;


/**
 * Created by igorjan on 18.12.15.
 * Banana
*/

@Service

public class FileServiceImpl extends GenericServiceImpl<File> implements FileService {}
