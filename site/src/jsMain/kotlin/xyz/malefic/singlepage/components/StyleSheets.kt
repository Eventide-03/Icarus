package xyz.malefic.singlepage.components

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Style

@Composable
fun IcarusTonicStyleSheet() {
    // Create a style element with the content of IcarusTonic.css
    Style {
        // CSS Variables
        """
        :root {
            --Neutral-Background: #252f41;
            --Neutral-Beige: #F5E5CC;
            --Brand-Primary: #D20041;
            --Neutral-D_Grey: #86BBD8;
        }
        
        /* Base styles */
        body {
            background-color: #132034;
            width: 100%;
            height: 1000px;
            display: block;
            margin: 0;
            font-family: "Trebuchet MS", sans-serif;
        }
        
        /* Top Bar styles */
        .top-bar {
            display: flex;
            gap: 40px;
            justify-content: center;
            align-items: center;
            width: 100%;
            height: 9.33%;
            flex-shrink: 0;
            position: fixed;
            top: 0;
            left: 0;
            right: 0;
            z-index: 1000;
            background: #252f41;
            box-shadow: 0px 4px 3px 1px rgba(0, 0, 0, 0.10);
        }
        
        .top-bar-button {
            display: inline-flex;
            justify-content: center;
            align-items: center;
            color: #F5E5CC;
            font-size: 16px;
            font-style: normal;
            font-weight: 500;
            line-height: 24px;
            font-feature-settings: 'salt' on, 'liga' off, 'clig' off;
            text-decoration: none;
            padding: 10px 20px;
            border-radius: 6px;
            background: #D20041;
        }
        
        .top-bar-button:hover {
            background: rgba(210, 0, 65, 0.8);
        }
        
        .top-bar-item {
            color: #F5E5CC;
            font-size: 16px;
            font-style: normal;
            font-weight: 400;
            line-height: 24px;
            text-decoration: none;
            padding: 10px 20px;
            border-radius: 10px;
            transition: background 0.3s;
        }
        
        .top-bar-item:hover {
            background: rgba(255, 255, 255, 0.1);
        }
        
        .top-bar-text {
            color: #D20041;
            font-size: 16px;
            font-style: normal;
            font-weight: 500;
            line-height: 20px;
            text-decoration: none;
            padding: 10px 20px;
            border-radius: 6px;
            transition: background 0.3s;
            text-align: center;
            font-feature-settings: 'salt' on, 'liga' off, 'clig' off;
        }
        
        .top-bar-text:hover {
            background: rgba(255, 255, 255, 0.1);
        }
        
        .top-bar-logo {
            height: 60px;
            background: #2a0505;
        }
        
        .spacer {
            height: 20px;
            width: 60px;
        }
        
        /* Home Page styles */
        .homePage {
            display: flex;
            flex-direction: column;
            justify-content: flex-start;
            align-items: flex-start;
            width: 100%;
            min-height: 700px;
            box-sizing: border-box;
            flex-shrink: 0;
            background-color: #132034;
            padding-top: 84px;
        }
        
        .hero-container {
            display: flex;
            align-items: center;
            justify-content: flex-start;
            width: 100%;
            box-sizing: border-box;
            padding-left: 96px;
            padding-right: 96px;
        }
        
        .mainText {
            color: #86BBD8;
            font-size: 64px;
            font-style: normal;
            font-weight: 600;
            line-height: 76px;
            padding-top: 190px;
            padding-left: 0;
            padding-right: 104px;
        }
        
        .team {
            color: #D20041;
            font-size: 64px;
            font-style: normal;
            font-weight: 600;
            line-height: 76px;
        }
        
        .subText {
            color: #F5E5CC;
            font-size: 16px;
            font-style: normal;
            font-weight: 400;
            line-height: 24px;
            margin-top: 16px;
        }
        
        .hero-image {
            padding-top: 210px;
            padding-left: 200px;
            max-width: 20%;
            height: auto;
        }
        
        /* RIVAL section styles */
        .RIVAL {
            display: flex;
            gap: 40px;
            justify-content: center;
            align-items: center;
            width: 100%;
            height: 270px;
            flex-shrink: 0;
            z-index: 1000;
            background: #d5ddec;
        }
        """
    }
}
