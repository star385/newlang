package org.newchuang.newlang.compiler.parser;

import org.newchuang.newlang.compiler.model.ClassInfo;
import org.newchuang.newlang.compiler.model.MethodInfo;
import org.newchuang.newlang.compiler.model.PropertyInfo;

public class ParseContext {

    static enum Process {
        START, NS, NS_END, US, US_END, ENTER_CLASS, CLASS_NAME_END, EXTENDS_END, FIELD, FIELD_END, METHOD, METHOD_END, CLASS_END
    }

    private Process process;

    private ClassInfo parsingClassInfo;

    private PropertyInfo parsingPropertyInfo;

    private MethodInfo parsingMethodInfo;

    public void start() {
        this.process = Process.START;
    }

    public void enterNS() {
        this.process = Process.NS;
    }

    public Process getProcess() {
        return process;
    }

    public void enterUS() {
        this.process = Process.US;
    }

    public void enterClass() {
        this.process = Process.ENTER_CLASS;
    }

    public ClassInfo getParsingClassInfo() {
        return parsingClassInfo;
    }

    public void setParsingClassInfo(ClassInfo parsingClassInfo) {
        this.parsingClassInfo = parsingClassInfo;
    }

    public PropertyInfo getParsingPropertyInfo() {
        return parsingPropertyInfo;
    }

    public void setParsingPropertyInfo(PropertyInfo parsingPropertyInfo) {
        this.parsingPropertyInfo = parsingPropertyInfo;
    }

    public MethodInfo getParsingMethodInfo() {
        return parsingMethodInfo;
    }

    public void setParsingMethodInfo(MethodInfo parsingMethodInfo) {
        this.parsingMethodInfo = parsingMethodInfo;
    }

}
