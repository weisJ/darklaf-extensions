package com.github.weisj.darklaf.extensions.rsyntaxarea;

import com.github.weisj.darklaf.ui.text.DarkCaret;
import com.github.weisj.darklaf.ui.tooltip.DarkToolTipUI;
import org.fife.ui.rtextarea.ConfigurableCaret;

import javax.swing.text.DefaultHighlighterDark.DarkHighlightPainter;
import javax.swing.text.Highlighter;

public class DarkConfigurableCaret extends ConfigurableCaret {

    private final DarkHighlightPainter selectionPainter;

    public DarkConfigurableCaret() {
        selectionPainter = new DarkHighlightPainter();
        selectionPainter.setRoundedEdges(true);
        selectionPainter.setLineExtendingEnabled(true);
    }

    @Override
    protected Highlighter.HighlightPainter getSelectionPainter() {
        return selectionPainter;
    }
}
