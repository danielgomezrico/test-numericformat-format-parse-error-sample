# Sample

This project is created to produce https://stackoverflow.com/questions/58140233/currency-numberformat-change-the-format-behaviour-after-calling-parse:

Check [MainActivity](https://github.com/danielgomezrico/test-numericformat-format-parse-error-sample/blob/master/app/src/main/java/com/test/MainActivity.kt):

```kotlin
val formatter = NumberFormat.getCurrencyInstance().apply {
    minimumFractionDigits = 0
    maximumFractionDigits = 0
}

Log.d("Format", formatter.format(123)) // $123
Log.d("Format", formatter.format(123.0)) // $123
Log.d("Format", formatter.parse("$123.0").toString()) // 123
Log.d("Format", formatter.format(123.0)) // $123.00
Log.d("Format", formatter.format(123.123)) // $123.12
```
