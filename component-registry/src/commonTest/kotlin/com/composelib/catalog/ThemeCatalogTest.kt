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
        assertEquals("#F7F4EE", themes[0].colors.material.background)
        assertEquals("#151311", themes[1].colors.material.background)
        assertEquals("#0A0A12", themes[2].colors.material.background)
        assertEquals("#F3F6F1", themes[3].colors.material.background)
        assertEquals("#101319", themes[4].colors.material.background)
        assertEquals("#FFFFFF", themes[5].colors.material.background)
        assertEquals("#000000", themes[6].colors.material.background)
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

        assertEquals("#FF000000", light.colors.semantic.textPrimary)
        assertEquals("#D9000000", light.colors.semantic.textSecondary)
        assertEquals("#99000000", light.colors.semantic.textTertiary)
        assertEquals("#FFFFFFFF", dark.colors.semantic.textPrimary)
        assertEquals("#E6FFFFFF", dark.colors.semantic.textSecondary)
        assertEquals("#99FFFFFF", dark.colors.semantic.textTertiary)

        assertEquals("#FF0088FF", light.colors.semantic.textHighlight)
        assertEquals("#FF0091FF", dark.colors.semantic.textHighlight)

        assertEquals("#FF3B30", light.colors.semantic.errorRed)
        assertEquals("#FF453A", dark.colors.semantic.errorRed)

        assertEquals("#33787880", light.colors.semantic.divider)
        assertEquals("#52787880", dark.colors.semantic.divider)
    }

    @Test
    fun allThemesHaveCompleteSemanticTokens() {
        val themes = ThemeCatalog.defaultThemes()
        for (theme in themes) {
            assertTrue(theme.colors.semantic.textPrimary.isNotBlank(), "${theme.key} textPrimary")
            assertTrue(theme.colors.semantic.textSecondary.isNotBlank(), "${theme.key} textSecondary")
            assertTrue(theme.colors.semantic.textHighlight.isNotBlank(), "${theme.key} textHighlight")
            assertTrue(theme.colors.semantic.errorRed.isNotBlank(), "${theme.key} errorRed")
            assertTrue(theme.colors.semantic.warningYellow.isNotBlank(), "${theme.key} warningYellow")
            assertTrue(theme.colors.semantic.surfaceHighlight.isNotBlank(), "${theme.key} surfaceHighlight")
            assertTrue(theme.colors.semantic.divider.isNotBlank(), "${theme.key} divider")
            assertTrue(theme.colors.semantic.pressOverlay.isNotBlank(), "${theme.key} pressOverlay")
        }
    }
}
