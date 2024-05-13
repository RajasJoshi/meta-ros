# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Unitree ros package"
AUTHOR = "Pedro Soares <pmbs.123@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=e4c74a520650d71beb18ceaa66a24c70"

ROS_CN = "unitree_ros"
ROS_BPN = "unitree_ros"

ROS_BUILD_DEPENDS = " \
    boost \
    geometry-msgs \
    nav-msgs \
    rclcpp \
    rosidl-default-generators \
    sensor-msgs \
    std-msgs \
    tf2 \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    nav-msgs \
    rclcpp \
    sensor-msgs \
    std-msgs \
    tf2 \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    nav-msgs \
    rclcpp \
    rosidl-default-runtime \
    sensor-msgs \
    std-msgs \
    tf2 \
    tf2-ros \
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

# matches with: https://github.com/ros2-gbp/unitree_ros-release/archive/release/humble/unitree_ros/1.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/unitree_ros"
SRC_URI = "git://github.com/ros2-gbp/unitree_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "3cc0329d23425fdb4fd0b06d7cd576d0647c0cd6"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}