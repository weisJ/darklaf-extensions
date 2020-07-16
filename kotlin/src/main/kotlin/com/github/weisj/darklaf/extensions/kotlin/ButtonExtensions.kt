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

import com.github.weisj.darklaf.ui.button.ButtonConstants
import com.github.weisj.darklaf.util.AlignmentExt
import com.github.weisj.darklaf.util.PropertyUtil
import javax.swing.AbstractButton
import javax.swing.JButton
import javax.swing.JToggleButton

var AbstractButton.round: Boolean
    get() = PropertyUtil.getBooleanProperty(this, ButtonConstants.KEY_ROUND)
    set(isRound) = putClientProperty(ButtonConstants.KEY_ROUND, isRound)

var AbstractButton.square: Boolean
    get() = PropertyUtil.getBooleanProperty(this, ButtonConstants.KEY_SQUARE)
    set(isSquare) = putClientProperty(ButtonConstants.KEY_SQUARE, isSquare)

var AbstractButton.thin: Boolean
    get() = PropertyUtil.getBooleanProperty(this, ButtonConstants.KEY_THIN)
    set(thin) = putClientProperty(ButtonConstants.KEY_THIN, thin)

var AbstractButton.useAlternativeArc: Boolean
    get() = PropertyUtil.getBooleanProperty(this, ButtonConstants.KEY_ALT_ARC)
    set(useAltArc) = putClientProperty(ButtonConstants.KEY_ALT_ARC, useAltArc)

var AbstractButton.useRoundedCorners: Boolean
    get() = !PropertyUtil.getBooleanProperty(this, ButtonConstants.KEY_NO_ARC)
    set(roundedCorners) = putClientProperty(ButtonConstants.KEY_NO_ARC, !roundedCorners)

var AbstractButton.cornerStyle: ButtonCornerStyle
    get() = ButtonCornerStyle.of(PropertyUtil.getObject(this, ButtonConstants.KEY_CORNER, AlignmentExt::class.java))
    set(style) = putClientProperty(ButtonConstants.KEY_CORNER, style.alignment)

val AbstractButton.neighbours: Map<ButtonNeighbourPosition, Lazy<AbstractButton?>>
    get() = ButtonNeighbourPosition.values().map { it to lazy { getNeighbourAt(it) } }.toMap()

var JButton.variant: ButtonVariant
    get() = ButtonVariant.of(PropertyUtil.getString(this, ButtonVariant.KEY))
    set(variant) = putClientProperty(ButtonVariant.KEY, variant.key)

var JToggleButton.variant: ToggleButtonVariant
    get() = ToggleButtonVariant.of(PropertyUtil.getString(this, ToggleButtonVariant.KEY))
    set(variant) = putClientProperty(ToggleButtonVariant.KEY, variant.key)

fun AbstractButton.setNeighbourAt(neighbour: AbstractButton, position: ButtonNeighbourPosition) {
    putClientProperty(position.key, neighbour)
}

fun AbstractButton.getNeighbourAt(position: ButtonNeighbourPosition): AbstractButton? {
    return PropertyUtil.getObject(this, position.key, AbstractButton::class.java)
}
