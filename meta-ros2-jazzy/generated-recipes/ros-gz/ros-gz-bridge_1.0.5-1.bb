# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "Bridge communication between ROS and Gazebo Transport"
AUTHOR = "Aditya Pande <adityapande@intrinsic.ai>"
ROS_AUTHOR = "Shivesh Khaitan"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "ros_gz"
ROS_BPN = "ros_gz_bridge"

ROS_BUILD_DEPENDS = " \
    actuator-msgs \
    geometry-msgs \
    gps-msgs \
    gz-msgs-vendor \
    gz-transport-vendor \
    launch \
    launch-ros \
    nav-msgs \
    rclcpp \
    rclcpp-components \
    ros-gz-interfaces \
    rosgraph-msgs \
    sensor-msgs \
    std-msgs \
    tf2-msgs \
    trajectory-msgs \
    vision-msgs \
    yaml-cpp-vendor \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    ament-cmake-python-native \
    pkgconfig-native \
    rosidl-pycommon-native \
"

ROS_EXPORT_DEPENDS = " \
    actuator-msgs \
    geometry-msgs \
    gps-msgs \
    gz-msgs-vendor \
    gz-transport-vendor \
    launch \
    launch-ros \
    nav-msgs \
    rclcpp \
    rclcpp-components \
    ros-gz-interfaces \
    rosgraph-msgs \
    sensor-msgs \
    std-msgs \
    tf2-msgs \
    trajectory-msgs \
    vision-msgs \
    yaml-cpp-vendor \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actuator-msgs \
    geometry-msgs \
    gps-msgs \
    gz-msgs-vendor \
    gz-transport-vendor \
    launch \
    launch-ros \
    nav-msgs \
    rclcpp \
    rclcpp-components \
    ros-gz-interfaces \
    rosgraph-msgs \
    sensor-msgs \
    std-msgs \
    tf2-msgs \
    trajectory-msgs \
    vision-msgs \
    yaml-cpp-vendor \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    launch-ros \
    launch-testing \
    launch-testing-ament-cmake \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/ros_ign-release/archive/release/jazzy/ros_gz_bridge/1.0.5-1.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/ros_gz_bridge"
SRC_URI = "git://github.com/ros2-gbp/ros_ign-release;${ROS_BRANCH};protocol=https"
SRCREV = "60cb742def076db79571f14f8dd89c3d32a99108"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
