package io.github.rishthewizard.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.modifiers.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun HeroSection() {
    Div(attrs = {
        classes("homePage")
    }) {
        Div(attrs = {
            classes("hero-container")
        }) {
            Div(attrs = {
                classes("mainText")
            }) {
                Div {
                    Text("Introducing Team:")
                }
                Div(attrs = {
                    classes("team")
                }) {
                    Text("M.A.A.D Bots")
                }
                Div(attrs = {
                    classes("subText")
                }) {
                    Text("A team of high school robotics students striving to pursue their interests.")
                }
                A(href = "#", attrs = {
                    classes("top-bar-button")
                }) {
                    Text("Donate")
                }
            }

            Img(src = "https://rishthewizard.github.io/Icarus/assets/madTesting.png", attrs = {
                attr("alt", "Logo")
                classes("hero-image")
            })
        }
    }
}
