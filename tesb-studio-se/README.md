# Talaxie Open Studio for ESB


[![Visit Deilink's website](https://www.deilink.fr/image/talaxie_logo.jpg "Talaxie")](http://www.deilink.fr/)


This repository contains the source files for Talaxie Open Studio for ESB.


## Repository Structure

All Talaxie Studio repositories follow the same file structure:

```

  |_ main          Main Eclipse plugins and features
    |_ features
    |_ plugins
  |_ test          Eclipse plugins and features for unit tests.
      |_ features
      |_ plugins
  |_ i18n          Internationalization plugins and features.
      |_ features
      |_ plugins
```

## How to build projects

Follow the instructions at [Talaxie/studio-se-master](https://github.com/Talaxie/studio-se-master) and run the following from inside the `studio-se-master` repository.

```
mvn clean install \
    -Dtos.esb=true \
    -Dtos.bd=false \
    -Dtos.di=false \
    -Dtos.dq=false \
    -Dtos.mdm=false
```

## Download

You can download this product from the [Talaxie website](http://www.talend.com/download/talend-open-studio?qt-product_tos_download_new=3&utm_medium=communityext&utm_source=github&utm_campaign=tosesb).


## Usage and Documentation

Documentation is available on [Talaxie Help Center](http://help.talend.com/).


## Support

You can ask for help on our [Forum](http://www.talend.com/services/technical-support).


## Contributing

We welcome contributions of all kinds from anyone.

Using the [Talaxie bugtracker](http://jira.talendforge.org/) is the best channel for bug reports and feature requests. Use GitHub to submit pull requests.

Feel free to share your Talend components on [Talend Exchange](http://www.talendforge.org/exchange).

## License

Copyright (c) 2023-2024 Talaxie

Licensed under the Apache V2 License
