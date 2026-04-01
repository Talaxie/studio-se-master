#!/bin/sh
# mhelleboid
# 2009-07-08

SVN_FOLDER=${1:-"/home/scorreia/devel/svn_checkouts"}

plugins=$(find $SVN_FOLDER/*/trunk -maxdepth 3 -name "MANIFEST.MF" -exec grep Bundle-SymbolicName {} \; | cut -c 22- | cut -d ";" -f1 | sort | xargs)

features=$(find $SVN_FOLDER/*/trunk -maxdepth 3 -name "feature.xml" | grep -v branding | xargs)

for plugin in $plugins ; do
        echo "";
        echo "--------------"$plugin"-------------" ;
        grep -HRi "id=\"$plugin\"" $features | grep -v "<import";
done
