# Speech Disability Assistant

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

A **Java-based assistive communication tool** designed to help people with speech disabilities communicate more effectively through simulated speech-to-text, text-to-speech, and quick communication features.

> **🎯 Purpose:** This application addresses real-world accessibility challenges faced by individuals with dysarthria, apraxia, stuttering, voice disorders, and post-stroke communication difficulties.

---

## ✨ **Features**

### 🎤 **Speech-to-Text Converter**
- Simulated speech recognition with realistic processing delays
- Practice mode for speech therapy exercises
- Text processing and formatting for improved readability
- Automatic conversation logging

### 🔊 **Text-to-Speech Player**
- Custom text input conversion to "speech"
- 10 pre-built quick phrases for common communication needs
- Realistic speech timing simulation with visual progress indicators
- Emergency and daily communication support

### 💬 **Quick Communication Templates**
- **4 Categories:** Medical, Daily Needs, Social, Work/School
- **16 Pre-programmed phrases** for instant communication
- One-click phrase selection and playback
- Perfect for urgent situations or routine conversations

### 📊 **Data Management & History**
- Automatic conversation history logging with timestamps
- File persistence across sessions
- User-controlled data clearing options
- Optional text saving functionality

---

## 🚀 **Quick Start**

### **Prerequisites**
- Java JDK 8 or higher
- Command line access (Terminal/Command Prompt)

### **Installation & Running**

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/speech-disability-assistant.git
   cd speech-disability-assistant
   ```

2. **Compile the program**
   ```bash
   javac SpeechDisabilityAssistant.java
   ```

3. **Run the application**
   ```bash
   java SpeechDisabilityAssistant
   ```

4. **Follow the on-screen menu** to explore features

---

## 📸 **Demo Screenshots**

### Welcome Screen
```
==============================================================
            SPEECH DISABILITY ASSISTANT                      
                                                              
    Helping people with speech challenges communicate        
                                                              
  Features:                                                   
  * Speech-to-Text Conversion                                
  * Text-to-Speech Playback                                  
  * Communication Templates                                  
  * Conversation History                                     
==============================================================
```

### Main Menu
```
==================================================
           MAIN MENU
==================================================
1. [MIC] Speech-to-Text Converter
2. [SPEAKER] Text-to-Speech Player
3. [CHAT] Quick Communication Templates
4. [NOTES] View Conversation History
5. [DELETE] Clear All Data
6. [HELP] Help & Instructions
7. [EXIT] Exit Application
==================================================
```

---

## 🛠️ **Technical Details**

### **Architecture**
- **Language:** Java 8+
- **Design Pattern:** Static method organization with clear separation of concerns
- **User Interface:** Console-based ASCII interface for maximum accessibility
- **File Operations:** FileWriter for persistent data storage
- **Error Handling:** Comprehensive try-catch blocks for robust operation

### **Code Quality Metrics**
- **Lines of Code:** ~500 lines
- **Methods:** 15 well-organized static methods
- **Documentation:** Comprehensive JavaDoc comments
- **Error Handling:** IOException management for all file operations

### **Generated Files**
The application creates the following output files:
- `speech_assistance_log.txt` - Complete conversation history with timestamps
- `saved_speech_text.txt` - User-approved saved text conversions

---

## 📂 **Project Structure**

```
speech-disability-assistant/
├── SpeechDisabilityAssistant.java    # Main source code
├── README.md                          # This file
├── LICENSE                            # MIT License
├── .gitignore                         # Git ignore rules
├── docs/
│   ├── USER_GUIDE.md                  # Detailed usage instructions
│   └── TECHNICAL_SPECS.md             # Technical documentation
├── samples/
│   ├── sample_conversation_log.txt    # Example output
│   └── sample_saved_text.txt          # Example saved text
└── screenshots/
    ├── welcome_screen.png             # Application screenshots
    ├── main_menu.png
    └── features_demo.png
```

---

## 🌟 **Future Enhancements**

### **Real-World Integration Opportunities**
- **Google Cloud Speech-to-Text API** for actual speech recognition
- **Microsoft Azure Cognitive Services** for text-to-speech
- **CMU Sphinx** for offline speech processing
- **Java Speech API (JSAPI)** integration

### **User Interface Improvements**
- GUI development with JavaFX or Swing
- Web-based interface using Spring Boot
- Mobile app development for Android/iOS
- Voice-controlled navigation for hands-free operation

### **Advanced Features**
- Multi-language support and translation
- Customizable phrase templates
- Cloud synchronization for cross-device access
- Integration with assistive devices

---

## 🎯 **Target Users**

This application is designed for individuals with:
- **Dysarthria** - unclear speech due to muscle weakness
- **Apraxia** - difficulty coordinating speech movements
- **Stuttering** and other fluency disorders
- **Voice disorders** affecting vocal communication
- **Post-stroke** communication difficulties
- **Speech therapy** patients and practitioners

---

## 🧪 **Testing**

### **Functional Testing Results**
- ✅ All menu navigation working correctly
- ✅ File operations (read/write) functioning properly
- ✅ Input validation and error handling operational
- ✅ Resource cleanup on application exit verified

### **User Experience Testing**
- ✅ Intuitive navigation flow confirmed
- ✅ Clear visual feedback provided
- ✅ Helpful error messages displayed
- ✅ Consistent interface design maintained

---

## 🤝 **Contributing**

We welcome contributions to improve accessibility and functionality! Please:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

---

## 📄 **License**

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## 🙏 **Acknowledgments**

- Inspired by real-world needs of the speech and language disorder community
- Thanks to accessibility advocates and assistive technology researchers
- Special recognition to open-source speech processing libraries

---

## 📞 **Contact & Support**

- **Project Repository:** [GitHub Link]
- **Issues & Bug Reports:** [GitHub Issues]
- **Feature Requests:** [GitHub Discussions]

---

**Made with ❤️ for accessibility and inclusive technology**
