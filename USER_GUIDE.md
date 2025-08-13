# User Guide - Speech Disability Assistant

## Getting Started

### System Requirements
- Java JDK 8 or higher
- Windows, macOS, or Linux operating system
- Command line access (Terminal/Command Prompt)
- Minimum 50MB free disk space

### Installation Steps
1. Download or clone the repository
2. Ensure Java is installed: `java -version`
3. Navigate to the project directory
4. Compile: `javac SpeechDisabilityAssistant.java`
5. Run: `java SpeechDisabilityAssistant`

## Application Features

### 1. Speech-to-Text Converter 🎤

**Purpose:** Helps users with unclear speech convert their words into readable text.

**How to Use:**
1. Select option 1 from the main menu
2. Choose between:
   - **Speech Recognition:** Simulates real speech input
   - **Practice Mode:** Safe environment for speech therapy

**Features:**
- 3-second processing simulation
- Text cleanup and formatting
- Option to save converted text
- Pronunciation tips in practice mode

### 2. Text-to-Speech Player 🔊

**Purpose:** Allows users who cannot speak to communicate through text conversion.

**How to Use:**
1. Select option 2 from the main menu
2. Choose between:
   - **Custom Text:** Type any message
   - **Quick Phrases:** Select from 10 pre-made phrases

**Quick Phrases Available:**
- "Hello, how are you?"
- "Thank you very much."
- "Please help me."
- "I need assistance."
- "Can you repeat that?"
- "I understand."
- "I don't understand."
- "Excuse me."
- "I'm sorry."
- "Have a good day."

### 3. Quick Communication Templates 💬

**Purpose:** Instant access to common phrases organized by category.

**Categories:**
1. **Medical**
   - "I need medical help."
   - "I'm in pain."
   - "Call a doctor."
   - "Emergency!"

2. **Daily Needs**
   - "I'm hungry."
   - "I'm thirsty."
   - "I need to rest."
   - "Bathroom please."

3. **Social**
   - "Good morning!"
   - "How are you?"
   - "Nice to meet you."
   - "See you later."

4. **Work/School**
   - "I have a question."
   - "I need help."
   - "Thank you."
   - "I understand."

**How to Use:**
1. Select option 3 from the main menu
2. Choose a category (1-4)
3. Select a specific phrase
4. The phrase will be "spoken" automatically

### 4. Conversation History 📝

**Purpose:** Review all previous interactions and conversations.

**Features:**
- Timestamps for all entries
- Search through past conversations
- View input and output for each interaction
- Automatic saving to log file

### 5. Data Management 🗑️

**Clear All Data:**
- Removes all conversation history from memory
- Requires confirmation ("yes" to proceed)
- Does not delete saved files on disk

### 6. Help System ❓

**Comprehensive help including:**
- Feature explanations
- Target user information
- Future enhancement possibilities
- Real-world integration options

## File Management

### Generated Files

**speech_assistance_log.txt**
- Complete conversation history
- Automatic timestamps
- All user interactions logged
- Persistent across sessions

**saved_speech_text.txt**
- User-selected saved text
- Optional saving during speech-to-text conversion
- Includes full timestamps
- Can be imported into other applications

### File Locations
All files are created in the same directory as the application.

## Accessibility Features

### Screen Reader Compatibility
- Text-only interface
- Clear navigation structure
- Descriptive labels and icons
- Consistent layout

### Keyboard Navigation
- Number-based menu selection
- Enter key confirmation
- No mouse required
- Simple input methods

### Visual Design
- High contrast text
- Clear section dividers
- Progress indicators
- Consistent formatting

## Troubleshooting

### Common Issues

**Program won't compile:**
- Check Java installation: `java -version`
- Ensure correct filename: `SpeechDisabilityAssistant.java`
- Check for typos in compilation command

**File not found errors:**
- Ensure you're in the correct directory
- Check file permissions
- Verify Java file exists

**Input not working:**
- Press Enter after each input
- Use numbers for menu selection
- Type "yes" or "no" for confirmations

**Features not responding:**
- Follow menu prompts exactly
- Use valid number selections
- Press Enter to continue when prompted

### Getting Help

If you encounter issues:
1. Check the help menu (option 6)
2. Review this user guide
3. Ensure Java is properly installed
4. Try recompiling the program
5. Contact support through GitHub issues

## Tips for Best Experience

### For Speech Therapy Users
- Use Practice Mode regularly
- Follow pronunciation tips
- Save successful conversions
- Review conversation history

### For Communication Assistance
- Customize quick phrases as needed
- Use templates for emergency situations
- Save frequently used text
- Practice with text-to-speech features

### For Caregivers
- Learn the menu structure
- Help users save important phrases
- Review conversation logs
- Assist with technical setup

## Future Features

This simulation lays the groundwork for:
- Real speech recognition integration
- Actual text-to-speech playback
- GUI interface development
- Mobile app versions
- Cloud synchronization
- Multi-language support

---

**Remember:** This application is designed to be a stepping stone toward full assistive technology. The simulation provides the framework for real-world speech processing integration.