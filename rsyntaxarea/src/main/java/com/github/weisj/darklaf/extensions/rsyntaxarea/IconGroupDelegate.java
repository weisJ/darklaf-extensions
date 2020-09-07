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

public class IconGroupDelegate extends IconGroup {

    private final IconGroup delegate;

    public static IconGroup unwrap(final IconGroup group) {
        IconGroup g = group;
        while (g instanceof IconGroupDelegate) {
            g = ((IconGroupDelegate) g).getDelegate();
        }
        return g;
    }

    public IconGroupDelegate(final IconGroup delegate) {
        super("", "");
        this.delegate = delegate;
    }

    public IconGroup getDelegate() {
        return delegate;
    }

    @Override
    public Icon getFileTypeIcon(final String rstaSyntax) {
        if (getDelegate() == null) return null;
        return getDelegate().getFileTypeIcon(rstaSyntax);
    }

    @Override
    public Icon getIcon(final String name) {
        if (getDelegate() == null) return null;
        return getDelegate().getIcon(name);
    }

    @Override
    public Icon getLargeIcon(final String name) {
        if (getDelegate() == null) return null;
        return getDelegate().getLargeIcon(name);
    }

    @Override
    public String getName() {
        if (getDelegate() == null) return "";
        return getDelegate().getName();
    }

    @Override
    public boolean hasSeparateLargeIcons() {
        if (getDelegate() == null) return false;
        return getDelegate().hasSeparateLargeIcons();
    }
}
