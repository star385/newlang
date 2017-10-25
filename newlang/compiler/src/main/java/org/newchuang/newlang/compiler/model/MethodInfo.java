package org.newchuang.newlang.compiler.model;

import java.util.List;

import org.newchuang.newlang.compiler.model.constants.DataType;
import org.newchuang.newlang.compiler.model.constants.Visibility;

public class MethodInfo {

    private Visibility visibility;

    private DataType returnType;

    private List<Statement> statements;

    private List<MethodParameter> parameters;

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public DataType getReturnType() {
        return returnType;
    }

    public void setReturnType(DataType returnType) {
        this.returnType = returnType;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    public List<MethodParameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<MethodParameter> parameters) {
        this.parameters = parameters;
    }
}
