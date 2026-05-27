package com.composelib.catalog

enum class PreviewSurface(val displayName: String) {
    Web("preview-web"),
    Android("preview-android"),
}

enum class ComponentCategory(val displayName: String) {
    InputAndFormControls("Input and form controls"),
    NavigationAndLayout("Navigation and layout"),
    FeedbackAndState("Feedback and state"),
    DataDisplay("Data display"),
    CompositeFormSections("Composite form sections"),
    BusinessOrientedCompositeComponents("Business-oriented composite components"),
}

data class ComponentEntry(
    val name: String,
    val category: ComponentCategory,
    val description: String,
    val previewKey: String,
    val sourceModule: String,
    val previewTargets: List<PreviewSurface> = listOf(PreviewSurface.Web, PreviewSurface.Android),
    val usageNotes: String? = null,
)

object ComponentCatalog {
    fun defaultComponents(): List<ComponentEntry> = listOf(
        ComponentEntry(
            name = "Info display card",
            category = ComponentCategory.DataDisplay,
            description = "Shows text, metadata, and optional media in a calm card layout.",
            previewKey = "info-display-card",
            sourceModule = "ui-components",
            previewTargets = listOf(PreviewSurface.Web, PreviewSurface.Android),
            usageNotes = "Use for article summaries, content highlights, and status snapshots.",
        ),
    )
}
