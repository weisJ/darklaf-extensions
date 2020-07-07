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
package com.github.weisj.darklaf.extensions.rsyntaxarea;

import com.github.weisj.darklaf.components.tooltip.ToolTipStyle;
import com.github.weisj.darklaf.ui.tooltip.ToolTipConstants;
import com.github.weisj.darklaf.util.PropertyUtil;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.RSyntaxUtilities;
import org.fife.ui.rsyntaxtextarea.SyntaxScheme;
import org.fife.ui.rsyntaxtextarea.Theme;
import org.fife.ui.rtextarea.Gutter;

import javax.swing.*;
import java.awt.*;

public class DarkRSyntaxTheme extends RSyntaxTheme {

    /**
     * Creates a theme from an RSyntaxTextArea. It should be contained in an <code>RTextScrollPane</code> to get all
     * gutter color information.
     *
     * @param textArea     the text area.
     * @param syntaxScheme the syntax scheme.
     */
    public DarkRSyntaxTheme(final RSyntaxTextArea textArea, final SyntaxScheme syntaxScheme) {
        super(textArea);
        this.scheme = syntaxScheme;
    }

    @Override
    public void apply(RSyntaxTextArea textArea) {
        super.apply(textArea);
        textArea.setBackground(UIManager.getColor("textBackgroundSecondary"));
        textArea.setCaretColor(UIManager.getColor("caret"));
        textArea.setUseSelectedTextColor(false);
        textArea.setSelectionColor(UIManager.getColor("textSelectionBackground"));
        textArea.setCaret(new DarkConfigurableCaret());
        textArea.setCurrentLineHighlightColor(UIManager.getColor("textSelectionBackgroundSecondary"));
        textArea.setFadeCurrentLineHighlight(false);
        textArea.setTabLineColor(UIManager.getColor("borderSecondary"));
        textArea.setMarginLineColor(UIManager.getColor("borderSecondary"));

        textArea.setMarkAllHighlightColor(markAllHighlightColor); // Todo
        textArea.setMarkOccurrencesColor(markOccurrencesColor); // Todo

        textArea.setPaintMarkOccurrencesBorder(markOccurrencesBorder);
        textArea.setMatchedBracketBGColor(matchedBracketBG); // Todo
        textArea.setMatchedBracketBorderColor(matchedBracketFG); // Todo
        textArea.setPaintMatchedBracketPair(true);
        textArea.setAnimateBracketMatching(true);
        textArea.setHyperlinkForeground(UIManager.getColor("hyperlink"));

        int count = secondaryLanguages.length;
        for (int i = 0; i < count; i++) {
            textArea.setSecondaryLanguageBackground(i + 1, secondaryLanguages[i]);
        }

        textArea.setSyntaxScheme(scheme);

        Gutter gutter = RSyntaxUtilities.getGutter(textArea);
        if (gutter != null) {
            gutter.setBackground(UIManager.getColor("textBackgroundSecondaryInactive"));
            gutter.setBorderColor(UIManager.getColor("border"));
            gutter.setActiveLineRangeColor(UIManager.getColor("borderFocus"));
            gutter.setIconRowHeaderInheritsGutterBackground(true);
            gutter.setLineNumberColor(UIManager.getColor("textForegroundSecondary"));
            // gutter.setLineNumberFont(UIManager.getFont("NumberingPane.font"));

            gutter.setFoldIndicatorForeground(UIManager.getColor("borderSecondary"));
            gutter.setFoldBackground(UIManager.getColor("widgetFill"));
            gutter.setArmedFoldBackground(UIManager.getColor("hoverHighlight"));

            for (Component component : gutter.getComponents()) {
                PropertyUtil.installProperty((JComponent) component, ToolTipConstants.KEY_STYLE, ToolTipStyle.PLAIN);
            }
        }
    }
}
