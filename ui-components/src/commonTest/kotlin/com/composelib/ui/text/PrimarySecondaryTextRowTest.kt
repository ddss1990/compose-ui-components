package com.composelib.ui.text

import kotlin.test.Test
import kotlin.test.assertEquals

class PrimarySecondaryTextRowTest {
    @Test
    fun defaultsExposeEnabledState() {
        assertEquals(true, PrimarySecondaryTextDefaults.enabled)
    }
}

