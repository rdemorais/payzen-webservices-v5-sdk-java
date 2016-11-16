#!/usr/bin/env bash

gpg2 --list-keys
gpg2 --keyserver hkp://pool.sks-keyservers.net --send-keys a979a5f6682d6268
mvn clean deploy --settings .travis/settings.xml -Prelease-profile -DskipTests=true -B -U
