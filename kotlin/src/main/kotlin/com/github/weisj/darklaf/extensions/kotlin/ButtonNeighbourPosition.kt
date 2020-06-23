package com.github.weisj.darklaf.extensions.kotlin

import com.github.weisj.darklaf.ui.button.ButtonConstants

enum class ButtonNeighbourPosition(val key: String) {
    LEFT_NEIGHBOUR(ButtonConstants.KEY_LEFT_NEIGHBOUR),
    RIGHT_NEIGHBOUR(ButtonConstants.KEY_RIGHT_NEIGHBOUR),
    TOP_NEIGHBOUR(ButtonConstants.KEY_TOP_NEIGHBOUR),
    TOP_LEFT_NEIGHBOUR(ButtonConstants.KEY_TOP_LEFT_NEIGHBOUR),
    TOP_RIGHT_NEIGHBOUR(ButtonConstants.KEY_TOP_RIGHT_NEIGHBOUR),
    BOTTOM_NEIGHBOUR(ButtonConstants.KEY_BOTTOM_NEIGHBOUR),
    BOTTOM_LEFT_NEIGHBOUR(ButtonConstants.KEY_BOTTOM_LEFT_NEIGHBOUR),
    BOTTOM_RIGHT_NEIGHBOUR(ButtonConstants.KEY_BOTTOM_RIGHT_NEIGHBOUR)
}
