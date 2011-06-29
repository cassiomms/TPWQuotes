#!/bin/bash

watch --interval=200 "find . -name *~ -exec rm {} \; && ant build"
