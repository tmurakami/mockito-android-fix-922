# mockito-android-fix-922

[![CircleCI](https://circleci.com/gh/tmurakami/dexopener.svg?style=shield)](https://circleci.com/gh/tmurakami/dexopener)
[![Release](https://jitpack.io/v/tmurakami/dexopener.svg)](https://jitpack.io/#tmurakami/dexopener)  
![Android](https://img.shields.io/badge/Android-2.2%2B-blue.svg)

The workaround for mockito/mockito#922.

## Installation

First, add the [JitPack](https://jitpack.io/) repository to your build.gradle.
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}
```

And then, add this library as 'androidTestCompile' dependency.
```
dependencies {
    androidTestCompile 'com.github.tmurakami:mockito-android-fix-922'
}
```
