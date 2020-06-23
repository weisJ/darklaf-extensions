/*
 * MIT License
 *
 * Copyright (c) 2020 Jannis Weis
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */
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
