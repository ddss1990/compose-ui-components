package com.composelib.catalog

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ThemeCatalogTest {
    @Test
    fun defaultThemesExposeDistinctPalettesAndNewThemeSet() {
        val themes = ThemeCatalog.defaultThemes()
        val keys = themes.map { it.key }

        assertEquals(
            listOf(
                "editorial-light",
                "editorial-dark",
                "neon-arcade-dark",
                "forest-mist-light",
                "imperial-lux-dark",
            ),
            keys,
        )
        assertEquals(ThemeMode.Light, themes[0].mode)
        assertEquals(ThemeMode.Dark, themes[1].mode)
        assertEquals("#F7F4EE", themes[0].colors.background)
        assertEquals("#151311", themes[1].colors.background)
        assertEquals("#0A0A12", themes[2].colors.background)
        assertEquals("#F3F6F1", themes[3].colors.background)
        assertEquals("#101319", themes[4].colors.background)
        assertEquals(20, themes[0].foundation.typography.titleSizeSp)
        assertEquals(10, themes[3].foundation.spacing.compactDp)
        assertEquals(4f / 3f, themes[0].foundation.media.thumbnailAspectRatio)
        assertEquals(0.18f, themes[1].foundation.media.overlayAlpha)
        assertEquals(0.26f, themes[2].foundation.media.overlayAlpha)
        assertEquals(0.22f, themes[4].foundation.media.overlayAlpha)
        assertTrue(themes.map { it.name }.toSet().size == themes.size)
    }
}
