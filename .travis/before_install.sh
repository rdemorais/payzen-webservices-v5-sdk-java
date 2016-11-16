#!/usr/bin/env bash

if [ "$TRAVIS_PULL_REQUEST" == "false" ]; then
    echo $GPG_SECRET_KEYS | base64 --decode | $GPG_EXECUTABLE --import
    echo $GPG_OWNERTRUST | base64 --decode | $GPG_EXECUTABLE --import-ownertrust
    $GPG_EXECUTABLE  --list-keys
    $GPG_EXECUTABLE  --keyserver hkp://pool.sks-keyservers.net --send-keys a979a5f6682d6268
fi
