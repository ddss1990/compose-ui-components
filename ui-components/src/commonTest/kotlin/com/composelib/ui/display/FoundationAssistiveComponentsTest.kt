package com.composelib.ui.display

import kotlin.test.Test
import kotlin.test.assertEquals

class FoundationAssistiveComponentsTest {
    @Test
    fun tagChipSupportsWarningVariant() {
        assertEquals("Warning", TagChipVariant.Warning.name)
    }
}

