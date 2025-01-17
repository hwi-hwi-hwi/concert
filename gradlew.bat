@echo off
set DIR=%~dp0
set GRADLE_HOME=%DIR%gradle
set PATH=%GRADLE_HOME%\bin;%PATH%

if exist "%DIR%gradle-wrapper.jar" (
    java -jar "%DIR%gradle-wrapper.jar" %*
) else (
    echo "Gradle wrapper not found. Please run 'gradle wrapper' to generate it."
    exit /b 1
)
