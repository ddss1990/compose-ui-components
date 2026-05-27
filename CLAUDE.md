# ComposeLib

## Scope and precedence

- This is the project-level instruction file.
- Child modules may add their own `AGENTS.md`; those module instructions apply in addition to this file.
- If instructions conflict, the narrower scope wins.

## Repository purpose

This repository is intended to become a reusable Jetpack Compose component library with:

- a publishable Android library module;
- an Android preview app;
- a later web preview surface;
- a shared component catalog with categories and metadata.

## Working rules

- Prefer small, reusable modules over a single large app module.
- Keep preview/demo code out of the published library artifact.
- Keep component metadata centralized so Android and web previews do not drift.
- Categorize components by usage and user intent, not just widget type.
- Favor stable public APIs in the library module.
- Avoid duplicate component registries or hardcoded preview lists.
- Do not auto-commit changes; leave commits to the user.
- Update documentation promptly when code, structure, or publishing rules change.

## Cross-tool collaboration

- Claude and Copilot should follow the same repository conventions.
- Reuse existing patterns before introducing new ones.
- Make changes that keep the repository easy to consume as a library and easy to browse as a preview catalog.
- When a change affects a module boundary or public API, update the relevant instruction file in the same change.

## Compose component guidance

- Add base components before composite business components when building out the library.
- For each component, define:
  - name;
  - category;
  - short description;
  - preview entry;
  - documented states or variants.
- Keep preview examples realistic and concise.
- Include common states such as default, disabled, error, loading, and empty when they matter.

## Preview app guidance

- Use the preview app as the primary manual verification surface.
- Make it easy to browse by category and inspect one component at a time.
- Support light and dark theme previews.
- Keep routing and navigation driven by the shared component catalog.

## Publishing guidance

- Publish the library as a Maven artifact using semantic versioning.
- Do not expose preview-only helpers in the public library API.
- Treat release-facing APIs as stable unless there is a deliberate breaking change.

## Claude behavior

- Reuse existing catalog and component patterns instead of inventing new ones.
- Prefer maintainable structure over clever shortcuts.
- Keep changes focused on the component repository goal.
