# OpenAI Codex Developer Guide & KT Bridge — AOL Mail Backup Tool

This file is the dedicated configuration and instruction entrypoint for **OpenAI Codex CLI** when executing tasks in **AOL Mail Backup Tool**.

---

## 🧭 Single Source of Truth (SSOT) Architecture

This repository strictly enforces a **Single Source of Truth** pattern. You MUST NOT introduce conflicting rules, alternative configuration schemas, or duplicate documentation.

The authoritative Single Source of Truth for all architectural decisions, rulebooks, and operational constraints is:
➡️ **[`AGENTS.md`](file://./AGENTS.md)** (Universal operational constraints)
➡️ **[`GEMINI.md`](file://./GEMINI.md)** (Local repository architecture, entrypoints, and build commands)
➡️ **[`Master Rulebook Hub`](file:///Users/akashsahu.blue/Documents/Akas/software-selling-platform/docs/rules/README.md)** (Central system SSOT)

---

## 🏗️ Technology Stack & Verified Commands

* **Technology:** Java 21 / Maven (JavaFX & MaterialFX / FlatLaf)
* **Compile / Build:** `mvn clean compile`
* **Run Application:** `mvn javafx:run`
* **Execute Tests:** `mvn test`
* **Package Fat Release:** `mvn package` (dependency-reviewed shaded JAR; no fixed size cap)

---

## ⚠️ Non-Negotiable Operational Constraints for Codex

When executing autonomous coding turns, Codex MUST strictly obey these rules:

1. **Universal Default Light Theme:**
   - ALL desktop tools MUST initialize with **FlatLaf Light** (`FlatLightLaf.setup()` / `FlatMacLightLaf`) as out-of-the-box default across Windows and macOS.
   - Dark mode may only exist as an optional secondary user toggle, NEVER as the default state.

2. **13 Desktop Packaging Gates:**
   - Follow the [central dependency-optimization policy](file:///Users/akashsahu.blue/Documents/Akas/software-selling-platform/docs/rules/packaging/desktop-packaging-master-rulebook.md#package-optimization-policy): no fixed package-size cap; exclude only proven-unused dependencies and preserve required runtime/native assets.
   - Never strip macOS native dylibs (`libglass.dylib`, `libsqlitejdbc.dylib`).
   - Trial conversion cap must be strictly **50 items per folder**.
   - Obfuscate release JAR via ProGuard.
   - Interactive tooltips must be implemented on all interactive components (`setToolTipText`).

3. **Mandatory Web KT Handover:**
   - When updating or adding features, write technical specifications directly to:
     `/Users/akashsahu.blue/Documents/Akas/software-selling-platform/products/aol-mail-backup-tool/transferred_from_tool_dev/`

4. **Obsidian Vault Boundary Protection:**
   - The user's Obsidian vault (`/Users/akashsahu.blue/Documents/Akas/Git Synched/Obsidian-Work/`) is private.
   - Codex has access to **EXACTLY TWO (2) FOLDERS** in the entire vault: `Antigravity/` and `Daily Notes/`.
   - NEVER touch or delete any files from other vault folders.

5. **Multi-Environment Path Adaptation:**
   - macOS: `/Users/akashsahu.blue/Documents/Akas/...`
   - Windows PC: `D:\Akas\...`
   - Parvez PC: `<PARVEZ_ROOT_PATH>\...`
   - Always prefer relative paths or dynamic workspace root resolution.
