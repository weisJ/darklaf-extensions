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
package com.github.weisj.darklaf.extensions.kotlin

import com.github.weisj.darklaf.ui.list.DarkListUI
import com.github.weisj.darklaf.ui.table.DarkTableUI
import com.github.weisj.darklaf.ui.tree.DarkTreeUI
import com.github.weisj.darklaf.util.PropertyUtil
import javax.swing.JList
import javax.swing.JTable
import javax.swing.JTree

var JTable.useBooleanRenderer: Boolean
    get() = PropertyUtil.getBooleanProperty(this, DarkTableUI.KEY_RENDER_BOOLEAN_AS_CHECKBOX)
    set(useRenderer) = putClientProperty(DarkTableUI.KEY_RENDER_BOOLEAN_AS_CHECKBOX, useRenderer)

var JTable.booleanRenderVariant: BooleanRendererVariant
    get() = BooleanRendererVariant.of(PropertyUtil.getString(this, DarkTableUI.KEY_BOOLEAN_RENDER_TYPE))
    set(variant) = putClientProperty(DarkTableUI.KEY_BOOLEAN_RENDER_TYPE, variant.key)

var JTable.alternateRowColor: Boolean
    get() = PropertyUtil.getBooleanProperty(this, DarkTableUI.KEY_ALTERNATE_ROW_COLOR)
    set(alternate) = putClientProperty(DarkTableUI.KEY_ALTERNATE_ROW_COLOR, alternate)

var JTable.focusWholeRow: Boolean
    get() = PropertyUtil.getBooleanProperty(this, DarkTableUI.KEY_FULL_ROW_FOCUS_BORDER)
    set(focusFullRow) = putClientProperty(DarkTableUI.KEY_FULL_ROW_FOCUS_BORDER, focusFullRow)

var <T> JList<T>.useBooleanRenderer: Boolean
    get() = PropertyUtil.getBooleanProperty(this, DarkListUI.KEY_RENDER_BOOLEAN_AS_CHECKBOX)
    set(useRenderer) = putClientProperty(DarkListUI.KEY_RENDER_BOOLEAN_AS_CHECKBOX, useRenderer)

var <T> JList<T>.booleanRenderVariant: BooleanRendererVariant
    get() = BooleanRendererVariant.of(PropertyUtil.getString(this, DarkListUI.KEY_BOOLEAN_RENDER_TYPE))
    set(variant) = putClientProperty(DarkListUI.KEY_BOOLEAN_RENDER_TYPE, variant.key)

var <T> JList<T>.alternateRowColor: Boolean
    get() = PropertyUtil.getBooleanProperty(this, DarkListUI.KEY_ALTERNATE_ROW_COLOR)
    set(alternate) = putClientProperty(DarkListUI.KEY_ALTERNATE_ROW_COLOR, alternate)

var JTree.useBooleanRenderer: Boolean
    get() = PropertyUtil.getBooleanProperty(this, DarkTreeUI.KEY_RENDER_BOOLEAN_AS_CHECKBOX)
    set(useRenderer) = putClientProperty(DarkTreeUI.KEY_RENDER_BOOLEAN_AS_CHECKBOX, useRenderer)

var JTree.booleanRenderVariant: BooleanRendererVariant
    get() = BooleanRendererVariant.of(PropertyUtil.getString(this, DarkTreeUI.KEY_BOOLEAN_RENDER_TYPE))
    set(variant) = putClientProperty(DarkTreeUI.KEY_BOOLEAN_RENDER_TYPE, variant.key)

var JTree.alternateRowColor: Boolean
    get() = PropertyUtil.getBooleanProperty(this, DarkTreeUI.KEY_ALTERNATE_ROW_COLOR)
    set(alternate) = putClientProperty(DarkTreeUI.KEY_ALTERNATE_ROW_COLOR, alternate)

var JTree.lineVariant: TreeLineVariant
    get() = TreeLineVariant.of(PropertyUtil.getString(this, TreeLineVariant.KEY))
    set(variant) = putClientProperty(TreeLineVariant.KEY, variant.key)
