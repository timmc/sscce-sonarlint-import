Repro case (http://sscce.org/) for a sonarlint bug.

1. Open in IntelliJ IDEA 2022.3 with Sonarlint 7.2.1.58118
2. Set module's language level to 8 or higher
3. Open `src/main/kotlin/SSCCE.kt`
4. Observe that `import kotlin.streams.toList` is marked with rule
   `kotlin:S1128` even though `toList` is used in the file, and removing it
   causes a compilation error.
