package org.newchuang.newlang.compiler;

import org.newchuang.newlang.compiler.exegenerator.ExeGenerator;
import org.newchuang.newlang.compiler.exegenerator.JAVAClassGenerator;

public class JavaCompiler extends AbstractCompiler implements Compiler {

    @Override
    protected ExeGenerator createExeGenerator() {
        return new JAVAClassGenerator();
    }

}
