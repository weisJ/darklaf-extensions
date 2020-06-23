package com.github.weisj.darklaf.extensions.kotlin

import com.github.weisj.darklaf.ui.text.DarkTextFieldUI

enum class TextFieldVariant(val key : String?) {
    SEARCH(DarkTextFieldUI.VARIANT_SEARCH),
    DEFAULT(null);

    companion object {
        const val KEY = DarkTextFieldUI.KEY_VARIANT

        fun of(key : String?) : TextFieldVariant {
            for(k in values()) {
                if (k.key == key) return k
            }
            return DEFAULT
        }
    }
}
