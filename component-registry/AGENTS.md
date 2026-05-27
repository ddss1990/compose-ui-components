# Component Registry Module Instructions

## Module purpose

This module defines the shared catalog metadata for Compose components.

## Module rules

- Keep catalog data separate from component implementation code.
- Model component name, category, description, and preview entry here.
- Keep this module free of demo UI and publishable component implementations.

## Catalog rules

- Use the catalog as the single source of truth for preview navigation.
- Keep category names stable and human-readable.
- Update catalog entries when component names, categories, or preview routes change.
- Avoid duplicating catalog definitions in the preview app or future web preview.

## Documentation rules

- Update this module's instruction files when catalog structure or metadata fields change.
