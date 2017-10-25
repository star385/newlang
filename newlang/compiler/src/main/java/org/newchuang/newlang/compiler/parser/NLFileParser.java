package org.newchuang.newlang.compiler.parser;

import org.newchuang.newlang.compiler.model.NLFileStructure;

public interface NLFileParser {

    NLFileStructure parseNLFile(char[] content);
}
