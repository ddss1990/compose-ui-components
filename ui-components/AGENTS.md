# UI Components Module Instructions

## Module purpose

This module is the publishable Compose library surface for reusable UI components.

## Module rules

- Keep only reusable production code in this module.
- Do not place preview app navigation, catalog screens, or demo-only helpers here.
- Keep the public API small, stable, and easy to consume from other repositories.
- Prefer component APIs that can be reused across different apps without project-specific assumptions.
- Keep reusable Compose code in `commonMain`; any Android-only code must stay in Android source sets.
- Do not depend on Android-only `androidx.compose.*` artifacts from shared source sets; use Compose Multiplatform dependencies there instead.

## Component authoring rules

- Build components from shared tokens, theme, and primitives in this module.
- Add new base components before introducing higher-level composites that depend on them.
- Every exported component should have:
  - a clear category;
  - a concise description;
  - documented states or variants;
  - at least one previewable example in the preview app.
- Keep defaults predictable and aligned with Compose and Material conventions unless the design intentionally differs.
- Read shared theme foundation tokens from `LocalComposeLibTheme` rather than hardcoding spacing, shapes, or typography.

## Release rules

- Treat any change to public composable signatures as a release-impacting change.
- Avoid unnecessary breaking API changes.
- Keep versioning semantic and aligned with the published artifact.

## Documentation rules

- Update module-level docs when component APIs, tokens, or export surface change.
- If a component moves categories or changes its preview contract, update the catalog and guidance together.
- Keep the `ComposeLibTheme(...)` entry point aligned with the shared theme catalog and avoid hardcoded color values in component code.
