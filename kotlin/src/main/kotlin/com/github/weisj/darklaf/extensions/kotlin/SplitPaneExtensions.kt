package com.github.weisj.darklaf.extensions.kotlin

import com.github.weisj.darklaf.util.PropertyUtil
import javax.swing.JSplitPane

var JSplitPane.dividerVariant: SplitPaneDividerVariant
    get() = SplitPaneDividerVariant.of(PropertyUtil.getObject(this, SplitPaneDividerVariant.KEY))
    set(variant) = putClientProperty(SplitPaneDividerVariant.KEY, variant.style)
