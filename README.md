Darklaf- Extension

Several extensions for the [Darklaf Look and Feel](https://www.github.com/weisj/darklaf).

# Kotlin
Extension functions for easier component configuration in Kotlin.
e.g.
````java
button.putClientProperty(DarkButtonUI.KEY_VARAIANT, DarkButtonUI.VARIANT_BORDERLESS);
````
becomes
````kotlin
button.variant = ButtonVariant.BORDERLESS
````

### Usage
````xml
<dependency>
  <groupId>com.github.weisj</groupId>
  <artifactId>darklaf-extension-kotlin</artifactId>
  <version>0.2.0</version>
</dependency>
````
````kotlin
implementation("com.github.weisj:darklaf-extensions-kotlin:0.1.0")
````

# RSyntaxArea
Provides themes for `RSyntaxTextArea`s matching Darklaf themes.

### Usage
````xml
<dependency>
  <groupId>com.github.weisj</groupId>
  <artifactId>darklaf-extension-rsyntaxarea</artifactId>
  <version>0.2.0</version>
</dependency>
````
````kotlin
implementation("com.github.weisj:darklaf-extensions-rsyntaxarea:0.1.0")
````
