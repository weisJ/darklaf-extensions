package com.github.weisj.darklaf.extensions.kotlin

import com.github.weisj.darklaf.ui.togglebutton.ToggleButtonConstants

enum class ToggleButtonVariant(val key : String?) {
    SLIDER(ToggleButtonConstants.VARIANT_SLIDER),
    DEFAULT(null);

    companion object {
        const val KEY = ToggleButtonConstants.KEY_VARIANT

        fun of(key : String?) : ToggleButtonVariant {
            for(k in values()) {
                if (k.key == key) return k
            }
            return DEFAULT
        }
    }
}
