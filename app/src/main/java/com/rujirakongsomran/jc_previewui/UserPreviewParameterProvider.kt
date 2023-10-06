package com.rujirakongsomran.jc_previewui

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

class UserPreviewParameterProvider : PreviewParameterProvider<User> {
    override val values = sequenceOf(
        User("Arijura"),
        User("Barumon"),
        User("Bambam")
    )
}