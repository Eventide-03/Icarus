package io.github.eventide03.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import io.github.eventide03.components.Branding
import io.github.eventide03.components.Footer
import io.github.eventide03.components.Home
import io.github.eventide03.components.Mission
import io.github.eventide03.components.Proposal
import io.github.eventide03.components.RIVAL
import io.github.eventide03.components.Team
import io.github.eventide03.components.TopBar
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Style

@Page
@Composable
fun HomePage() {
    // Replace Script with Div containing inline JavaScript
    Div(attrs = {
        attr("id", "visibility-script")
        attr(
            "onload",
            """
            // Force all sections to be visible
            document.addEventListener('DOMContentLoaded', function() {
                // Wait a bit for rendering to complete
                setTimeout(function() {
                    // Force visibility on all sections
                    document.querySelectorAll('.section-animate, .section-animate-left, .section-animate-right').forEach(function(el) {
                        el.style.opacity = '1';
                        el.style.transform = 'none';
                        el.classList.add('section-visible');
                    });
                    
                    // Force background colors on sections
                    const sections = {
                        'home': '#132034',
                        'rival': '#1A1423',
                        'mission': '#1A1423',
                        'proposal': '#132034',
                        'team': '#132034',
                        'branding': '#1A1423'
                    };
                    
                    for (const [id, color] of Object.entries(sections)) {
                        const section = document.getElementById(id);
                        if (section) {
                            section.style.backgroundColor = color;
                            section.style.opacity = '1';
                            section.style.visibility = 'visible';
                        }
                    }
                }, 100);
            });
        """,
        )
    }) {
        // Empty div that runs the script
    }

    // Add aggressive CSS override
    Style {
        """
        /* Force everything to be visible */
        body, div, section, h1, h2, h3, p {
            opacity: 1 !important;
            visibility: visible !important;
        }
        
        /* Force section colors */
        #home { background-color: #132034 !important; }
        #rival { background-color: #1A1423 !important; }
        #mission { background-color: #1A1423 !important; }
        #proposal { background-color: #132034 !important; }
        #team { background-color: #132034 !important; }
        #branding { background-color: #1A1423 !important; }
        
        /* Disable all animations for now */
        .section-animate, .section-animate-left, .section-animate-right {
            opacity: 1 !important;
            transform: none !important;
            transition: none !important;
        }
        """
    }

    Column(Modifier.fillMaxSize()) {
        TopBar()
        Home()
        RIVAL()
        Proposal()
        Mission()
        Team()
        Branding()
        Footer()
    }
}
