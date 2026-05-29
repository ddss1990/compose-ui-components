package com.composelib.ui.wrapped

import kotlin.test.Test
import kotlin.test.assertEquals

class ScaffoldWrappedRootScreenTest {
    @Test
    fun wrappedScreenUsesStableDefaultTheme() {
        val theme = wrappedScreenDefaultTheme()
        assertEquals("editorial-light", theme.key)
    }
}

