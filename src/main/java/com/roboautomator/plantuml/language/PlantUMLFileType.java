/*
 *    Copyright 2020 RoboAutomator
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.roboautomator.plantuml.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class PlantUMLFileType extends LanguageFileType {

    public static final PlantUMLFileType INSTANCE = new PlantUMLFileType();

    /**
     * Creates a language file type for the specified language.
     */
    private PlantUMLFileType() {
        super(PlantUMLLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "PlantUML file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "PlantUML Language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "plantuml";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return PlantUMLIcons.PLANT_UML_ICON_16_X_16;
    }
}
