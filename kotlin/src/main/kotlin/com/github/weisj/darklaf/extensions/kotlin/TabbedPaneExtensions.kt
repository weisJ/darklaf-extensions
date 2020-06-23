package com.github.weisj.darklaf.extensions.kotlin

import com.github.weisj.darklaf.ui.tabbedpane.DarkTabbedPaneUI
import com.github.weisj.darklaf.util.PropertyUtil
import java.awt.Component
import java.awt.Insets
import javax.swing.Action
import javax.swing.JTabbedPane

var JTabbedPane.centerTabs: Boolean
    get() = PropertyUtil.getBooleanProperty(this, DarkTabbedPaneUI.KEY_CENTER_TABS)
    set(centered) = putClientProperty(DarkTabbedPaneUI.KEY_CENTER_TABS, centered)

var JTabbedPane.leadingComponent: Component?
    get() = PropertyUtil.getObject(this, DarkTabbedPaneUI.KEY_LEADING_COMP, Component::class.java)
    set(component) = putClientProperty(DarkTabbedPaneUI.KEY_LEADING_COMP, component)

var JTabbedPane.trailingComponent: Component?
    get() = PropertyUtil.getObject(this, DarkTabbedPaneUI.KEY_TRAILING_COMP, Component::class.java)
    set(component) = putClientProperty(DarkTabbedPaneUI.KEY_TRAILING_COMP, component)

var JTabbedPane.northComponent: Component?
    get() = PropertyUtil.getObject(this, DarkTabbedPaneUI.KEY_NORTH_COMP, Component::class.java)
    set(component) = putClientProperty(DarkTabbedPaneUI.KEY_NORTH_COMP, component)

var JTabbedPane.eastComponent: Component?
    get() = PropertyUtil.getObject(this, DarkTabbedPaneUI.KEY_EAST_COMP, Component::class.java)
    set(component) = putClientProperty(DarkTabbedPaneUI.KEY_EAST_COMP, component)

var JTabbedPane.southComponent: Component?
    get() = PropertyUtil.getObject(this, DarkTabbedPaneUI.KEY_SOUTH_COMP, Component::class.java)
    set(component) = putClientProperty(DarkTabbedPaneUI.KEY_SOUTH_COMP, component)

var JTabbedPane.westComponent: Component?
    get() = PropertyUtil.getObject(this, DarkTabbedPaneUI.KEY_WEST_COMP, Component::class.java)
    set(component) = putClientProperty(DarkTabbedPaneUI.KEY_WEST_COMP, component)

var JTabbedPane.dndEnabled: Boolean
    get() = PropertyUtil.getBooleanProperty(this, DarkTabbedPaneUI.KEY_DND)
    set(dnd) = putClientProperty(DarkTabbedPaneUI.KEY_DND, dnd)

var JTabbedPane.focusPainted: Boolean
    get() = PropertyUtil.getBooleanProperty(this, DarkTabbedPaneUI.KEY_DRAW_FOCUS_BAR)
    set(focusPainted) = putClientProperty(DarkTabbedPaneUI.KEY_DRAW_FOCUS_BAR, focusPainted)

var JTabbedPane.rotateTabRuns: Boolean
    get() = PropertyUtil.getBooleanProperty(this, DarkTabbedPaneUI.KEY_ROTATE_TAB_RUNS)
    set(rotate) = putClientProperty(DarkTabbedPaneUI.KEY_ROTATE_TAB_RUNS, rotate)

var JTabbedPane.showNewTabButton: Boolean
    get() = PropertyUtil.getBooleanProperty(this, DarkTabbedPaneUI.KEY_SHOW_NEW_TAB_BUTTON)
    set(show) = putClientProperty(DarkTabbedPaneUI.KEY_SHOW_NEW_TAB_BUTTON, show)

var JTabbedPane.newTabAction: Action?
    get() = PropertyUtil.getObject(this, DarkTabbedPaneUI.KEY_SHOW_NEW_TAB_BUTTON, Action::class.java)
    set(action) = putClientProperty(DarkTabbedPaneUI.KEY_SHOW_NEW_TAB_BUTTON, action)

var JTabbedPane.tabAreaInsets: Insets
    get() = PropertyUtil.getObject(
        this,
        DarkTabbedPaneUI.KEY_TAB_AREA_INSETS,
        Insets::class.java,
        Insets(0, 0, 0, 0)
    )
    set(ins) = putClientProperty(DarkTabbedPaneUI.KEY_TAB_AREA_INSETS, ins)

var JTabbedPane.contentAreaInsets: Insets
    get() = PropertyUtil.getObject(
        this,
        DarkTabbedPaneUI.KEY_CONTENT_BORDER_INSETS,
        Insets::class.java,
        Insets(0, 0, 0, 0)
    )
    set(ins) = putClientProperty(DarkTabbedPaneUI.KEY_CONTENT_BORDER_INSETS, ins)
