package com.github.weisj.darklaf.extensions.kotlin

import com.github.weisj.darklaf.ui.text.DarkCaret
import com.github.weisj.darklaf.ui.togglebutton.ToggleButtonConstants

enum class CaretStyle(val style : DarkCaret.CaretStyle?) {
    VERTICAL_LINE_STYLE(DarkCaret.CaretStyle.VERTICAL_LINE_STYLE),
    UNDERLINE_STYLE(DarkCaret.CaretStyle.UNDERLINE_STYLE),
    BLOCK_STYLE(DarkCaret.CaretStyle.BLOCK_STYLE),
    BLOCK_BORDER_STYLE(DarkCaret.CaretStyle.BLOCK_BORDER_STYLE),
    THICK_VERTICAL_LINE_STYLE(DarkCaret.CaretStyle.THICK_VERTICAL_LINE_STYLE),
    DEFAULT(null);

    companion object {
        fun of(key : DarkCaret.CaretStyle?) : CaretStyle {
            for(k in values()) {
                if (k.style == key) return k
            }
            return DEFAULT
        }
    }
}
