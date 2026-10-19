package com.codealpha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DevOpsInfoAppTest {

    @Test
    void shouldReturnCorrectProjectName() {
        assertEquals(
            "CodeAlpha Java Gradle Project",
            DevOpsInfoApp.getProjectName()
        );
    }

    @Test
    void shouldReturnProjectTechnologies() {
        assertEquals(
            "Java, Gradle, Git, GitHub Actions",
            DevOpsInfoApp.getTechnologies()
        );
    }
}
