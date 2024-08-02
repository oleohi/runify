package com.example.core.presentation.designsystem.components

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.core.presentation.designsystem.RunifyTheme

@Composable
fun GradientBackground(
    modifier: Modifier = Modifier,
    hasToolbar: Boolean = true,
    content: @Composable ColumnScope.() -> Unit
) {

}

@Preview
@Composable
private fun GradientBackgroundPreview() {
    RunifyTheme {
        GradientBackground(
            modifier = Modifier.fillMaxSize()
        ) {

        }
    }
}