package com.github.weisj.darklaf.extensions.kotlin

import com.github.weisj.darklaf.util.PropertyUtil
import javax.swing.JSpinner

var JSpinner.style: SpinnerVariant
    get() = SpinnerVariant.of(PropertyUtil.getString(this, SpinnerVariant.KEY))
    set(style) = putClientProperty(SpinnerVariant.KEY, style.key)
