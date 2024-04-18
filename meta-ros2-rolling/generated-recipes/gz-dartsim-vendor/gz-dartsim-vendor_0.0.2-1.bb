# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Vendor package for the DART physics engine v6.13.2"
AUTHOR = "Addisu Taddese <addisu@intrinsic.ai>"
ROS_AUTHOR = "Addisu Taddese <addisu@intrinsic.ai>"
HOMEPAGE = "https://dartsim.github.io/"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0 & BSD-2"
LICENSE = "Apache-2.0 & BSD-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=f12ef8c0445c08084ae92cf2dcb7ee92"

ROS_CN = "gz_dartsim_vendor"
ROS_BPN = "gz_dartsim_vendor"

ROS_BUILD_DEPENDS = " \
    assimp \
    boost \
    bullet \
    fcl \
    fmt \
    libccd \
    libeigen \
    libtinyxml2 \
    lz4 \
    ode \
    urdfdom \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    ament-cmake-vendor-package-native \
"

ROS_EXPORT_DEPENDS = " \
    assimp \
    boost \
    bullet \
    fcl \
    fmt \
    libccd \
    libeigen \
    libtinyxml2 \
    lz4 \
    ode \
    urdfdom \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    assimp \
    boost \
    bullet \
    fcl \
    fmt \
    libccd \
    libeigen \
    libtinyxml2 \
    lz4 \
    ode \
    urdfdom \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-xmllint \
    ament-lint-auto \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/gz_dartsim_vendor-release/archive/release/rolling/gz_dartsim_vendor/0.0.2-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/gz_dartsim_vendor"
SRC_URI = "git://github.com/ros2-gbp/gz_dartsim_vendor-release;${ROS_BRANCH};protocol=https"
SRCREV = "15ca4936ffc225c4069d9563ca41b821a1a70806"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
