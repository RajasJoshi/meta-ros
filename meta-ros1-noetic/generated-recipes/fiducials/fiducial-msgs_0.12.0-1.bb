# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Package containing message definitions for fiducials"
AUTHOR = "Jim Vaughan <jimv@mrjim.com>"
ROS_AUTHOR = "Jim Vaughan <jimv@mrjim.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "fiducials"
ROS_BPN = "fiducial_msgs"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    message-generation \
    sensor-msgs \
    std-msgs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    sensor-msgs \
    std-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    sensor-msgs \
    std-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/UbiquityRobotics-release/fiducials-release/archive/release/noetic/fiducial_msgs/0.12.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/fiducial_msgs"
SRC_URI = "git://github.com/UbiquityRobotics-release/fiducials-release;${ROS_BRANCH};protocol=https"
SRCREV = "c7bb4b7824abe805fa871911a401af6804dc61fe"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}