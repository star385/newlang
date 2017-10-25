package org.newchuang.newlang.compiler;

public interface Compiler {

    public boolean compile(char[] source);

    public boolean compile(char[] source, String path);
}
