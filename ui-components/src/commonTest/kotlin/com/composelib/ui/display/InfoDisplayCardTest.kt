package com.composelib.ui.display

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class InfoDisplayCardTest {
    @Test
    fun defaultSampleCarriesTextAndMediaMetadata() {
        val sample = InfoDisplayCardDefaults.sample

        assertEquals("Product update", sample.eyebrow)
        assertTrue(sample.title.contains("Editorial summaries"))
        assertTrue(sample.body.contains("media block"))
        assertEquals(3, sample.metadata.size)
        assertEquals("Preview image", sample.mediaLabel)
    }
}
