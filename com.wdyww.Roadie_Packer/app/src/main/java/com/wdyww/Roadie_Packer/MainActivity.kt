package com.wdyww.Roadie_Packer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.wdyww.Roadie_Packer.features.onboarding.OnboardingWelcomeScreen
import com.wdyww.Roadie_Packer.ui.theme.RoadiePackerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RoadiePackerTheme {
                OnboardingWelcomeScreen()
            }
        }
    }
}
