package org.newchuang.newlang.compiler.model;

import org.newchuang.newlang.compiler.model.constants.StatementType;

public class Statement {

    // 语句的类型
    private StatementType statementType;

    // 语句的内容，比如赋值语句：a = b
    private String content;

    // 赋值的变量
    private String sourceVar;

    // 赋值的目标变量，也就是被修改的变量
    private String targetVar;

    // 赋值的变量类型
    private String sourceType;

    // 赋值的目标变量，也就是被修改的变量类型
    private String targetType;

    // 定义变量时适用
    private String declareType;

    // if for while的条件
    private Condition condition;

    // 调用函数时适用，调用的哪个
    private String objName;

    public StatementType getStatementType() {
        return statementType;
    }

    public void setStatementType(StatementType statementType) {
        this.statementType = statementType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSourceVar() {
        return sourceVar;
    }

    public void setSourceVar(String sourceVar) {
        this.sourceVar = sourceVar;
    }

    public String getTargetVar() {
        return targetVar;
    }

    public void setTargetVar(String targetVar) {
        this.targetVar = targetVar;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public String getDeclareType() {
        return declareType;
    }

    public void setDeclareType(String declareType) {
        this.declareType = declareType;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

}
