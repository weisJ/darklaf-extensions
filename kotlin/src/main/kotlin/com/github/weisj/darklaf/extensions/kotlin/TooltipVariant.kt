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
