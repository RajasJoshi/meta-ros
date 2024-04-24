# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "zstd_image_transport provides a plugin to image_transport for transparently sending images     encoded as zstd blobs"
AUTHOR = "Alejandro Hernandez Cordero <ahcorde@gmail.com>"
ROS_AUTHOR = "Alejandro Hernandez Cordero"
HOMEPAGE = "http://www.ros.org/wiki/image_transport_plugins"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "image_transport_plugins"
ROS_BPN = "zstd_image_transport"

ROS_BUILD_DEPENDS = " \
    image-transport \
    zlib \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    image-transport \
    zlib \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    image-transport \
    zlib \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/image_transport_plugins-release/archive/release/rolling/zstd_image_transport/4.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/zstd_image_transport"
SRC_URI = "git://github.com/ros2-gbp/image_transport_plugins-release;${ROS_BRANCH};protocol=https"
SRCREV = "11c1adc9a4156e64d7df061c91bdedd54a7e245d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}