package org.newchuang.newlang.compiler.model;

import org.newchuang.newlang.compiler.model.constants.DataType;

public class MethodParameter {

    private String name;

    private DataType dataType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

}
