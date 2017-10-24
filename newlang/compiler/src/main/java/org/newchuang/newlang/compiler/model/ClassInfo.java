package org.newchuang.newlang.compiler.model;

import java.util.List;

public class ClassInfo {

    private String className;

    private List<PropertyInfo> propertyInfos;

    private List<MethodInfo> methodInfos;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<PropertyInfo> getPropertyInfos() {
        return propertyInfos;
    }

    public void setPropertyInfos(List<PropertyInfo> propertyInfos) {
        this.propertyInfos = propertyInfos;
    }

    public List<MethodInfo> getMethodInfos() {
        return methodInfos;
    }

    public void setMethodInfos(List<MethodInfo> methodInfos) {
        this.methodInfos = methodInfos;
    }
}
