fastlane documentation
----

# Installation

Make sure you have the latest version of the Xcode command line tools installed:

```sh
xcode-select --install
```

For _fastlane_ installation instructions, see [Installing _fastlane_](https://docs.fastlane.tools/#installing-fastlane)

# Available Actions

## Android

### android test

```sh
[bundle exec] fastlane android test
```

Runs all the tests

### android updateVersion

```sh
[bundle exec] fastlane android updateVersion
```

Update version

### android change_version_name

```sh
[bundle exec] fastlane android change_version_name
```

Change version name

### android get_version_code

```sh
[bundle exec] fastlane android get_version_code
```



### android get_version_name

```sh
[bundle exec] fastlane android get_version_name
```



### android increase_version_code

```sh
[bundle exec] fastlane android increase_version_code
```

increase_version_code

### android sync_gradle

```sh
[bundle exec] fastlane android sync_gradle
```

Sync project with gradle files

### android buildApkDevDebug

```sh
[bundle exec] fastlane android buildApkDevDebug
```

BuildApk devDebug

### android buildApkDevRelease

```sh
[bundle exec] fastlane android buildApkDevRelease
```

BuildApk devRelease

### android buildApkStagingDebug

```sh
[bundle exec] fastlane android buildApkStagingDebug
```

BuildApk stagingDebug

### android buildApkStagingRelease

```sh
[bundle exec] fastlane android buildApkStagingRelease
```

BuildApk stagingRelease

### android buildApkProductDebug

```sh
[bundle exec] fastlane android buildApkProductDebug
```

BuildApk productDebug

### android buildApkProductRelease

```sh
[bundle exec] fastlane android buildApkProductRelease
```

BuildApk productRelease

### android buildAppStoreApk

```sh
[bundle exec] fastlane android buildAppStoreApk
```

Build AppRelease

----

This README.md is auto-generated and will be re-generated every time [_fastlane_](https://fastlane.tools) is run.

More information about _fastlane_ can be found on [fastlane.tools](https://fastlane.tools).

The documentation of _fastlane_ can be found on [docs.fastlane.tools](https://docs.fastlane.tools).
