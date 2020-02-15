package com.roboautomator.plantuml.language;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPlantUMLIcons {

    private static final String PLANT_UML_ICON_PATH = "/icons/plantuml-logo-16x16.png";

    private static final int EXPECTED_HEIGHT = 2; // Fixed Width Value

    private static final int EXPECTED_WIDTH = 2; // Fixed Width Value

    @Test
    public void plantUMLIconShouldHaveCorrectIconPath() {
        assertEquals(PLANT_UML_ICON_PATH, PlantUMLIcons.PLANT_UML_ICON_16_X_16.toString());
    }

    @Test
    public void plantUMLIconShouldHaveCorrectIconSize() {
        assertEquals(EXPECTED_HEIGHT, PlantUMLIcons.PLANT_UML_ICON_16_X_16.getIconHeight());
        assertEquals(EXPECTED_WIDTH, PlantUMLIcons.PLANT_UML_ICON_16_X_16.getIconWidth());
    }
}
