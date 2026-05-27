package com.composelib.catalog

enum class ThemeMode {
    Light,
    Dark,
}

data class ThemeColorTokens(
    val primary: String,
    val onPrimary: String,
    val primaryContainer: String,
    val onPrimaryContainer: String,
    val secondary: String,
    val onSecondary: String,
    val background: String,
    val onBackground: String,
    val surface: String,
    val onSurface: String,
    val surfaceVariant: String,
    val onSurfaceVariant: String,
    val outline: String,
)

data class ThemeDefinition(
    val key: String,
    val name: String,
    val mode: ThemeMode,
    val description: String,
    val colors: ThemeColorTokens,
)

object ThemeCatalog {
    fun defaultThemes(): List<ThemeDefinition> = listOf(
        ThemeDefinition(
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
        ),
        ThemeDefinition(
            key = "editorial-dark",
            name = "Editorial Dark",
            mode = ThemeMode.Dark,
            description = "Low-light editorial theme with softened contrast.",
            colors = ThemeColorTokens(
                primary = "#A7C4DD",
                onPrimary = "#0B1D2D",
                primaryContainer = "#183247",
                onPrimaryContainer = "#D7E4F1",
                secondary = "#B8B4D7",
                onSecondary = "#17162C",
                background = "#151311",
                onBackground = "#F2ECE2",
                surface = "#1D1A17",
                onSurface = "#F2ECE2",
                surfaceVariant = "#403B35",
                onSurfaceVariant = "#CFC7BA",
                outline = "#8E877E",
            ),
        ),
    )
}
