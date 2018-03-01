#!/bin/bash

PATH1=$1

mkdir -p src/main/scala/$PATH1
mkdir -p src/test/scala/$PATH1

mkdir -p src/test/resources/$PATH1
touch src/test/resources/$PATH1/test
touch src/test/resources/$PATH1/expected