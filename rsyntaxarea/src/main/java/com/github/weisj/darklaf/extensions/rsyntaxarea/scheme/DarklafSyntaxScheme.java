/*
 * MIT License
 *
 * Copyright (c) 2020 Jannis Weis
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */
package com.github.weisj.darklaf.extensions.rsyntaxarea.scheme;

import java.io.IOException;
import java.io.InputStream;

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxScheme;

import com.github.weisj.darklaf.extensions.rsyntaxarea.RSyntaxTheme;
import com.github.weisj.darklaf.theme.*;

public class DarklafSyntaxScheme extends SyntaxScheme {

    private static final String INTELLIJ_NAME = new IntelliJTheme().getName();
    private static final String DARCULA_NAME = new DarculaTheme().getName();
    private static final String ONE_DARK_NAME = new OneDarkTheme().getName();
    private static final String SOLARIZED_LIGHT_NAME = new SolarizedLightTheme().getName();
    private static final String SOLARIZED_DARK_NAME = new SolarizedDarkTheme().getName();
    private static final String HIGH_CONTRAST_LIGHT_NAME = new HighContrastLightTheme().getName();
    private static final String HIGH_CONTRAST_DARK_NAME = new HighContrastDarkTheme().getName();

    public DarklafSyntaxScheme(final String name, final SyntaxScheme baseScheme) {
        super(true);
        SyntaxScheme base = baseScheme != null ? baseScheme : new SyntaxScheme(true);
        this.setStyles(base.getStyles());
        try {
            InputStream inputStream = getClass().getResourceAsStream(name + ".xml");
            SyntaxScheme scheme = RSyntaxTheme.load(inputStream).scheme;
            setStyles(scheme.getStyles());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static DarklafSyntaxScheme getScheme(final RSyntaxTextArea textArea, final Theme theme) {
        String name = theme.getName();
        SyntaxScheme syntaxScheme = textArea.getSyntaxScheme();
        if (INTELLIJ_NAME.equals(name)) {
            return new DarklafSyntaxScheme("IntelliJScheme", syntaxScheme);
        } else if (DARCULA_NAME.equals(name)) {
            return new DarklafSyntaxScheme("DarculaScheme", syntaxScheme);
        } else if (ONE_DARK_NAME.equals(name)) {
            return new DarklafSyntaxScheme("OneDarkScheme", syntaxScheme);
        } else if (SOLARIZED_DARK_NAME.equals(name)) {
            return new DarklafSyntaxScheme("OneDarkScheme", syntaxScheme);
        } else if (SOLARIZED_LIGHT_NAME.equals(name)) {
            return new DarklafSyntaxScheme("AltLightScheme", syntaxScheme);
        } else if (HIGH_CONTRAST_DARK_NAME.equals(name)) {
            return new DarklafSyntaxScheme("DarkScheme", syntaxScheme);
        } else if (HIGH_CONTRAST_LIGHT_NAME.equals(name)) {
            return new DarklafSyntaxScheme("LightScheme", syntaxScheme);
        }
        return Theme.isDark(theme)
                ? new DarklafSyntaxScheme("DarkScheme", syntaxScheme)
                : new DarklafSyntaxScheme("LightScheme", syntaxScheme);
    }
}
