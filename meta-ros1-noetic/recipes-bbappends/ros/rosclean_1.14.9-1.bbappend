# Copyright (c) 2019 LG Electronics, Inc.

FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"
SRC_URI += " \
    file://recognize-busybox-star.patch \
"
