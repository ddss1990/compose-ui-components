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
            ),
        )

        val scheme = theme.toMaterialColorScheme()

        assertEquals(Color(0xFF1B3A57), scheme.primary)
        assertEquals(Color(0xFFF7F4EE), scheme.background)
        assertEquals(Color(0xFF1D1B17), scheme.onBackground)
        assertEquals(Color(0xFFE5E0D8), scheme.surfaceVariant)
    }
}
