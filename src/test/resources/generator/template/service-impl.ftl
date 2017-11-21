package ${basePackage}.service.impl;

import ${basePackage}.dao.mapper.${modelNameUpperCamel}Mapper;
import ${basePackage}.service.${modelNameUpperCamel}Service;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;


/**
*    @author  : ${user}
*    @email   : ${author}@lenovo.com
*    @version : v1.0
*    @time    : ${date}
*/
@Service
public class ${modelNameUpperCamel}ServiceImpl  implements ${modelNameUpperCamel}Service {
private final static Logger LOGGER = LogManager.getLogger();

@Autowired
private ${modelNameUpperCamel}Mapper ${modelNameLowerCamel}Mapper;

}
