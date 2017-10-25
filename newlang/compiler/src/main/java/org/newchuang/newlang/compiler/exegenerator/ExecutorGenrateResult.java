package org.newchuang.newlang.compiler.exegenerator;

import java.util.ArrayList;
import java.util.List;

public class ExecutorGenrateResult {

    public static class ExecutableFileInfo {
        private String filePath;

        private byte[] content;

        public String getFilePath() {
            return filePath;
        }

        public byte[] getContent() {
            return content;
        }

    }

    private List<ExecutableFileInfo> executableFileInfos;

    public void addExecutableFileInfo(String filePath, byte[] content) {
        if (executableFileInfos == null) {
            executableFileInfos = new ArrayList<ExecutorGenrateResult.ExecutableFileInfo>();
        }
        ExecutableFileInfo executableFileInfo = new ExecutableFileInfo();
        executableFileInfo.filePath = filePath;
        executableFileInfo.content = content;
        executableFileInfos.add(executableFileInfo);
    }

    public List<ExecutableFileInfo> getExecutableFileInfos() {
        return executableFileInfos;
    }
}
