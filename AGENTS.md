# PlayerFX

## Project type

Eclipse JavaFX project — **not** Maven/Gradle. No build scripts, no CI, no tests.

## Requirements

- **Java 17** (compiler compliance set in `.settings/org.eclipse.jdt.core.prefs`)
- **JavaFX** libraries via Eclipse container (`org.eclipse.fx.ide.jdt.core.JAVAFX_CONTAINER`)
- Module-based: `src/module-info.java` declares module `FirstFx`

## Structure

```
src/
  module-info.java          # module FirstFx — requires javafx.*
  application/
    Main.java               # Application entrypoint (extends Application)
    Main.fxml               # UI layout (AnchorPane, currently empty)
    application.css          # Stylesheet
  poo.png                   # App icon
```

## Run

Open in Eclipse with JavaFX tooling installed. Run `Main.java` as a JavaFX Application.

## Notes

- Package `application` is opened to `javafx.fxml` and `javafx.graphics` in `module-info.java`
- `build.fxbuild` exists but is minimal — use Eclipse to build/run
- No tests, no formatter, no linter configured
