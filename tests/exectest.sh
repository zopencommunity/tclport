#!/bin/sh

mydir=$(cd $(dirname $0) && echo $PWD)

export PATH="${mydir}/../tcl8.6.12/unix:$PATH"

tclsh exectest.tcl
