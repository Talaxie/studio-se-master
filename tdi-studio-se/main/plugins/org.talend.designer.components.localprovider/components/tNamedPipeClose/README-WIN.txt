Instructions for Windows (w32, x64):

To use this component in named-pipe mode on Windows follow these instruction:

*** PLEASE REFER TO tNamedPiptOutput DIRECTORY FOR THE FILES MENTIONED BELOW ****

The directory directory contains 2 DDLs: namedpipe_jni.dll, namedpipe_jni_64bit.dll.
The first of which is for 32bit system and second for 64bit.

You must ensure that the appropriate library is renamed to namedpipe_jni.dll and
placed on the Java library path. The easiest way to do this is to copy it into
the C:\WINDOWS folder.

When running on a 32-bit JVM:
	- place namedpipe_jni.dll in C:\WINDOWS.
	- OR specify JVM's -Djava.library.path="<PATH to namedpipe_jni.dll>"
When running on a 64-bit JVM: 
	- rename namedpipe_jni_64bit.dll to namedpipe_jni.dll and place into C:\WINDOWS
	- OR specify JVM's -Djava.library.path="<PATH to namedpipe_jni.dll>"
