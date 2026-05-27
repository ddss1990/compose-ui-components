package com.composelib.catalog

import kotlin.test.Test
import kotlin.test.assertEquals

class ThemeCatalogTest {
    @Test
    fun defaultThemesExposeDistinctLightAndDarkPalettes() {
        val themes = ThemeCatalog.defaultThemes()

        assertEquals(listOf("editorial-light", "editorial-dark"), themes.map { it.key })
        assertEquals(ThemeMode.Light, themes[0].mode)
        assertEquals(ThemeMode.Dark, themes[1].mode)
        assertEquals("#F7F4EE", themes[0].colors.background)
        assertEquals("#151311", themes[1].colors.background)
        assertEquals(20, themes[0].foundation.typography.titleSizeSp)
        assertEquals(12, themes[0].foundation.spacing.compactDp)
        assertEquals(4f / 3f, themes[0].foundation.media.thumbnailAspectRatio)
        assertEquals(0.18f, themes[1].foundation.media.overlayAlpha)
    }
}
