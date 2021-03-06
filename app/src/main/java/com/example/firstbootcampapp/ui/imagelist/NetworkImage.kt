package com.example.firstbootcampapp.ui.imagelist

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.example.firstbootcampapp.R

@OptIn(ExperimentalCoilApi::class)
@Composable
fun NetworkImage(
    url: String,
    contentDesc: String?,
    modifier: Modifier
) {
    Box(modifier) {
        val painter = rememberImagePainter(
            data = url,
            builder = {
                placeholder(drawableResId = R.drawable.loading_image)
                crossfade(true)
            }
        )
        Image(
            painter = painter, contentDescription = contentDesc, contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
}