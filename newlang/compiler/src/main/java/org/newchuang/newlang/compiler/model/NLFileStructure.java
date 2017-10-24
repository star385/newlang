package org.newchuang.newlang.compiler.model;

import java.util.List;

public class NLFileStructure {

    private String ns;

    private List<String> us;

    private List<ClassInfo> classInfos;

    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }

    public List<String> getUs() {
        return us;
    }

    public void setUs(List<String> us) {
        this.us = us;
    }

    public List<ClassInfo> getClassInfos() {
        return classInfos;
    }

    public void setClassInfos(List<ClassInfo> classInfos) {
        this.classInfos = classInfos;
    }
}
