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
                "ec-hmi-light",
                "ec-hmi-dark",
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
        assertEquals("#FFFFFF", themes[5].colors.background)
        assertEquals("#000000", themes[6].colors.background)
        assertEquals(20, themes[0].foundation.typography.titleSizeSp)
        assertEquals(10, themes[3].foundation.spacing.compactDp)
        assertEquals(4f / 3f, themes[0].foundation.media.thumbnailAspectRatio)
        assertEquals(0.18f, themes[1].foundation.media.overlayAlpha)
        assertEquals(0.26f, themes[2].foundation.media.overlayAlpha)
        assertEquals(0.22f, themes[4].foundation.media.overlayAlpha)
        assertTrue(themes.map { it.name }.toSet().size == themes.size)
    }

    @Test
    fun ecHmiThemesExposeSemanticColorTokens() {
        val themes = ThemeCatalog.defaultThemes()
        val light = themes.first { it.key == "ec-hmi-light" }
        val dark = themes.first { it.key == "ec-hmi-dark" }

        assertEquals(ThemeMode.Light, light.mode)
        assertEquals(ThemeMode.Dark, dark.mode)

        assertEquals("#FF000000", light.colors.textPrimary)
        assertEquals("#D9000000", light.colors.textSecondary)
        assertEquals("#99000000", light.colors.textTertiary)
        assertEquals("#FFFFFFFF", dark.colors.textPrimary)
        assertEquals("#E6FFFFFF", dark.colors.textSecondary)
        assertEquals("#99FFFFFF", dark.colors.textTertiary)

        assertEquals("#FF0088FF", light.colors.textHighlight)
        assertEquals("#FF0091FF", dark.colors.textHighlight)

        assertEquals("#FF3B30", light.colors.errorRed)
        assertEquals("#FF453A", dark.colors.errorRed)

        assertEquals("#33787880", light.colors.divider)
        assertEquals("#52787880", dark.colors.divider)
    }

    @Test
    fun allThemesHaveCompleteSemanticTokens() {
        val themes = ThemeCatalog.defaultThemes()
        for (theme in themes) {
            assertTrue(theme.colors.textPrimary.isNotBlank(), "${theme.key} textPrimary")
            assertTrue(theme.colors.textSecondary.isNotBlank(), "${theme.key} textSecondary")
            assertTrue(theme.colors.textHighlight.isNotBlank(), "${theme.key} textHighlight")
            assertTrue(theme.colors.errorRed.isNotBlank(), "${theme.key} errorRed")
            assertTrue(theme.colors.warningYellow.isNotBlank(), "${theme.key} warningYellow")
            assertTrue(theme.colors.surfaceHighlight.isNotBlank(), "${theme.key} surfaceHighlight")
            assertTrue(theme.colors.divider.isNotBlank(), "${theme.key} divider")
            assertTrue(theme.colors.pressOverlay.isNotBlank(), "${theme.key} pressOverlay")
        }
    }
}
