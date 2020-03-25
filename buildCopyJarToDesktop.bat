@echo off
call gradlew clean build
call mkdir %USERPROFILE%\desktop\gradle
call mkdir %USERPROFILE%\desktop\gradle\exe
for /r . %%i in (*application.jar) do call xcopy /q /a %%i %USERPROFILE%\desktop\gradle\exe /y
call gradlew clean
call gradlew --stop 