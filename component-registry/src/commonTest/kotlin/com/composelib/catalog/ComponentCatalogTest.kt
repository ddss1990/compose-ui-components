package com.composelib.catalog

import kotlin.test.Test
import kotlin.test.assertEquals

class ComponentCatalogTest {
    @Test
    fun catalogEntryKeepsAllMetadata() {
        val entry = ComponentEntry(
            name = "Button",
            category = ComponentCategory.InputAndFormControls,
            description = "Triggers an action",
            previewKey = "button",
            sourceModule = "ui-components",
            usageNotes = "Use for primary and secondary actions",
        )

        assertEquals("Button", entry.name)
        assertEquals(ComponentCategory.InputAndFormControls, entry.category)
        assertEquals("Triggers an action", entry.description)
        assertEquals("button", entry.previewKey)
        assertEquals("ui-components", entry.sourceModule)
        assertEquals("Use for primary and secondary actions", entry.usageNotes)
    }
}
