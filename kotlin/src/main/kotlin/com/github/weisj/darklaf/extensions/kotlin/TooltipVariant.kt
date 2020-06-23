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

import com.github.weisj.darklaf.components.tooltip.ToolTipStyle
import com.github.weisj.darklaf.ui.tooltip.ToolTipConstants

enum class TooltipVariant(val style: ToolTipStyle?) {
    BALLOON(ToolTipStyle.BALLOON),
    PLAIN_BALLOON(ToolTipStyle.PLAIN_BALLOON),
    PLAIN(ToolTipStyle.PLAIN),
    DEFAULT(null);

    companion object {
        const val KEY = ToolTipConstants.KEY_STYLE

        fun of(key: Any?): TooltipVariant {
            val style = ToolTipStyle.parse(key)
            for (k in values()) {
                if (k.style == style) return k
            }
            return DEFAULT
        }
    }
}
