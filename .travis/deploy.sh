#!/usr/bin/env bash

mvn clean deploy --settings .travis/settings.xml -Prelease-profile,generate-ws-stubs -DskipTests=true -B -U