@echo off
chcp 65001 >nul

cd /d %~dp0
javac -encoding UTF-8 QuanLyRapPhim.java Movie.java
javac -encoding UTF-8 QuanLyRapPhim.java


java -Dfile.encoding=UTF-8 QuanLyRapPhim

pause


