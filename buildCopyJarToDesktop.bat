@echo off
call gradlew clean build
call mkdir %USERPROFILE%\desktop\gradle
call mkdir %USERPROFILE%\desktop\gradle\exe
call mkdir %USERPROFILE%\desktop\gradle\lib
call mkdir %USERPROFILE%\desktop\gradle\all
for /r . %%i in (*exec.jar) do call xcopy /q /a %%i %USERPROFILE%\desktop\gradle\exe /y
for /r . %%i in (*dev.jar) do call xcopy /q /a %%i %USERPROFILE%\desktop\gradle\lib /y
for /r . %%i in (*dev*.jar) do call xcopy /q /a %%i %USERPROFILE%\desktop\gradle\all /y
call gradlew clean