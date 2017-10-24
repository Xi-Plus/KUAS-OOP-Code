@echo off
if not exist %~n1.class (
	javac %1 -encoding utf8
)
java %~n1
pause
