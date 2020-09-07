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

import com.github.weisj.darklaf.icons.IconLoader;
import com.github.weisj.darklaf.util.DarkUIUtil;

public class DarklafIconGroup extends IconGroupDelegate {

    private static final int SIZE = 16;

    public DarklafIconGroup(final IconGroup delegate) {
        super(delegate);
    }

    @Override
    public Icon getIcon(final String name) {
        IconLoader iconLoader = DarkUIUtil.ICON_LOADER;
        switch (name) {
            case "cut" :
            case "cutDisabled" :
            case "copy" :
            case "copyDisabled" :
            case "paste" :
            case "pasteDisabled" :
            case "delete" :
            case "deleteDisabled" :
            case "undo" :
            case "undoDisabled" :
            case "redo" :
            case "redoDisabled" :
                return iconLoader.getIcon("menu/" + name + ".svg", SIZE, SIZE, true);
            default :
                return super.getIcon(name);
        }
    }

    @Override
    public Icon getLargeIcon(final String name) {
        return super.getLargeIcon(name);
    }
}
