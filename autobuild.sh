#!/bin/bash

watch --interval=100 "find . -name *~ -exec rm {} \; && ant build"
