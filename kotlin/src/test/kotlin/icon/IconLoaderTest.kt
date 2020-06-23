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
