package com.github.weisj.darklaf.extensions.kotlin

import com.github.weisj.darklaf.ui.button.ButtonConstants
import com.github.weisj.darklaf.util.AlignmentExt

enum class ButtonCornerStyle(val alignment : AlignmentExt?) {
    TOP(AlignmentExt.NORTH),
    BOTTOM(AlignmentExt.SOUTH),
    RIGHT(AlignmentExt.EAST),
    LEFT(AlignmentExt.WEST),
    TOP_RIGHT(AlignmentExt.NORTH_EAST),
    TOP_LEFT(AlignmentExt.NORTH_WEST),
    BOTTOM_RIGHT(AlignmentExt.SOUTH_EAST),
    BOTTOM_LEFT(AlignmentExt.SOUTH_WEST),
    CENTER(AlignmentExt.CENTER),
    LEFT_HORIZONTAL(AlignmentExt.LEFT),
    MIDDLE_HORIZONTAL(AlignmentExt.MIDDLE_HORIZONTAL),
    RIGHT_HORIZONTAL(AlignmentExt.RIGHT),
    TOP_VERTICAL(AlignmentExt.TOP),
    MIDDLE_VERTICAL(AlignmentExt.MIDDLE_HORIZONTAL),
    BOTTOM_VERTICAL(AlignmentExt.BOTTOM),
    NONE(null);

    companion object {
        fun of(alignment : AlignmentExt?) : ButtonCornerStyle {
            for(k in values()) {
                if (k.alignment == alignment) return k
            }
            return NONE
        }
    }
}
