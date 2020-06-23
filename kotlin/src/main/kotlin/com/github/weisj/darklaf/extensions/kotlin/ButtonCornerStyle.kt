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

import com.github.weisj.darklaf.util.AlignmentExt

enum class ButtonCornerStyle(val alignment: AlignmentExt?) {
    TOP(AlignmentExt.NORTH),
    BOTTOM(AlignmentExt.SOUTH),
    RIGHT(AlignmentExt.EAST),
    LEFT(AlignmentExt.WEST),
    TOP_RIGHT(AlignmentExt.NORTH_EAST),
    TOP_LEFT(AlignmentExt.NORTH_WEST),
    BOTTOM_RIGHT(AlignmentExt.SOUTH_EAST),
    BOTTOM_LEFT(AlignmentExt.SOUTH_WEST),
    CENTER(AlignmentExt.CENTER),
    LEFT_HORIZONTAL(AlignmentExt.LEFT),
    MIDDLE_HORIZONTAL(AlignmentExt.MIDDLE_HORIZONTAL),
    RIGHT_HORIZONTAL(AlignmentExt.RIGHT),
    TOP_VERTICAL(AlignmentExt.TOP),
    MIDDLE_VERTICAL(AlignmentExt.MIDDLE_HORIZONTAL),
    BOTTOM_VERTICAL(AlignmentExt.BOTTOM),
    NONE(null);

    companion object {
        fun of(alignment: AlignmentExt?): ButtonCornerStyle {
            for (k in values()) {
                if (k.alignment == alignment) return k
            }
            return NONE
        }
    }
}
