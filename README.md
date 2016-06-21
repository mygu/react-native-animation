#Animation React Native SDK
##Installation
```
Run npm install react-native-animation --save
```

###Android

**android/settings.gradle**
```
include ':react-native-animation'
project(':react-native-animation').projectDir = new File(settingsDir, '../node_modules/react-native-animation/android')
```
**android/app/build.gradle**
```
dependencies {
    ...
    compile project(':react-native-animation')
}
```
**MainActivity.java**

On top, where imports are:
```java
import com.animation.rnanimation.AnimationPackage;
```

Modify getPackages method
```java
 @Override
    protected List<ReactPackage> getPackages() {
        return Arrays.<ReactPackage>asList(
                new MainReactPackage(),
                new AnimationPackage()
        );
    }
```


##Usage

```
```