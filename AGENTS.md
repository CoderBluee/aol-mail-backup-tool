# Universal Agent Instructions & Rules (Antigravity & OpenAI Codex)

> [!IMPORTANT]
> **MASTER SINGLE SOURCE OF TRUTH (SSOT):**
> Before executing ANY command, creating ANY file, or proposing ANY code edit, all autonomous agents (OpenAI Codex, Antigravity, Cursor, etc.) MUST read and strictly adhere to the developer guidelines, architectural blueprints, and operational constraints documented in:
> ➡️ **[`GEMINI.md`](file://./GEMINI.md)** (Local repository architecture, entrypoints, and build commands)
> ➡️ **[`Master Rulebook Hub`](file:///Users/akashsahu.blue/Documents/Akas/software-selling-platform/docs/rules/README.md)** (Consolidated system rules)
> ➡️ **[`Desktop Packaging Master Rulebook`](file:///Users/akashsahu.blue/Documents/Akas/software-selling-platform/docs/rules/packaging/desktop-packaging-master-rulebook.md)** (13 pre-packaging gates)

---

## 1. 🧭 Master Topic & SSOT Router

| Domain | Authoritative SSOT Location | What It Governs |
|---|---|---|
| **Local Tool Architecture** | [`GEMINI.md`](file://./GEMINI.md) | Entrypoints, component hierarchy, file structure, and build targets. |
| **Desktop Packaging SSOT** | [`docs/rules/packaging/desktop-packaging-master-rulebook.md`](file:///Users/akashsahu.blue/Documents/Akas/software-selling-platform/docs/rules/packaging/desktop-packaging-master-rulebook.md) | 13 pre-packaging gates (FlatLaf Light, Section 508 keyboard, dependency-optimized packages without a fixed size cap, 9 macOS dylibs, Inno Setup EXE / Install4j DMG). |
| **Desktop Coding Checklist** | [`docs/rules/engineering/desktop-development-checklist.md`](file:///Users/akashsahu.blue/Documents/Akas/software-selling-platform/docs/rules/engineering/desktop-development-checklist.md) | Actionable 6-phase checklist: Light theme, 100% tooltips, Section 508 keyboard, streaming I/O, trial limits, fat JAR gate. |
| **Developer KT Handover** | [`docs/rules/engineering/dev-kt-handover-rulebook.md`](file:///Users/akashsahu.blue/Documents/Akas/software-selling-platform/docs/rules/engineering/dev-kt-handover-rulebook.md) | Mandatory 6-panel technical breakdown and KT markdown skeleton for tool developers. |
| **Desktop Activation Engine** | [`docs/rules/packaging/desktop-activation-engine-master-kt.md`](file:///Users/akashsahu.blue/Documents/Akas/software-selling-platform/docs/rules/packaging/desktop-activation-engine-master-kt.md) | Modulo-17 checksums, product licensing keys, and unified activation engine (`LicenseManager.java`). |
| **Screenshots Standard** | [`docs/rules/product/product-screenshot-master-rulebook.md`](file:///Users/akashsahu.blue/Documents/Akas/software-selling-platform/docs/rules/product/product-screenshot-master-rulebook.md) | 7 Non-negotiable gates: Light theme, exact branding, real extensions, 50 items cap, WebP <100KB. |

---

## 2. 📦 Mandatory 13 Pre-Packaging Gates (Before Building JAR / EXE / DMG)

All agents and developers MUST verify that all 13 gates are met before packaging:
1. **Universal Default Light Theme:** ALL desktop tools MUST initialize with **FlatLaf Light** (`FlatLightLaf.setup()` / `FlatMacLightLaf`) as out-of-the-box default across Windows and macOS. Dark mode may only exist as an optional secondary user toggle, NEVER as the default state.
2. **100% Keyboard Operability:** The entire conversion flow must be executable mouse-free using `Tab`/`Shift+Tab` focus cycles, `Enter`/`Space`, and arrow keys (Section 508 accessibility standard).
3. **Package Optimization:** Follow the [central dependency-optimization policy](file:///Users/akashsahu.blue/Documents/Akas/software-selling-platform/docs/rules/packaging/desktop-packaging-master-rulebook.md#package-optimization-policy): no fixed package-size cap; exclude only proven-unused dependencies and preserve required runtime/native assets.
4. **Java JAR Obfuscation (ProGuard):** Release JAR MUST be obfuscated to prevent reverse-engineering and protect IP (`proguard.conf`).
5. **Demo Conversion Limit:** Unregistered/trial mode must strictly enforce conversion caps (strictly **50 items per folder**) with visible upgrade CTA.
6. **License Activation Check:** Verify activation works across all tiers (Personal, Admin, Enterprise), hardware fingerprinting, and offline/online modes.
7. **Mandatory Build Timestamp Stamping:** Stamp build date, timestamp, and version into `META-INF/MANIFEST.MF` (`Build-Timestamp`, `Implementation-Version`).
8. **Zero Hardcoded Modern App / Auth JSON:** Modern Auth / OAuth 2.0 client IDs must NEVER be hardcoded inside source files or bundled in fat JAR. Fetch dynamically over HTTPS at application runtime (`https://download.prismmigration.com/Modern%20Auth%20JSONs/`).
9. **Embedded 64-bit JRE:** Windows `.exe` installer must embed 64-bit OpenJDK JRE 17/21 (required runtime preserved; no fixed installer-size cap).
10. **macOS DMG Packaging & Apple Notarization:** Install4j project preserved in Obsidian vault (`Obsidian-Work/Package Maker/Install4j/`). DMGs signed with Developer ID and notarized to `~/Downloads/dmg/`.
11. **Mandatory Interactive Tooltip Implementation:** ALL interactive desktop controls (buttons, input fields, checkboxes, combo boxes, filter tabs, table column headers) MUST implement clear, helpful tooltips (`setToolTipText(...)`).
12. **Mandatory macOS Native Dylib Preservation Gate:** In `pom.xml`, excluding `*.dylib` or macOS SQLite binaries is **STRICTLY PROHIBITED**. Shaded JAR must bundle all 9 macOS native dylibs (JavaFX Glass toolkit + SQLite).
13. **Central Master SSOT:** Never create duplicate local packaging rules; always reference `docs/rules/`.

---

## 3. 📋 Mandatory Web Platform & KT Synchronization Rule

Whenever working on this desktop tool, all Knowledge Transfer (KT) documents, panel-by-panel feature breakdowns, and architecture updates **MUST ALWAYS be written directly into the product's `transferred_from_tool_dev` folder**:
* **Target Product Directory:** `/Users/akashsahu.blue/Documents/Akas/software-selling-platform/products/aol-mail-backup-tool/`
* **Target KT File Path:** `/Users/akashsahu.blue/Documents/Akas/software-selling-platform/products/aol-mail-backup-tool/transferred_from_tool_dev/KT_AOL_MAIL_BACKUP_TOOL.md`
* **Zero Local Duplication:** Never create duplicate markdown user guides or feature docs inside the desktop code directory.

---

## 4. 🔒 Obsidian Vault Boundary & Protection Rules (STRICT SSOT)

The user's Obsidian vault (`/Users/akashsahu.blue/Documents/Akas/Git Synched/Obsidian-Work/`) is a private knowledge base. All agents MUST strictly enforce these boundaries:
* **Strict 2-Folder Limit:** Access is strictly limited to `Antigravity/` and `Daily Notes/` ONLY when explicitly requested.
* **Strictly Forbidden Folders (NEVER TOUCH):** `Prism Migration/`, `Software Selling Site/Accounts/`, `DataBases/`, `Keys/`, `Parvez/`, `Tasks/`, etc.
* **Absolute Zero-Deletion Rule:** Never execute `rm`, `git rm`, or `unlink` on ANY file inside `Obsidian-Work`.

---

## 5. 🛠️ Technology Stack & Quick Commands

* **Tech Stack:** Java 21 / Maven (JavaFX & MaterialFX / FlatLaf)
* **Build Command:** `mvn clean compile`
* **Run Command:** `mvn javafx:run`
* **Test Command:** `mvn test`
* **Packaging Command:** `mvn package` (dependency-reviewed shaded JAR; no fixed size cap)
