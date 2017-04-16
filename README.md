# internal-entity-access-from-java-sample
Sample source codes for how Java can see internal accessor of Kotlin code

ref: https://github.com/hotchemi/PermissionsDispatcher/issues/171#issuecomment-294333634

```A.kt
// this is in `app` module

class A {
  internal fun test() {}
}
```

AndroidStudio/IntelliJ can see `A.test$production_sources_for_module_app` if Java files are in same (`app`) module, but java compiler cannot find it. 
