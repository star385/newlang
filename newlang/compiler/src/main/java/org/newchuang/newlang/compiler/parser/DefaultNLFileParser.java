package org.newchuang.newlang.compiler.parser;

import java.util.Stack;

import org.newchuang.newlang.compiler.model.ClassInfo;
import org.newchuang.newlang.compiler.model.NLFileStructure;

public class DefaultNLFileParser implements NLFileParser {

    Stack<String> operatorStack = new Stack<String>();

    public NLFileStructure parseNLFile(char[] content) {
        ParseContext context = new ParseContext();
        context.start();
        operatorStack.clear();
        NLFileStructure nlFileStructure = new NLFileStructure();
        boolean parsingComment = false;
        boolean newLine = false;
        boolean afterBlank = false;
        StringBuilder lastOperatorSb = new StringBuilder();
        for (int i = 0; i < content.length; i++) {
            char c = content[i];
            if (parsingComment && c != '\r' && c != '\n') {
                continue;
            }
            switch (c) {
            case '/':
                char nc = content[i];
                if (nc == '/') {
                    // 进入注释
                    parsingComment = true;
                    i++;
                    continue;
                }
                if (parsingComment) {
                    continue;
                }
            case ' ':
            case '\t':
                if (parsingComment) {
                    continue;
                }
                if (newLine) {
                    continue;
                }
                if (afterBlank) {
                    continue;
                }
                if (lastOperatorSb.length() == 0) {
                    continue;
                }

                String lastOperator = lastOperatorSb.toString();
                if (KeyWords.NS.equals(lastOperator)) {
                    if (ParseContext.Process.START != context.getProcess()) {
                        throw new RuntimeException("语法错误，ns必须在文件开头");
                    }
                    context.enterNS();
                    continue;
                }

                if (KeyWords.US.equals(lastOperator)) {
                    if (ParseContext.Process.NS_END != context.getProcess()
                            && ParseContext.Process.US_END != context.getProcess()) {
                        throw new RuntimeException("语法错误，us必须在ns之后");
                    }
                    context.enterUS();
                    continue;
                }

                if (KeyWords.CLASS.equals(lastOperator)) {
                    if (ParseContext.Process.NS_END != context.getProcess()
                            && ParseContext.Process.US_END != context.getProcess()
                            && ParseContext.Process.START == context.getProcess()
                            && ParseContext.Process.CLASS_END == context.getProcess()) {
                        throw new RuntimeException("语法错误，class位置不正确");
                    }
                    context.enterClass();
                    ClassInfo classInfo = new ClassInfo();
                    context.setParsingClassInfo(classInfo);
                    continue;
                }

                if (isVisibility(lastOperator)) {

                }
            }
        }
        return nlFileStructure;
    }

    private boolean isVisibility(String lastOperator) {
        return KeyWords.PRI.equals(lastOperator) || KeyWords.PUB.equals(lastOperator)
                || KeyWords.PRO.equals(lastOperator);
    }

}
