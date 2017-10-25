package org.newchuang.newlang.compiler.model.constants;

public enum StatementType {

    DECLARE, // 定义变量
    ASSIGNMENT, // 赋值
    DECLARE_ASSIGNMENT, // 定义并赋值
    IF_START, // if语句开始
    IF_END, // if语句结束
    FOR_START, // for语句开始
    FOR_END, WHILE_START, // for语句开始
    WHILE_END, CALL_METHOD // 调用方法
}
