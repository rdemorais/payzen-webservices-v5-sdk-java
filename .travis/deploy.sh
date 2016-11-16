#!/usr/bin/env bash

mvn clean deploy --settings .travis/settings.xml -Prelease-profile -DskipTests=true -B -U
