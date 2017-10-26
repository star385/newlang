package org.newchuang.newlang.compiler;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.newchuang.newlang.compiler.exegenerator.ExeGenerator;
import org.newchuang.newlang.compiler.exegenerator.ExecutorGenrateResult;
import org.newchuang.newlang.compiler.exegenerator.ExecutorGenrateResult.ExecutableFileInfo;
import org.newchuang.newlang.compiler.model.NLFileStructure;
import org.newchuang.newlang.compiler.parser.DefaultNLFileParser;
import org.newchuang.newlang.compiler.parser.NLFileParser;

public abstract class AbstractCompiler implements Compiler {

    private NLFileParser fileParser;

    private ExeGenerator exeGenerator;

    public boolean compile(char[] source) {
        return compile(source, System.getProperty("user.home"));
    }

    public boolean compile(char[] source, String path) {
        NLFileParser parser = getNLFileParser();
        NLFileStructure fileContent = parser.parseNLFile(source);
        ExeGenerator exeGenerator = getExeGenerator();
        ExecutorGenrateResult genrateResult = exeGenerator.generateExecutor(fileContent);
        List<ExecutableFileInfo> executableFileInfos = genrateResult.getExecutableFileInfos();
        if (executableFileInfos == null || executableFileInfos.isEmpty()) {
            return true;
        }
        for (ExecutableFileInfo executableFileInfo : executableFileInfos) {
            FileOutputStream fou = null;
            try {
                fou = new FileOutputStream(executableFileInfo.getFilePath());
                fou.write(executableFileInfo.getContent());

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (fou != null) {
                    try {
                        fou.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
        return true;
    }

    private ExeGenerator getExeGenerator() {
        if (exeGenerator == null) {
            exeGenerator = createExeGenerator();
        }
        return exeGenerator;
    }

    protected abstract ExeGenerator createExeGenerator();

    private NLFileParser getNLFileParser() {
        if (fileParser == null) {
            fileParser = createNewFileParser();
        }
        return fileParser;
    }

    protected NLFileParser createNewFileParser() {
        return new DefaultNLFileParser();
    }
}
