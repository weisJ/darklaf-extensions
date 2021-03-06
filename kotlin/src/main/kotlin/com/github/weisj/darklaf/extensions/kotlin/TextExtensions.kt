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

import com.github.weisj.darklaf.ui.text.DarkCaret
import com.github.weisj.darklaf.ui.text.DarkPasswordFieldUI
import com.github.weisj.darklaf.ui.text.DarkTextFieldUI
import com.github.weisj.darklaf.ui.text.DarkTextUI
import com.github.weisj.darklaf.util.PropertyUtil
import javax.swing.JPasswordField
import javax.swing.JPopupMenu
import javax.swing.JTextField
import javax.swing.text.JTextComponent

var JTextComponent.defaultText: String
    get() = PropertyUtil.getString(this, DarkTextUI.KEY_DEFAULT_TEXT, "")
    set(text) = putClientProperty(DarkTextUI.KEY_DEFAULT_TEXT, text)

var JTextComponent.hasError: Boolean
    get() = PropertyUtil.getBooleanProperty(this, DarkTextUI.KEY_HAS_ERROR)
    set(error) = putClientProperty(DarkTextUI.KEY_HAS_ERROR, error)

var JTextComponent.hasWarning: Boolean
    get() = PropertyUtil.getBooleanProperty(this, DarkTextUI.KEY_HAS_WARNING)
    set(warning) = putClientProperty(DarkTextUI.KEY_HAS_WARNING, warning)

var JTextComponent.roundedSelection: Boolean
    get() = caret is DarkCaret && PropertyUtil.getBooleanProperty(this, DarkTextUI.KEY_ROUNDED_SELECTION)
    set(rounded) = putClientProperty(DarkTextUI.KEY_ROUNDED_SELECTION, rounded)

var JTextComponent.extendLineSelection: Boolean
    get() = caret is DarkCaret && PropertyUtil.getBooleanProperty(this, DarkTextUI.KEY_EXTEND_LINE_SELECTION)
    set(extend) = putClientProperty(DarkTextUI.KEY_EXTEND_LINE_SELECTION, extend)

var JTextComponent.insertMode: Boolean
    get() = caret.let { it is DarkCaret && it.isInsertMode }
    set(insert) = caret.let { if (it is DarkCaret) it.isInsertMode = insert }

var JTextComponent.pasteOnMiddleMouseClick: Boolean
    get() = caret.let { it is DarkCaret && it.pasteOnMiddleMouseClick }
    set(enabled) = caret.let { if (it is DarkCaret) it.pasteOnMiddleMouseClick = enabled }

var JTextComponent.alwaysShowCaret: Boolean
    get() = caret.let { it is DarkCaret && it.isAlwaysVisible }
    set(alwaysVisible) = caret.let { if (it is DarkCaret) it.isAlwaysVisible = alwaysVisible }

var JTextComponent.caretStyle: CaretStyle
    get() = CaretStyle.of(caret.let { if (it is DarkCaret) it.style else null })
    set(style) = caret.let { if (it is DarkCaret) it.style = style.style }

var JTextComponent.insertCaretStyle: CaretStyle
    get() = CaretStyle.of(caret.let { if (it is DarkCaret) it.insertStyle else null })
    set(style) = caret.let { if (it is DarkCaret) it.insertStyle = style.style }

val JTextComponent.currentCaretStyle: CaretStyle
    get() = CaretStyle.of(caret.let { if (it is DarkCaret) it.effectiveStyle else null })

var JTextField.showClearButton: Boolean
    get() = PropertyUtil.getBooleanProperty(this, DarkTextFieldUI.KEY_SHOW_CLEAR)
    set(showClear) = putClientProperty(DarkTextFieldUI.KEY_SHOW_CLEAR, showClear)

var JTextField.variant: TextFieldVariant
    get() = TextFieldVariant.of(PropertyUtil.getString(this, TextFieldVariant.KEY))
    set(variant) = putClientProperty(TextFieldVariant.KEY, variant)

var JTextField.searchPopup: JPopupMenu?
    get() = PropertyUtil.getObject(this, DarkTextFieldUI.KEY_FIND_POPUP, JPopupMenu::class.java)
    set(popup) = putClientProperty(DarkTextFieldUI.KEY_FIND_POPUP, popup)

var JPasswordField.allowPasswordPreview: Boolean
    get() = PropertyUtil.getBooleanProperty(this, DarkPasswordFieldUI.KEY_SHOW_VIEW_BUTTON)
    set(allowPreview) = putClientProperty(DarkPasswordFieldUI.KEY_SHOW_VIEW_BUTTON, allowPreview)
