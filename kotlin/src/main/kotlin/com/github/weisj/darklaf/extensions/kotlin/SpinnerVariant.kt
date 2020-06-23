package com.github.weisj.darklaf.extensions.kotlin

import com.github.weisj.darklaf.ui.spinner.SpinnerConstants

enum class SpinnerVariant(val key : String?) {
    PLUS_MINUS(SpinnerConstants.VARIANT_PLUS_MINUS),
    DEFAULT(null);

    companion object {
        const val KEY = SpinnerConstants.KEY_VARIANT

        fun of(key : String?) : SpinnerVariant {
            for(k in values()) {
                if (k.key == key) return k
            }
            return DEFAULT
        }
    }
}
