package org.example.multi_module_cmp

import org.example.multi_module_cmp.theme.AppTheme
import org.example.multi_module_cmp.theme.LocalThemeIsDark


import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlin_lib.KotlinLib
import multi_module_cmp.composeapp.generated.resources.*
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.resources.vectorResource

@Composable
internal fun App() = AppTheme {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .windowInsetsPadding(WindowInsets.safeDrawing)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        // Kotlin module
        val myModule = remember {  KotlinLib() }
        Text(
            text = "${myModule.libName} - ${myModule.version}",
            fontSize = 30.sp,
            fontFamily = FontFamily(Font(Res.font.IndieFlower_Regular)),
            color = Color.Green
        )

        Image(
            modifier = Modifier
                .size(250.dp)
                .padding(16.dp),
            imageVector = vectorResource(Res.drawable.ic_cyclone),
            colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onSurface),
            contentDescription = null
        )

    }
}