package com.composelib.catalog

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

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
        val entry = ComponentCatalog.defaultComponents().first()

        assertEquals(PreviewSurface.Web, entry.previewTargets.first())
        assertEquals("info-display-card", entry.previewKey)
    }

    @Test
    fun defaultCatalogIncludesMediaCategoryAndFoundationComponents() {
        val entries = ComponentCatalog.defaultComponents()
        val keys = entries.map { it.previewKey }.toSet()

        assertTrue(ComponentCategory.entries.any { it == ComponentCategory.MediaAndImagery })
        assertTrue("primary-button" in keys)
        assertTrue("secondary-button" in keys)
        assertTrue("text-button" in keys)
        assertTrue("circular-image" in keys)
        assertTrue("rectangular-image" in keys)
        assertTrue("primary-secondary-text-row" in keys)
        assertTrue("tag-chip" in keys)
        assertTrue("section-header" in keys)
        assertTrue("divider-text" in keys)
        assertTrue(entries.all { it.previewTargets.first() == PreviewSurface.Web })
    }
}
