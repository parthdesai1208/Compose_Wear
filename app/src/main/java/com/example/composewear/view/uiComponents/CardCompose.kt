package com.example.composewear.view.uiComponents

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Message
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.AppCard
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.Text
import com.example.composewear.theme.ComposeWearTheme
import com.example.composewear.utils.AllWatch

@Composable
fun AppCardCompose(
    modifier: Modifier = Modifier,
    iconModifier: Modifier = Modifier
) {
    AppCard(
        onClick = { },
        appName = {
            Text(text = "Messages")
        },
        appImage = {
            Icon(
                imageVector = Icons.Rounded.Message,
                contentDescription = "triggers open message action",
                modifier = iconModifier
            )
        },
        time = { Text(text = "12m") },
        title = { Text(text = "John cena") },
        modifier = modifier
    ) {
        Text(text = "On my way")
        Text(text = "this is AppCard")
    }
}

@AllWatch
@Composable
fun AppCardComposePreview() {
    ComposeWearTheme {
        AppCardCompose(
            modifier = Modifier
                .fillMaxSize()
                .padding(all = 8.dp),
            iconModifier = Modifier
                .size(24.dp)
                .wrapContentSize(align = Alignment.Center)
        )
    }
}