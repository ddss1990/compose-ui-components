# ComposeLib

A Compose component repository for building a reusable UI library with:

- a publishable Compose library;
- an Android demo app for local preview and validation;
- a future web preview site;
- a shared catalog for component categories and metadata.

## Current status

The repository has its design and collaboration rules in place and is being shaped into a modular component repo.
The current focus is to establish clear module boundaries and a component catalog before adding concrete component implementations.

## Goals

1. **Component reuse**
   - Publish components for other repositories to consume through Maven or similar tooling.
   - Provide both base components and higher-level composite components.

2. **Online preview**
   - Use an Android demo app to preview all components.
   - Add a web preview page later.

3. **Consistent classification**
   - Group components by usage scenario.
   - Reuse the same categories in the demo app, web preview, and documentation.

## Planned modules

| Module | Purpose |
|---|---|
| `ui-components` | Publishable Compose component library |
| `preview-app` | Android preview and validation app |
| `component-registry` | Component catalog and metadata |
| `preview-web` | Browser-based preview site |

## Instruction files

Each module keeps collaboration instructions in:

- `CLAUDE.md`
- `AGENTS.md`

The root files define project-level conventions, and module files define module-level conventions.

## Development principles

- Keep component implementation separate from preview presentation.
- Treat the component catalog as the single source of truth.
- Keep publishable code only in publishable modules.
- Keep preview, documentation, and catalog metadata in sync.
- Do not auto-commit changes; commits are left to the user.

## Next steps

The repository will move forward in this order:

1. Set up the multi-module project skeleton;
2. Add the publishable Compose library module;
3. Add the Android preview app;
4. Fill in the component catalog and categories;
5. Add the web preview site.

