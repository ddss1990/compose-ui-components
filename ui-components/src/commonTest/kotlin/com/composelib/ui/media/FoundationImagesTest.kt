package com.composelib.ui.media

import kotlin.test.Test
import kotlin.test.assertEquals

class FoundationImagesTest {
    @Test
    fun circularImageDefaultsToPlainStyle() {
        assertEquals(CircularImageStyle.Plain, CircularImageDefaults.style)
    }
}

