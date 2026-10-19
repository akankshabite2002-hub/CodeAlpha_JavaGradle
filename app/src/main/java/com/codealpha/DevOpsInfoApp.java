
package com.codealpha;

public class DevOpsInfoApp {

    public static String getProjectName() {
        return "CodeAlpha Java Gradle Project";
    }

    public static String getTechnologies() {
        return "Java, Gradle, Git, GitHub Actions";
    }

    public static void main(String[] args) {
        System.out.println(getProjectName());
        System.out.println("CodeAlpha DevOps Internship");
        System.out.println("Technologies: " + getTechnologies());
        System.out.println("Build automation: Gradle");
        System.out.println("Status: Application running");
        
    }
}
