#!/usr/bin/env bash

mvn clean deploy --settings .travis/settings.xml -DskipTests=true -B -U
