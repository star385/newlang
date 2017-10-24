package org.newchuang.newlang.compiler.model;

import org.newchuang.newlang.compiler.model.constants.DataType;
import org.newchuang.newlang.compiler.model.constants.MemberType;
import org.newchuang.newlang.compiler.model.constants.Visibility;

public class PropertyInfo {

    private Visibility visibility;

    private DataType dataType;

    private MemberType memberType;

    private String type;

    private String fieldName;

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public MemberType getMemberType() {
        return memberType;
    }

    public void setMemberType(MemberType memberType) {
        this.memberType = memberType;
    }
}
