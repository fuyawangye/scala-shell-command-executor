#!/bin/sh
exec scala "$0" "$@"
!#

import sys.process._

val stdout = new StringBuilder
val stderr = new StringBuilder
val status = "dir" ! ProcessLogger(stdout append _, stderr append _)

println(status)
println("stdout: " + stdout)
