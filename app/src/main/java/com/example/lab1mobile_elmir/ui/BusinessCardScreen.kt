package com.example.lab1mobile_elmir.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab1mobile_elmir.R

@Composable
fun BusinessCardScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(dimensionResource(id = R.dimen.padding_large)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxHeight()
        ) {

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = R.drawable.android_logo),
                    contentDescription = null,
                    modifier = Modifier.size(120.dp)
                )

                Text(
                    text = stringResource(id = R.string.name),
                    fontSize = dimensionResource(id = R.dimen.text_large).value.sp
                )

                Text(
                    text = stringResource(id = R.string.title),
                    fontSize = dimensionResource(id = R.dimen.text_medium).value.sp
                )

                Text(text = stringResource(id = R.string.group))
            }

            Column {
                Text(text = stringResource(id = R.string.phone))
                Text(text = stringResource(id = R.string.email))
            }
        }
    }
}