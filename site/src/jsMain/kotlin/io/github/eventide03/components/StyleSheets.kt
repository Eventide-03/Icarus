package io.github.eventide03.components

import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.opacity
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.init.registerStyleBase
import org.jetbrains.compose.web.css.*

@InitSilk
fun initStyleSheet(ctx: InitSilkContext) {
    ctx.stylesheet.registerStyleBase("body") {
        Modifier.styleModifier {
            property("transition", "all 400ms")
        }
    }

    // Add animation styles
    ctx.stylesheet.registerStyleBase(".top-bar-action") {
        Modifier.styleModifier {
            property("transition", "all 300ms")
        }
    }

    ctx.stylesheet.registerStyleBase(".top-bar-action:hover") {
        Modifier
            .opacity(0.8)
    }

    // Animation base classes
    // Base animation styles
    ctx.stylesheet.registerStyleBase(".animate-on-scroll") {
        Modifier.styleModifier {
            property("opacity", "0")
            property("transition", "opacity 0.8s ease-out, transform 0.8s ease-out")
        }
    }

    // Fade up animation (default)
    ctx.stylesheet.registerStyleBase(".animate-fade-up") {
        Modifier.styleModifier {
            property("transform", "translateY(30px)")
        }
    }

    // Fade right animation
    ctx.stylesheet.registerStyleBase(".animate-fade-right") {
        Modifier.styleModifier {
            property("transform", "translateX(-30px)")
        }
    }

    // Fade left animation
    ctx.stylesheet.registerStyleBase(".animate-fade-left") {
        Modifier.styleModifier {
            property("transform", "translateX(30px)")
        }
    }

    // Scale animation
    ctx.stylesheet.registerStyleBase(".animate-scale") {
        Modifier.styleModifier {
            property("transform", "scale(0.95)")
        }
    }

    // Active state for all animations
    ctx.stylesheet.registerStyleBase(".animate-visible") {
        Modifier.styleModifier {
            property("opacity", "1")
            property("transform", "translate(0, 0) scale(1)")
        }
    }

    // Staggered delays for list items
    for (i in 1..10) {
        ctx.stylesheet.registerStyleBase(".animate-delay-$i") {
            Modifier.styleModifier {
                property("transition-delay", "${i * 100}ms")
            }
        }
    }

    // Team member card hover effect
    ctx.stylesheet.registerStyleBase(".team-member-card") {
        Modifier.styleModifier {
            property("transition", "transform 0.3s ease, box-shadow 0.3s ease")
        }
    }

    ctx.stylesheet.registerStyleBase(".team-member-card:hover") {
        Modifier.styleModifier {
            property("transform", "translateY(-5px)")
            property("box-shadow", "0 10px 20px rgba(0, 0, 0, 0.2)")
        }
    }

    // Pulse animation for buttons
    ctx.stylesheet.registerStyleBase(".btn-pulse") {
        Modifier.styleModifier {
            property("animation", "pulse 1.5s infinite")
        }
    }
}
