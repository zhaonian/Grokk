package io.zluan.grokk

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import io.zluan.grokk.chat.ChatViewModel

@Composable
fun ChatScreen(viewModel: ChatViewModel = hiltViewModel()) {
    Scaffold(
        topBar = {
            CenterAlignedTopBar()
        },
        content = { innerPadding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
            ) {
                Text(
                    "Hello, world!",
                    modifier = Modifier
                        .align(Alignment.Center)
                        .systemBarsPadding()
                )
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CenterAlignedTopBar() {
    CenterAlignedTopAppBar(
        title = {
            Text(text = "Grok [Latest]", style = TextStyle(fontSize = 20.sp))
        },
        navigationIcon = {

        },
        actions = {

        }
    )
}
