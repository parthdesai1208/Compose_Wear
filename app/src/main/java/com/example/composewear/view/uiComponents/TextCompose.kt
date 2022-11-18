package com.example.composewear.view.uiComponents

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text
import com.example.composewear.R
import com.example.composewear.theme.ComposeWearTheme
import com.example.composewear.utils.AllWatch

@Composable
fun TextCompose(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        textAlign = TextAlign.Center,
        color = MaterialTheme.colors.primary,
        text = stringResource(R.string.device_shape)
    )
}

@AllWatch
@Composable
fun TextComposePreview() {
    ComposeWearTheme {
        TextCompose(
            modifier = Modifier.fillMaxSize().padding(all = 8.dp)
        )
    }
}