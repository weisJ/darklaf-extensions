package com.github.weisj.darklaf.extensions.rsyntaxarea;

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.Theme;

public class RSyntaxTheme extends Theme {

    /**
     * Creates a theme from an RSyntaxTextArea.  It should be contained in an <code>RTextScrollPane</code> to get all gutter
     * color information.
     *
     * @param textArea The text area.
     */
    public RSyntaxTheme(final RSyntaxTextArea textArea) {
        super(textArea);
    }
}
