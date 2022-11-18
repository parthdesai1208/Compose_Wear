package com.example.composewear.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.*
import com.example.composewear.theme.ComposeWearTheme
import com.example.composewear.utils.AllWatch
import com.example.composewear.view.uiComponents.ButtonCompose
import com.example.composewear.view.uiComponents.TextCompose

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WearApp()
        }
    }
}

@Composable
fun WearApp() {
    ComposeWearTheme {
        val listState = rememberScalingLazyListState()

        Scaffold(
            timeText = {
                //display time on top of the watch
                TimeText(modifier = Modifier.scrollAway(scrollState = listState))
            },
            vignette = {
                //to blur top & bottom edge of the watch
                Vignette(vignettePosition = VignettePosition.TopAndBottom)
            },
            positionIndicator = {
                //for displaying indicator on right side of the watch
                PositionIndicator(scalingLazyListState = listState)
            }
        ) {
            val contentModifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
            val iconModifier = Modifier
                .size(24.dp)
                .wrapContentSize(align = Alignment.Center)

            ScalingLazyColumn(
                modifier = Modifier.fillMaxSize(),
                autoCentering = AutoCenteringParams(itemIndex = 0), //for automatically display item in center while user scrolling
                state = listState
            ) {
                item { ButtonCompose(contentModifier,iconModifier) }
                item { TextCompose(contentModifier) }

            }
        }

    }
}

@AllWatch
@Composable
fun AllWatch() {
    WearApp()
}