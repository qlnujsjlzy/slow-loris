package ${basePackage}.controller;

import ${basePackage}.service.${modelNameUpperCamel}Service;
import org.springframework.web.bind.annotation.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

/**
*    @author  : ${user}
*    @email   : ${author}@lenovo.com
*    @version : v1.0
*    @time    : ${date}
*/
@RestController
@RequestMapping("${baseRequestMapping}")
public class ${modelNameUpperCamel}Controller {
private final static Logger LOGGER = LogManager.getLogger();

@Autowired
private ${modelNameUpperCamel}Service ${modelNameLowerCamel}Service;

}
