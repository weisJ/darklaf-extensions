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

import javax.swing.*;

import org.fife.ui.rtextarea.IconGroup;

import com.github.weisj.darklaf.iconset.AllIcons;

public class DarklafIconGroup extends IconGroupDelegate {

    private static final int SIZE = 16;

    public DarklafIconGroup(final IconGroup delegate) {
        super(delegate);
    }

    @Override
    public Icon getIcon(final String name) {
        switch (name) {
            case "cut" :
                return AllIcons.Action.Cut.get(SIZE, SIZE);
            case "cutDisabled" :
                return AllIcons.Action.Cut.disabled(SIZE, SIZE);
            case "copy" :
                return AllIcons.Action.Copy.get(SIZE, SIZE);
            case "copyDisabled" :
                return AllIcons.Action.Copy.disabled(SIZE, SIZE);
            case "paste" :
                return AllIcons.Action.Paste.get(SIZE, SIZE);
            case "pasteDisabled" :
                return AllIcons.Action.Paste.disabled(SIZE, SIZE);
            case "delete" :
                return AllIcons.Action.Delete.get(SIZE, SIZE);
            case "deleteDisabled" :
                return AllIcons.Action.Delete.disabled(SIZE, SIZE);
            case "undo" :
                return AllIcons.Action.Undo.get(SIZE, SIZE);
            case "undoDisabled" :
                return AllIcons.Action.Undo.disabled(SIZE, SIZE);
            case "redo" :
                return AllIcons.Action.Redo.get(SIZE, SIZE);
            case "redoDisabled" :
                return AllIcons.Action.Redo.disabled(SIZE, SIZE);
            default :
                return super.getIcon(name);
        }
    }

    @Override
    public Icon getLargeIcon(final String name) {
        return super.getLargeIcon(name);
    }
}
