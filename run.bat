@echo off
IF "%ANT_HOME%" == "" GOTO NOANTHOME
:YESPATH
@ECHO The ANT_HOME environment variable was detected.
%ANT_HOME%\bin\ant test
GOTO END
:NOANTHOME
@ECHO The ANT_HOME environment variable was NOT detected.
GOTO END
:END
