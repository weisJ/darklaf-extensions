package com.github.weisj.darklaf.extensions.kotlin

import com.github.weisj.darklaf.ui.tree.DarkTreeUI

enum class TreeLineVariant(val key: String?) {
    LINE(DarkTreeUI.STYLE_LINE),
    DASHED(DarkTreeUI.STYLE_DASHED),
    NONE(DarkTreeUI.STYLE_NONE),
    DEFAULT(null);

    companion object {
        const val KEY = DarkTreeUI.KEY_LINE_STYLE

        fun of(key: String?): TreeLineVariant {
            for (k in values()) {
                if (k.key == key) return k
            }
            return DEFAULT
        }
    }
}
