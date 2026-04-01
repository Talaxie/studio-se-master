# Studio-se-master
http://www.deilink.fr

![alt text](https://www.deilink.fr/image/talaxie_logo.jpg "Talaxie")

> Content

Master mono-repository with full Talaxie Studio open source content.

Previous Talaxie Studio open source slave repositories are now merged in this git repo.

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

From the root of this repos, launch the maven command to build all Studio artifacts.

```
mvn clean install
```

The generated executable will then be found in several flavours:, one zip file and one unzip folder ready to be executed.
* zip or tar.gz archive files, packaged for each platform. They may be found in *studio-se-master\build\talend.studio.tos.<XX>.product\target\products\*
* unzipped folders, ready to be executed. They can be found in *studio-se-master\build\talend.studio.tos.<XX>.product\target\products\org.talend.studio.tos.XX.product\<OS>\<ARCH>\*


If you want to only build one or any number of products you may use one or many of the following maven arguments :
```
-Dtos.bd=true
-Dtos.di=true
-Dtos.dq=true
-Dtos.esb=true
```

For tests only, there is also an all-in-one product, not suitable for production, which can be built with the following maven argument :
```
-Dtos.all.p2=true
```

## Java version

Java 21+ is required to build.

The build assumes you are using Java 21.

If you are using a Java 24+, the build may work by adding arguments `-Djdk.xml.maxGeneralEntitySizeLimit=0 -Djdk.xml.totalEntitySizeLimit=0` (you may need extra quotes on windows).


## Project Structure
All Talaxie Studio projects follow the same file structure:
```

  |_ main           Main Eclipse plugins and features
    |_ features
    |_ plugins
  |_ test           Eclipse plugins and features for unit tests.
      |_ features
      |_ plugins
  |_ i18n           Internationalization plugins and features.
      |_ features
      |_ plugins
```

## Download

You can download this product from the [Talaxie website](https://www.deilink.fr?qt-product_tos_download_new=0&utm_medium=communityext&utm_source=github&utm_campaign=tosbd).


## Usage and Documentation

Documentation is available on [Talaxie Help Center](https://deilink.fr/).

## Support

You can ask for help on our [Forum](http://www.deilink.fr/services/global-technical-support).


## Contributing

We welcome contributions of all kinds from anyone.

Contributions can be made by submitting pull requests, following the gitflow workflow.

All contributions and comments must be in English.

## License

Copyright (c) 2023-2024 Talaxie

Licensed under the Apache v2 and GPLv2 License
