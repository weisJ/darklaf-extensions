package com.github.weisj.darklaf.extensions.kotlin

import com.github.weisj.darklaf.ui.progressbar.DarkProgressBarUI
import com.github.weisj.darklaf.util.PropertyUtil
import javax.swing.JProgressBar

var JProgressBar.hasFailed: Boolean
    get() = PropertyUtil.getBooleanProperty(this, DarkProgressBarUI.KEY_FAILED)
    set(failed) = putClientProperty(DarkProgressBarUI.KEY_FAILED, failed)

var JProgressBar.hasPassed: Boolean
    get() = PropertyUtil.getBooleanProperty(this, DarkProgressBarUI.KEY_PASSED)
    set(passed) = putClientProperty(DarkProgressBarUI.KEY_PASSED, passed)
