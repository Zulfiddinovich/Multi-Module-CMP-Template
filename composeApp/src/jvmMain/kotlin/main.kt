import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.example.kotlin_lib.KotlinLib
import org.example.multi_module_cmp.App
import java.awt.Dimension

fun main() = application {
    Window(
        title = "Multi-Module-CMP",
        state = rememberWindowState(width = 800.dp, height = 600.dp),
        onCloseRequest = ::exitApplication,
    ) {
        window.minimumSize = Dimension(350, 600)
        App()

        // Kotlin module
        val myModule = remember {  KotlinLib() }
    }
}