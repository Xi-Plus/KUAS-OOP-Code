@echo off
setlocal enableDelayedExpansion

if not exist %~n1.class (
	echo compile because %~n1.class is not found
	javac %~n1.java -encoding utf8
) else (
	for %%i in (%~n1.java) do (set javatime=%%~ti)
	for %%i in (%~n1.class) do (set classtime=%%~ti)
	echo java  = !javatime!
	echo class = !classtime!
	if !javatime! equ !classtime! (
		for /f "tokens=*" %%a in ('forfiles /m %~n1.java /c "cmd /c echo @fdate @ftime"') do (set javatime=%%a)
		for /f "tokens=*" %%a in ('forfiles /m %~n1.class /c "cmd /c echo @fdate @ftime"') do (set classtime=%%a)
		echo java  = !javatime!
		echo class = !classtime!
		if !javatime! gtr !classtime! (
			echo recompile because %~n1.java was changed
			javac %~n1.java -encoding utf8
		)
	) else (
		for /f %%i in ('dir /b /o:d %~n1.java %~n1.class') do set newfile=%%i
		if "!newfile!" == "%~n1.java" (
			echo recompile because %~n1.java was changed
			javac %~n1.java -encoding utf8
		)
	)
)
echo --------------------------------
java %~n1
pause
