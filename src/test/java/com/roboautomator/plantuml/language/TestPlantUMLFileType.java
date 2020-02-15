package com.roboautomator.plantuml.language;


import com.intellij.openapi.fileTypes.LanguageFileType;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestPlantUMLFileType {

    private static final String ICONS_PLANTUML_LOGO_16_X_16 = "/icons/plantuml-logo-16x16.png";

    @Test
    public void itShouldHaveInstanceOfLaguageFileType() {
        assertTrue(PlantUMLFileType.INSTANCE instanceof PlantUMLFileType);
        assertTrue(PlantUMLFileType.INSTANCE instanceof LanguageFileType);
    }

    @Test
    public void itShouldHaveIcon() {
        assertNotNull(PlantUMLFileType.INSTANCE.getIcon());
        assertEquals(ICONS_PLANTUML_LOGO_16_X_16, PlantUMLFileType.INSTANCE.getIcon().toString());
    }
}
