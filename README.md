# 📸 SIP (simple image picker)

### Migration from [![Easy Image Picker](https://jitpack.io/v/vickyKDV/easyimagepicker.svg)](https://github.com/vickyKDV/EasyImagePicker)
[![Download](https://jitpack.io/v/vickyKDV/simple-image-picker.svg)](https://jitpack.io/#vickyKDV/simple-image-picker)
[![API](https://img.shields.io/badge/API-19%2B-brightgreen.svg?style=social)](https://android-arsenal.com/api?level=19)
![Language](https://img.shields.io/badge/language-Kotlin-orange.svg)
[![ktlint](https://img.shields.io/badge/code%20style-%E2%9D%A4-FF4081.svg)](https://ktlint.github.io/)
[![PRWelcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](https://github.com/vickykdv/simple-image-picker)
[![Open Source Love](https://badges.frapsoft.com/os/v1/open-source.svg?v=102)](https://opensource.org/licenses/Apache-2.0)


# 💻Usage


1. Gradle dependency:

   ```groovy
   allprojects {
      repositories {
              maven { url "https://jitpack.io" }
      }
   }
   ```

   **If you are yet to Migrate on AndroidX, Use support build artifact:**
   ```groovy
   implementation 'com.github.vickykdv:simple-image-picker:TAG'
    ```

# 🎨Simpe Usage

* Pick image using Gallery
  ```kotlin
  val launcherEIP = registerEIP {
  
    //get file path , Simple use with 1 lines code
    val file = File(it.path!!)

    //and load to image or send file to server
    binding.img.setImageURI(Uri.parse(file.absolutePath))
   }
  ```

* for show dialog
  ```kotlin
  view.setOnClickListener { view ->
            launcherEIP.launchDialog()
  }
  ```
  
* for galery only
  ```kotlin
  view.setOnClickListener { view ->
            launcherEIP.launchGalery()
  }
  ```

* for camera only  
   ```kotlin
  view.setOnClickListener { view ->
            launcherEIP.launchCamera()
  }  
   ```
  

* With crop config

  ```kotlin
  //Call before launch
  val config = EIPConfig(
    isCropAspectRatio = true,
    cropRatio = RATIO.WIDE
   )
  ```
  
* and add in launch contructor
  ```kotlin
   view.setOnClickListener { view ->
        launcherEIP.launchDialog(config)
   }
   ```


## 📃 Thx for library
* uCrop [https://github.com/Yalantis/uCrop](https://github.com/Yalantis/uCrop)
* Compressor [https://github.com/zetbaitsu/Compressor](https://github.com/zetbaitsu/Compressor)

### Let us know!
We'll be really happy if you sent us links to your projects where you use our component. Just send an email to **vickykdv@gmail.com** And do let us know if you have any questions or suggestion regarding the library.

## License

    Copyright 2019-2022, Vicky KDV

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

