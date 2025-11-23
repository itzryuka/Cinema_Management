@echo off
REM set code page to UTF-8
chcp 65001 > nul

REM change to directory of this script
cd /d "%~dp0"

REM run Java app
java -Dfile.encoding=UTF-8 -jar CinemaApp.jar

pause
