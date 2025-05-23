# Judo Kata Memorizer

An Android application to help memorize the Judo Nage No Kata.

## Project Purpose

This application is designed to assist Judo practitioners in learning and recalling the sequences and techniques of the Nage No Kata. Initially, it will display the list of techniques. Future enhancements may include detailed technique descriptions, video links, and quizzing features.

## Getting Started

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/yourusername/yourrepositoryname.git # Replace with the actual repository URL
    cd judo-kata-memorizer 
    ```
2.  **Open in Android Studio:**
    *   Launch Android Studio.
    *   Select "Open an Existing Project".
    *   Navigate to the cloned project directory and select it.
3.  **Build the Project:**
    *   Android Studio should automatically sync the Gradle project. If not, trigger a sync manually (File > Sync Project with Gradle Files or the elephant icon with a sync arrow).
    *   Build the project (Build > Make Project or Ctrl+F9 / Cmd+F9).
4.  **Run the Application:**
    *   Select an emulator or connect a physical Android device.
    *   Run the app (Run > Run 'app' or Shift+F10 / Ctrl+R).

## Troubleshooting Run Configurations

If Android Studio does not automatically create a run configuration or cannot find the main activity to launch:

1.  **Go to "Run" > "Edit Configurations..."**: This will open the Run/Debug Configurations dialog.
2.  **Add a New Configuration**: Click the `+` (Add New Configuration) button in the top-left corner.
3.  **Select "Android App"**: From the list of templates.
4.  **Name the Configuration**: Enter a suitable name, e.g., "app" or "JudoKataMemorizer".
5.  **Select the Module**: In the "General" tab, choose the "JudoKataMemorizer.app" (or similarly named) module from the "Module" dropdown.
6.  **Set Launch Options**:
    *   Under "Launch Options", for the "Launch:" field, select "Default Activity". Android Studio should automatically detect `com.example.judokata.MainActivity`.
    *   If "Default Activity" does not work or `MainActivity` is not found, select "Specified Activity".
    *   For "Activity:", click the `...` button and search for `MainActivity`. Select `com.example.judokata.MainActivity` from the list.
7.  **Apply and Save**: Click "Apply" and then "OK" to save the configuration.

You should now be able to select this configuration from the dropdown next to the Run button (green play icon) and run the application.

## Current Features

*   Displays the complete list of 15 techniques of the Nage No Kata.
*   Shows the name and group (e.g., Te-waza, Koshi-waza) for each technique.

## Future Ideas
*   Detailed descriptions for each technique.
*   Image or video demonstrations.
*   Progress tracking.
*   Quiz mode.
