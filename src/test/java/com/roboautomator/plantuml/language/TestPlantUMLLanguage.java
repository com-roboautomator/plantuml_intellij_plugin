package com.roboautomator.plantuml.language;

import com.intellij.lang.Language;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestPlantUMLLanguage {

    private static final String PLANT_UML_LANGUAGE_ID = "PlantUML";

    @Test
    public void plantUmlLanguageShouldExtendLanguage() {
        assertTrue(PlantUMLLanguage.INSTANCE instanceof PlantUMLLanguage);
        assertTrue(PlantUMLLanguage.INSTANCE instanceof Language);
    }
    @Test
    public void plantUmlLanguageShouldHaveCorrectId() {
        assertEquals(PLANT_UML_LANGUAGE_ID, PlantUMLLanguage.INSTANCE.getID());
        assertNotNull(PlantUMLLanguage.findLanguageByID(PLANT_UML_LANGUAGE_ID));
    }
}
