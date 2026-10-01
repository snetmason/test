package com.snetmason.test.feature.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.snetmason.test.core.common.AppInfo
import com.snetmason.test.core.ui.theme.TestTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hello, Moos!")
        Text(text = "${AppInfo.NAME} ${AppInfo.VERSION_NAME} — develop-moos")
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    TestTheme {
        HomeScreen()
    }
}
