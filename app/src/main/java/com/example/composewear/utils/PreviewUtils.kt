package com.example.composewear.utils

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

const val WEAR_PREVIEW_DEVICE_WIDTH_DP = 300
const val WEAR_PREVIEW_DEVICE_HEIGHT_DP = 300

const val WEAR_PREVIEW_API_LEVEL = 26
const val WEAR_PREVIEW_UI_MODE = Configuration.UI_MODE_TYPE_WATCH
const val WEAR_PREVIEW_BACKGROUND_COLOR_BLACK: Long = 0x000000
const val WEAR_PREVIEW_SHOW_BACKGROUND = true

@Preview(
    widthDp = WEAR_PREVIEW_DEVICE_WIDTH_DP,
    heightDp = WEAR_PREVIEW_DEVICE_HEIGHT_DP,
    apiLevel = WEAR_PREVIEW_API_LEVEL,
    uiMode = WEAR_PREVIEW_UI_MODE,
    backgroundColor = WEAR_PREVIEW_BACKGROUND_COLOR_BLACK,
    showBackground = WEAR_PREVIEW_SHOW_BACKGROUND
)
annotation class CustomWatchPreview

@Preview(device = Devices.WEAR_OS_SMALL_ROUND, showSystemUi = true, showBackground = true)
annotation class RoundSmallWatch

@Preview(device = Devices.WEAR_OS_LARGE_ROUND, showSystemUi = true, showBackground = true)
annotation class RoundLargeWatch

@Preview(device = Devices.WEAR_OS_SQUARE, showSystemUi = true, showBackground = true)
annotation class SquareWatch

@Preview(device = Devices.WEAR_OS_RECT, showSystemUi = true, showBackground = true)
annotation class RectangleWatch

@CustomWatchPreview
@RoundSmallWatch
@RoundLargeWatch
@SquareWatch
@RectangleWatch
annotation class AllWatch

