#!/usr/bin/env bash

mvn clean deploy --settings .travis/settings.xml -Prelease-profile -DskipTests=true -Dgenerate.ws.stubs=true  -B -U