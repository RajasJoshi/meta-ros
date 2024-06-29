# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Package to communicate DJI OSDK with Aerostack2 framework"
AUTHOR = "CVAR-UPM <cvar.upm3@gmail.com>"
ROS_AUTHOR = "Rafael Perez-Segui <r.psegui@upm.es>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=4633480cdd27d7906aaf3ef4b72014b2"

ROS_CN = "as2_platform_dji_osdk"
ROS_BPN = "as2_platform_dji_osdk"

ROS_BUILD_DEPENDS = " \
    ament-cmake \
    ament-index-cpp \
    as2-core \
    as2-msgs \
    geometry-msgs \
    libusb1 \
    nav-msgs \
    rclcpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ament-cmake \
    ament-index-cpp \
    as2-core \
    as2-msgs \
    geometry-msgs \
    libusb1 \
    nav-msgs \
    rclcpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-cmake \
    ament-index-cpp \
    as2-core \
    as2-msgs \
    geometry-msgs \
    libusb1 \
    nav-msgs \
    rclcpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/as2_platform_dji_osdk-release/archive/release/humble/as2_platform_dji_osdk/1.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/as2_platform_dji_osdk"
SRC_URI = "git://github.com/ros2-gbp/as2_platform_dji_osdk-release;${ROS_BRANCH};protocol=https"
SRCREV = "673f3f097533897b89182b9660bea929992f838b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}