package com.wordnik.swagger.codegen.config;

import com.wordnik.swagger.codegen.MethodArgument;
import com.wordnik.swagger.codegen.ResourceMethod;

import java.util.List;

public interface DataTypeMappingProvider2 {
    public String getArgumentDefinition(ResourceMethod method, MethodArgument arg);
    public List<String> getJsonIncludes();
}
