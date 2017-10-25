package org.newchuang.newlang.compiler.exegenerator;

import org.newchuang.newlang.compiler.model.NLFileStructure;

public interface ExeGenerator {
    ExecutorGenrateResult generateExecutor(NLFileStructure file);
}
