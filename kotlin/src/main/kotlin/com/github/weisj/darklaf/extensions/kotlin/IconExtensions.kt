package com.github.weisj.darklaf.extensions.kotlin

import com.github.weisj.darklaf.icons.IconLoader
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
