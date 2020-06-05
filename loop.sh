#!/bin/bash

while [ ! -f sleep.txt ]; do sleep 1 && echo 'not yet'; done

echo exists now
cat sleep.txt
