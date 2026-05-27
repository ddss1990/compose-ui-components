package com.composelib.catalog

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
    val usageNotes: String? = null,
)
