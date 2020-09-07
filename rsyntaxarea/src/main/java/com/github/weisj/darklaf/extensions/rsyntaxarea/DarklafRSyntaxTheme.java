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

import java.awt.*;

import javax.swing.*;

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxScheme;
import org.fife.ui.rtextarea.RTextArea;

import com.github.weisj.darklaf.LafManager;
import com.github.weisj.darklaf.extensions.rsyntaxarea.scheme.DarklafSyntaxScheme;

public class DarklafRSyntaxTheme extends RSyntaxTheme {

    protected SyntaxScheme syntaxScheme;

    /**
     * Creates a theme from an RSyntaxTextArea. It should be contained in an <code>RTextScrollPane</code> to get all
     * gutter color information.
     *
     * @param textArea     the text area.
     * @param syntaxScheme the syntax scheme.
     */
    public DarklafRSyntaxTheme(final RSyntaxTextArea textArea, final SyntaxScheme syntaxScheme) {
        super(textArea);
        this.syntaxScheme = syntaxScheme;
    }

    /**
     * Creates a theme from an RSyntaxTextArea. It should be contained in an <code>RTextScrollPane</code> to get all
     * gutter color information.
     *
     * @param textArea the text area.
     */
    public DarklafRSyntaxTheme(final RSyntaxTextArea textArea) {
        this(textArea, null);
    }

    protected void updateTheme(final RSyntaxTextArea textArea) {
        bgColor = UIManager.getColor("textBackgroundSecondary");

        caretColor = UIManager.getColor("caret");

        useSelectionFG = false;
        selectionBG = UIManager.getColor("textSelectionBackground");

        selectionRoundedEdges = true;

        currentLineHighlight = UIManager.getColor("textSelectionBackgroundSecondary");
        fadeCurrentLineHighlight = false;

        tabLineColor = UIManager.getColor("borderSecondary");
        marginLineColor = UIManager.getColor("borderSecondary");

        markOccurrencesBorder = true;
        matchedBracketBG = UIManager.getColor("textBackgroundSecondary");
        matchedBracketFG = UIManager.getColor("borderSecondary");
        matchedBracketHighlightBoth = true;
        matchedBracketAnimate = false;

        hyperlinkFG = UIManager.getColor("hyperlink");

        scheme = DarklafSyntaxScheme.getScheme(textArea, LafManager.getTheme());

        gutterBackgroundColor = UIManager.getColor("textBackgroundSecondaryInactive");
        gutterBorderColor = UIManager.getColor("borderSecondary");
        activeLineRangeColor = UIManager.getColor("borderFocus");
        iconRowHeaderInheritsGutterBG = true;

        lineNumberColor = UIManager.getColor("textForegroundSecondary");
        Font baseNumberingFont = UIManager.getFont("NumberingPane.font");
        lineNumberFont = baseNumberingFont.getFamily();
        lineNumberFontSize = (int) Math.max(1, textArea.getFont().getSize2D() - 2);

        foldIndicatorFG = UIManager.getColor("borderSecondary");
        foldBG = UIManager.getColor("textBackgroundSecondary");
        armedFoldBG = UIManager.getColor("textBackgroundSecondaryInactive");
    }

    @Override
    public void apply(final RSyntaxTextArea textArea) {
        updateTheme(textArea);
        super.apply(textArea);
        DarklafIconGroup iconGroup = new DarklafIconGroup(IconGroupDelegate.unwrap(RTextArea.getIconGroup()));
        RTextArea.setIconGroup(iconGroup);
        findItem(textArea, RTextArea.CUT_ACTION).setDisabledIcon(iconGroup.getIcon("cutDisabled"));
        findItem(textArea, RTextArea.COPY_ACTION).setDisabledIcon(iconGroup.getIcon("copyDisabled"));
        findItem(textArea, RTextArea.PASTE_ACTION).setDisabledIcon(iconGroup.getIcon("pasteDisabled"));
        findItem(textArea, RTextArea.DELETE_ACTION).setDisabledIcon(iconGroup.getIcon("deleteDisabled"));
        findItem(textArea, RTextArea.UNDO_ACTION).setDisabledIcon(iconGroup.getIcon("undoDisabled"));
        findItem(textArea, RTextArea.REDO_ACTION).setDisabledIcon(iconGroup.getIcon("redoDisabled"));
    }

    private JMenuItem findItem(final RSyntaxTextArea textArea, final int actionId) {
        JPopupMenu popupMenu = textArea.getPopupMenu();
        Action action = RTextArea.getAction(actionId);
        for (Component c : popupMenu.getComponents()) {
            if (c instanceof JMenuItem && ((JMenuItem) c).getAction() == action) {
                return (JMenuItem) c;
            }
        }
        return new JMenuItem();
    }
}
