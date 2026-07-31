package com.composelib.ui.theme

import androidx.compose.ui.graphics.Color
import com.composelib.catalog.ThemeColorTokens
import com.composelib.catalog.ThemeDefinition
import com.composelib.catalog.ThemeMode
import kotlin.test.Test
import kotlin.test.assertEquals

class ComposeLibThemeTest {
    @Test
    fun themeDefinitionMapsToMaterialColorScheme() {
        val theme = ThemeDefinition(
            key = "editorial-light",
            name = "Editorial Light",
            mode = ThemeMode.Light,
            description = "Warm, gallery-like light theme.",
            colors = ThemeColorTokens(
                primary = "#1B3A57",
                onPrimary = "#FFFFFF",
                primaryContainer = "#D7E4F1",
                onPrimaryContainer = "#10253A",
                secondary = "#5C5A7D",
                onSecondary = "#FFFFFF",
                background = "#F7F4EE",
                onBackground = "#1D1B17",
                surface = "#FFFBF4",
                onSurface = "#1D1B17",
                surfaceVariant = "#E5E0D8",
                onSurfaceVariant = "#4A4540",
                outline = "#77726B",
                textPrimary = "#1D1B17",
                textSecondary = "#423F39",
                textTertiary = "#726C64",
                textQuaternary = "#B4AEA5",
                textDisabled = "#A6A098",
                textHighlight = "#1B3A57",
                textOnHighlight = "#FFFFFF",
                iconPrimary = "#1D1B17",
                iconSecondary = "#423F39",
                iconTertiary = "#726C64",
                iconQuaternary = "#B4AEA5",
                errorRed = "#BA1A1A",
                errorRedContainer = "#FFDAD6",
                warningYellow = "#B8860B",
                warningOrange = "#FF6B00",
                warningOrangeContainer = "#FFE0C2",
                surfaceHighlight = "#1B3A57",
                surfaceHighlightContainer = "#D7E4F1",
                divider = "#35312C",
                dividerVariant = "#544E47",
                pressOverlay = "#1A000000",
            ),
        )

        val scheme = theme.toMaterialColorScheme()

        assertEquals(Color(0xFF1B3A57), scheme.primary)
        assertEquals(Color(0xFFF7F4EE), scheme.background)
        assertEquals(Color(0xFF1D1B17), scheme.onBackground)
        assertEquals(Color(0xFFE5E0D8), scheme.surfaceVariant)
        assertEquals(Color(0xFFBA1A1A), scheme.error)
        assertEquals(Color(0xFF1B3A57), scheme.tertiary)
    }
}
