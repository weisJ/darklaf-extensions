package com.github.weisj.darklaf.extensions.rsyntaxarea;

import com.github.weisj.darklaf.components.tooltip.ToolTipStyle;
import com.github.weisj.darklaf.ui.tooltip.ToolTipConstants;
import com.github.weisj.darklaf.util.PropertyUtil;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.RSyntaxUtilities;
import org.fife.ui.rsyntaxtextarea.SyntaxScheme;
import org.fife.ui.rtextarea.Gutter;

import javax.swing.*;
import java.awt.*;

public class DarkRSyntaxTheme extends RSyntaxTheme {

    /**
     * Creates a theme from an RSyntaxTextArea.  It should be contained in an <code>RTextScrollPane</code> to get all gutter
     * color information.
     *
     * @param textArea The text area.
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

        textArea.setMarkAllHighlightColor(markAllHighlightColor); //Todo
        textArea.setMarkOccurrencesColor(markOccurrencesColor); //Todo

        textArea.setPaintMarkOccurrencesBorder(markOccurrencesBorder);
        textArea.setMatchedBracketBGColor(matchedBracketBG); //Todo
        textArea.setMatchedBracketBorderColor(matchedBracketFG); //Todo
        textArea.setPaintMatchedBracketPair(true);
        textArea.setAnimateBracketMatching(true);
        textArea.setHyperlinkForeground(UIManager.getColor("hyperlink"));

        int count = secondaryLanguages.length;
        for (int i=0; i<count; i++) {
            textArea.setSecondaryLanguageBackground(i+1, secondaryLanguages[i]);
        }

        textArea.setSyntaxScheme(scheme);

        Gutter gutter = RSyntaxUtilities.getGutter(textArea);
        if (gutter!=null) {
            gutter.setBackground(UIManager.getColor("textBackgroundSecondaryInactive"));
            gutter.setBorderColor(UIManager.getColor("border"));
            gutter.setActiveLineRangeColor(UIManager.getColor("borderFocus"));
            gutter.setIconRowHeaderInheritsGutterBackground(true);
            gutter.setLineNumberColor(UIManager.getColor("textForegroundSecondary"));
//            gutter.setLineNumberFont(UIManager.getFont("NumberingPane.font"));

            gutter.setFoldIndicatorForeground(UIManager.getColor("borderSecondary"));
            gutter.setFoldBackground(UIManager.getColor("widgetFill"));
            gutter.setArmedFoldBackground(UIManager.getColor("hoverHighlight"));


            for (Component component : gutter.getComponents()) {
                PropertyUtil.installProperty((JComponent) component, ToolTipConstants.KEY_STYLE, ToolTipStyle.PLAIN);
            }
        }
    }
}
