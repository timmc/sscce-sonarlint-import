import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import kotlin.streams.toList

fun repro(): List<Path> {
    val home = Paths.get(System.getenv("HOME"))
    return Files.list(home).toList()
}
