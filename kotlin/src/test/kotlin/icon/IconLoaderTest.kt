package icon

import com.github.weisj.darklaf.extensions.kotlin.iconLoader
import com.github.weisj.darklaf.icons.UIAwareIcon
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class IconLoaderTest {
    @Test
    fun `Icons should be returned correctly`() {
        val size = 25
        val uiAwareImageIcon by iconLoader("aware_image_icon.png", uiAware = true)
        val uiAwareImageIconSized by iconLoader("aware_image_icon.png", size, size, uiAware = true)

        val uiAwareIcon by iconLoader("aware_icon.svg", uiAware = true)
        val uiAwareIconSized by iconLoader("aware_icon.svg", size, size, uiAware = true)

        val themedIcon by iconLoader("themed_icon.svg", size, size, themed = true)
        val imageIcon by iconLoader("image_icon.png")

        Assertions.assertNotNull(uiAwareImageIcon)
        Assertions.assertNotNull(uiAwareImageIconSized)
        Assertions.assertNotNull(uiAwareIcon)
        Assertions.assertNotNull(uiAwareIconSized)
        Assertions.assertNotNull(themedIcon)
        Assertions.assertNotNull(imageIcon)

        Assertions.assertTrue(uiAwareImageIcon is UIAwareIcon)
        Assertions.assertTrue(uiAwareImageIconSized is UIAwareIcon)
        Assertions.assertEquals(size, uiAwareImageIconSized.iconHeight)
        Assertions.assertEquals(size, uiAwareImageIconSized.iconWidth)

        Assertions.assertTrue(uiAwareIcon is UIAwareIcon)
        Assertions.assertTrue(uiAwareIconSized is UIAwareIcon)
        Assertions.assertEquals(size, uiAwareIconSized.iconHeight)
        Assertions.assertEquals(size, uiAwareIconSized.iconWidth)

        Assertions.assertEquals(size, themedIcon.iconWidth)
        Assertions.assertEquals(size, themedIcon.iconHeight)
    }
}
