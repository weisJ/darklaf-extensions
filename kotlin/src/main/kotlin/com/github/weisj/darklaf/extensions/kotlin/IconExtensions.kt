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

import com.github.weisj.darklaf.properties.icons.IconLoader
import java.awt.Window
import javax.swing.Icon
import kotlin.reflect.KProperty

fun Window.setFrameIcon(icon: Icon) {
    setIconImage(IconLoader.createFrameIcon(icon, this))
}

operator fun IconLoader.getValue(thisRef: Any?, property: KProperty<*>): Icon {
    return getIcon(property.name)
}

fun IconLoader.loadIcon(
    path: String,
    width: Int,
    height: Int,
    uiAware: Boolean = false,
    themed: Boolean = false
): IconDelegate {
    return IconDelegate(this, path, width, height, uiAware, themed)
}

fun iconLoader(path: String, width: Int, height: Int, uiAware: Boolean = false, themed: Boolean = false): IconDelegate {
    return IconDelegate(null, path, width, height, uiAware, themed)
}

fun iconLoader(path: String, uiAware: Boolean = false, themed: Boolean = false): IconDelegate {
    return IconDelegate(null, path, -1, -1, uiAware, themed)
}

class IconDelegate(
    private val iconLoader: IconLoader?,
    private val path: String,
    private val width: Int,
    private val height: Int,
    private val uiAware: Boolean,
    private val themed: Boolean
) {

    operator fun getValue(thisRef: Any?, property: KProperty<*>): Icon {
        val validSize = width >= 0 && height >= 0
        return (iconLoader ?: IconLoader.get(thisRef?.javaClass)).let {
            if (validSize) {
                if (uiAware) it.getUIAwareIcon(path, width, height)
                else it.getIcon(path, width, height, themed)
            } else {
                if (uiAware) it.getUIAwareIcon(path)
                else it.getIcon(path, themed)
            }
        }
    }
}
