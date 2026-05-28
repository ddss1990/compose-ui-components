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
    MediaAndImagery("Media and imagery"),
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
        ComponentEntry(
            name = "Primary button",
            category = ComponentCategory.InputAndFormControls,
            description = "Emphasized button for high-priority actions with loading support.",
            previewKey = "primary-button",
            sourceModule = "ui-components",
            usageNotes = "Use for primary actions such as save, submit, and continue.",
        ),
        ComponentEntry(
            name = "Secondary button",
            category = ComponentCategory.InputAndFormControls,
            description = "Supporting button style for secondary actions.",
            previewKey = "secondary-button",
            sourceModule = "ui-components",
            usageNotes = "Use beside a primary button for less-emphasized actions.",
        ),
        ComponentEntry(
            name = "Text button",
            category = ComponentCategory.InputAndFormControls,
            description = "Low-emphasis action button with transparent background.",
            previewKey = "text-button",
            sourceModule = "ui-components",
            usageNotes = "Use for tertiary actions in dense layouts.",
        ),
        ComponentEntry(
            name = "Circular image",
            category = ComponentCategory.MediaAndImagery,
            description = "Round image with optional border, elevation, and status ring styles.",
            previewKey = "circular-image",
            sourceModule = "ui-components",
            usageNotes = "Use for avatars, profile chips, and compact media markers.",
        ),
        ComponentEntry(
            name = "Rectangular image",
            category = ComponentCategory.MediaAndImagery,
            description = "Rectangular image with configurable aspect ratio and corner radius.",
            previewKey = "rectangular-image",
            sourceModule = "ui-components",
            usageNotes = "Use for thumbnails, banners, and card media.",
        ),
        ComponentEntry(
            name = "Primary-secondary text row",
            category = ComponentCategory.DataDisplay,
            description = "Two-line text stack with optional trailing content slot.",
            previewKey = "primary-secondary-text-row",
            sourceModule = "ui-components",
            usageNotes = "Use in list rows, profile cells, and item summaries.",
        ),
        ComponentEntry(
            name = "Tag chip",
            category = ComponentCategory.FeedbackAndState,
            description = "Compact status chip with neutral, success, and warning variants.",
            previewKey = "tag-chip",
            sourceModule = "ui-components",
            usageNotes = "Use for short state badges and inline labels.",
        ),
        ComponentEntry(
            name = "Section header",
            category = ComponentCategory.NavigationAndLayout,
            description = "Section title block with optional subtitle and action slot.",
            previewKey = "section-header",
            sourceModule = "ui-components",
            usageNotes = "Use to separate and title grouped content blocks.",
        ),
        ComponentEntry(
            name = "Divider text",
            category = ComponentCategory.NavigationAndLayout,
            description = "Horizontal divider with centered text label.",
            previewKey = "divider-text",
            sourceModule = "ui-components",
            usageNotes = "Use to separate alternate flows such as 'or continue with'.",
        ),
    )
}
