package com.github.weisj.darklaf.extensions.kotlin

import com.github.weisj.darklaf.ui.button.ButtonConstants

enum class ButtonVariant(val key: String) {
    BORDERLESS_RECTANGULAR(ButtonConstants.VARIANT_BORDERLESS_RECTANGULAR),
    BORDERLESS(ButtonConstants.VARIANT_BORDERLESS),
    DEFAULT(ButtonConstants.VARIANT_NONE);

    companion object {
        const val KEY = ButtonConstants.KEY_VARIANT

        fun of(key : String?) : ButtonVariant {
            for(k in values()) {
                if (k.key == key) return k
            }
            return DEFAULT
        }
    }
}
