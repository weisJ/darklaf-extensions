package com.github.weisj.darklaf.extensions.kotlin

import com.github.weisj.darklaf.ui.slider.DarkSliderUI
import com.github.weisj.darklaf.util.PropertyUtil
import javax.swing.JSlider

var JSlider.variant: SliderVariant
    get() = SliderVariant.of(PropertyUtil.getString(this, SliderVariant.KEY))
    set(variant) = putClientProperty(SliderVariant.KEY, variant.key)

var JSlider.showVolumeIcon: Boolean
    get() = PropertyUtil.getBooleanProperty(this, DarkSliderUI.KEY_SHOW_VOLUME_ICON)
    set(show) = putClientProperty(DarkSliderUI.KEY_SHOW_VOLUME_ICON, show)

var JSlider.instantScroll: Boolean
    get() = PropertyUtil.getBooleanProperty(this, DarkSliderUI.KEY_INSTANT_SCROLL)
    set(enabled) = putClientProperty(DarkSliderUI.KEY_INSTANT_SCROLL, enabled)

var JSlider.forcePlainThumb: Boolean
    get() = !PropertyUtil.getBooleanProperty(this, DarkSliderUI.KEY_THUMB_ARROW_SHAPE, true)
    set(forcePlain) = putClientProperty(DarkSliderUI.KEY_THUMB_ARROW_SHAPE, !forcePlain)
