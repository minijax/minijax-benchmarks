#!/bin/bash
#find . -name *.jar -size +100k | xargs ls --size --block-size=1 | sed -En 's_(\d+) \./minijax-benchmark-([a-z-]+)/_\2,\1_p'
find . -name *.jar -size +100k | xargs ls --size --block-size=1 | sed -En "s_\s*([0-9]+) \./minijax-benchmark-([a-z-]+)/.+_\2,\1_p"

