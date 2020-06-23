package com.github.weisj.darklaf.extensions.kotlin

import com.github.weisj.darklaf.components.tooltip.ToolTipContext
import com.github.weisj.darklaf.ui.tooltip.ToolTipConstants
import com.github.weisj.darklaf.util.Alignment
import com.github.weisj.darklaf.util.PropertyUtil
import java.awt.Insets
import javax.swing.JComponent
import javax.swing.JPanel

var JComponent.tooltipVariant: TooltipVariant
    get() = TooltipVariant.of(PropertyUtil.getObject(this, TooltipVariant.KEY))
    set(variant) = putClientProperty(TooltipVariant.KEY, variant.style)

var JComponent.tooltipContext: ToolTipContext?
    get() = PropertyUtil.getObject(this, ToolTipConstants.KEY_CONTEXT, ToolTipContext::class.java)
    set(context) = putClientProperty(ToolTipConstants.KEY_CONTEXT, context)

var JComponent.tooltipInsets: Insets
    get() = PropertyUtil.getObject(
        this,
        ToolTipConstants.KEY_INSETS,
        Insets::class.java,
        Insets(0, 0, 0, 0)
    )
    set(ins) = putClientProperty(ToolTipConstants.KEY_INSETS, ins)

fun JComponent.configureTooltipContext(block: ToolTipContext.() -> ToolTipContext) {
    (tooltipContext?: ToolTipContext.createDefaultContext()).run { block }
}
