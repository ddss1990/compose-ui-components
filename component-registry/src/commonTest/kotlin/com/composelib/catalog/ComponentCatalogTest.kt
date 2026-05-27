package com.composelib.catalog

import kotlin.test.Test
import kotlin.test.assertEquals

class ComponentCatalogTest {
    @Test
    fun catalogEntryKeepsAllMetadata() {
        val entry = ComponentEntry(
            name = "Info display card",
            category = ComponentCategory.DataDisplay,
            description = "Shows text, metadata, and optional media in a calm card layout.",
            previewKey = "info-display-card",
            sourceModule = "ui-components",
        )

        assertEquals("Info display card", entry.name)
        assertEquals(ComponentCategory.DataDisplay, entry.category)
        assertEquals("Shows text, metadata, and optional media in a calm card layout.", entry.description)
        assertEquals("info-display-card", entry.previewKey)
        assertEquals("ui-components", entry.sourceModule)
        assertEquals(listOf(PreviewSurface.Web, PreviewSurface.Android), entry.previewTargets)
    }

    @Test
    fun defaultCatalogPrioritizesWebPreviewFirst() {
        val entry = ComponentCatalog.defaultComponents().single()

        assertEquals("info-display-card", entry.previewKey)
        assertEquals(PreviewSurface.Web, entry.previewTargets.first())
    }
}
