# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The cob_base_controller_utils package contains common utils for various base_controllers."
AUTHOR = "Felix Messmer <felixmessmer@gmail.com>"
ROS_AUTHOR = "Felix Messmer <felixmessmer@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "cob_control"
ROS_BPN = "cob_base_controller_utils"

ROS_BUILD_DEPENDS = " \
    controller-manager-msgs \
    diagnostic-msgs \
    geometry-msgs \
    message-generation \
    nav-msgs \
    roscpp \
    std-msgs \
    std-srvs \
    tf \
    tf2 \
    urdf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    controller-manager-msgs \
    diagnostic-msgs \
    geometry-msgs \
    message-runtime \
    nav-msgs \
    roscpp \
    std-msgs \
    std-srvs \
    tf \
    tf2 \
    urdf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    controller-manager-msgs \
    diagnostic-msgs \
    geometry-msgs \
    message-runtime \
    nav-msgs \
    roscpp \
    rospy \
    std-msgs \
    std-srvs \
    tf \
    tf2 \
    urdf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/4am-robotics/cob_control-release/archive/release/noetic/cob_base_controller_utils/0.8.23-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/cob_base_controller_utils"
SRC_URI = "git://github.com/4am-robotics/cob_control-release;${ROS_BRANCH};protocol=https"
SRCREV = "3a7e64c51230c7b462a063a8ead452702af59c05"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}