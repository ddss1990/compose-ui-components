package com.composelib.ui.input

import kotlin.test.Test
import kotlin.test.assertEquals

class FoundationButtonsTest {
    @Test
    fun loadingStateDisablesInteraction() {
        val model = FoundationButtonState(
            enabled = true,
            loading = true,
            size = FoundationButtonSize.Medium,
        )
        assertEquals(false, model.interactive)
    }
}

