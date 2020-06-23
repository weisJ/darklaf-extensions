package com.github.weisj.darklaf.extensions.kotlin

import com.github.weisj.darklaf.ui.slider.DarkSliderUI

enum class SliderVariant(val key : String?) {
    VOLUME(DarkSliderUI.VARIANT_VOLUME),
    DEFAULT(null);

    companion object {
        const val KEY = DarkSliderUI.KEY_VARIANT

        fun of(key : String?) : SliderVariant {
            for(k in values()) {
                if (k.key == key) return k
            }
            return DEFAULT
        }
    }
}
