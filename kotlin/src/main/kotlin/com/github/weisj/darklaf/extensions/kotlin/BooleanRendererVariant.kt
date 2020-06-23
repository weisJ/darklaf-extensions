package com.github.weisj.darklaf.extensions.kotlin

import com.github.weisj.darklaf.ui.cell.CellConstants

enum class BooleanRendererVariant(val key : String?) {
    CHECK_BOX(CellConstants.RENDER_TYPE_CHECKBOX),
    RADIO_BUTTON(CellConstants.RENDER_TYPE_RADIOBUTTON);

    companion object {

        fun of(key: String?): BooleanRendererVariant {
            for (k in values()) {
                if (k.key == key) return k
            }
            return CHECK_BOX
        }
    }
}
