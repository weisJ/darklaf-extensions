package com.github.weisj.darklaf.extensions.kotlin

import com.github.weisj.darklaf.ui.splitpane.DarkSplitPaneUI
import com.github.weisj.darklaf.ui.splitpane.DividerStyle

enum class SplitPaneDividerVariant(val style: DividerStyle?) {
    GRIP(DividerStyle.GRIP),
    GRIP_BORDERLESS(DividerStyle.GRIP_BORDERLESS),
    LINE(DividerStyle.LINE),
    INVISIBLE(DividerStyle.INVISIBLE),
    DEFAULT(null);

    companion object {
        const val KEY = DarkSplitPaneUI.KEY_STYLE

        fun of(key: Any?): SplitPaneDividerVariant {
            for (k in values()) {
                if (k.style == key) return k
                if (k.style?.name?.equals(key?.toString(), ignoreCase = true) == true) return k
            }
            return DEFAULT
        }
    }
}
