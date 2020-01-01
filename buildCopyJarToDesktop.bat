echo off
gradlew clean build
mkdir %USERPROFILE%\desktop\gradle
mkdir %USERPROFILE%\desktop\gradle\exe
mkdir %USERPROFILE%\desktop\gradle\lib
mkdir %USERPROFILE%\desktop\gradle\all
for /r . %%i in (*exec.jar) do xcopy /q /a %%i %USERPROFILE%\desktop\gradle\exe /y
for /r . %%i in (*dev.jar) do xcopy /q /a %%i %USERPROFILE%\desktop\gradle\lib /y
for /r . %%i in (*dev*.jar) do xcopy /q /a %%i %USERPROFILE%\desktop\gradle\all /y
gradlew clean