# Studio-se-master
http://www.deilink.fr

![alt text](https://www.deilink.fr/image/talaxie_logo.jpg "Talaxie")

> Content

Master repos using gitslave for aggregating the full Talaxie Studio open source repositories

This folder is a GitSlave root folder.
It is a simple git repo but allows working with all Talaxie Studio open source repositories as slaves.

Install GitSlave
================
GitSlave is the tool you can use to perform multi-repo command, in order to use it to its full potential please
install :
* perl
* clone this repostitory locally if not already done.
* move the folder tools/gitslave-2.0.2 to you own user folders.
* Then you can make an alias to the main script called "gits" (use gits_for_mac if you are on a mac).

How to use it
-------------
The list of repositories handled by this gitslave repo can be found in the file .gitslave
All Gitslave command are available hre : http://gitslave.sourceforge.net/gits-man-page.html

if you want to dowload (clone) all slave studio repositories, use the command

        gits populate --with-ifpresent

should you want to download a set of slave repositories, use

         gits populate <name_of_the_repos1> <name_of_the_repos2>

No using Git slave
==================
You may setup all the git repositories manually.
The idea is to clone all the required repositories next to each other, including this one using the 'git clone' command.
You will find the list of repositories in root [.gitslave](../master/.gitslave) file for each branch.

Build The Open Source Studio
================
To build the Studio you may need to increase the java memory heap size used, therefor you need to setup a specific Maven environment variable with the following values assuming you have anought ram on you machine :)
here is how to do it on linux or mac
```
export MAVEN_OPTS='-Xmx8000m -XX:MaxPermSize=512m -XX:-UseConcMarkSweepGC'
```
on windows
```
set MAVEN_OPTS=-Xmx8000m -XX:MaxPermSize=512m -XX:-UseConcMarkSweepGC
```

All the following assumes that Maven is installed on you machine.
First if you have never built any Studio artifacts on your machine you need to build the parent pom.xml
so please do

```
cd talend.studio.parent.pom
mvn clean install
```

then go back to the root of this repos and launch the same maven command to build all Studio artifacts.

```
mvn clean install
```

The generated executable will then be found in 2 flavours, one zip file and one unzip folder ready to be executed.
* The zip file may be found in *studio-se-master\build\talend.studio.tos.di.product\target\products\*
* the unzipped ready to execute folder can be found in *studio-se-master\build\talend.studio.tos.XX.product\target\products\org.talend.studio.tos.XX.product\win32\win32\*


If you want to only build one or any number of products you may use one or many of the following maven arguments :
```
-Dtos.bd=true
-Dtos.di=true
-Dtos.dq=true
-Dtos.esb=true
```

## Support

You can ask for help on our [Forum](http://www.deilink.fr/services/global-technical-support).


## Contributing

We welcome contributions of all kinds from anyone.

Using the bug tracker [Talend bugtracker](http://jira.talendforge.org/) is the best channel for bug reports, feature requests and submitting pull requests.

Feel free to share your Talend components on [Talend Exchange](http://www.talendforge.org/exchange).

## Contributors

See the [CONTRIBUTORS.md](./CONTRIBUTORS.md) file for details.

## License

Copyright (c) 2023-2024 Talaxie

Licensed under the Apache v2 and GPLv2 License
