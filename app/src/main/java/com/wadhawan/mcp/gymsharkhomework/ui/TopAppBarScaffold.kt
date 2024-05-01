package com.wadhawan.mcp.gymsharkhomework.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.wadhawan.mcp.gymsharkhomework.ui.theme.TextStyles


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarScaffold(
    title: String,
    navController: NavController,
    content: @Composable () -> Unit
) {
    val topAppBarColors = TopAppBarDefaults.topAppBarColors(
        containerColor = MaterialTheme.colorScheme.tertiary,
        titleContentColor = MaterialTheme.colorScheme.onTertiary,
        actionIconContentColor = MaterialTheme.colorScheme.onPrimary,
        navigationIconContentColor = MaterialTheme.colorScheme.onPrimary
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        title,
                        style = TextStyles.appTitleLarge,
                    )
                },
                colors = topAppBarColors,
                navigationIcon = {
                    IconButton(
                        onClick = {
                            val canPop = navController.previousBackStackEntry != null
                            if (canPop) {
                                navController.popBackStack()
                            }
                        }
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                }
            )
        }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            content()
        }
    }
}
