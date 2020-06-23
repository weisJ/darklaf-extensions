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

enum class ButtonNeighbourPosition(val key: String) {
    LEFT_NEIGHBOUR(ButtonConstants.KEY_LEFT_NEIGHBOUR),
    RIGHT_NEIGHBOUR(ButtonConstants.KEY_RIGHT_NEIGHBOUR),
    TOP_NEIGHBOUR(ButtonConstants.KEY_TOP_NEIGHBOUR),
    TOP_LEFT_NEIGHBOUR(ButtonConstants.KEY_TOP_LEFT_NEIGHBOUR),
    TOP_RIGHT_NEIGHBOUR(ButtonConstants.KEY_TOP_RIGHT_NEIGHBOUR),
    BOTTOM_NEIGHBOUR(ButtonConstants.KEY_BOTTOM_NEIGHBOUR),
    BOTTOM_LEFT_NEIGHBOUR(ButtonConstants.KEY_BOTTOM_LEFT_NEIGHBOUR),
    BOTTOM_RIGHT_NEIGHBOUR(ButtonConstants.KEY_BOTTOM_RIGHT_NEIGHBOUR)
}
