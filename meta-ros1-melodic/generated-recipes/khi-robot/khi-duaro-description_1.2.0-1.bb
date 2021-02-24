# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The khi_duaro_description package"
AUTHOR = "matsui_hiro <matsui_hiro@khi.co.jp>"
ROS_AUTHOR = "matsui_hiro <matsui_hiro@khi.co.jp>"
HOMEPAGE = "http://ros.org/wiki/khi_robot"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "BSD & KHI CAD license (mesh data, see readme)"
LICENSE = "BSD & KHI-CAD-license-mesh-data,-see-readme-"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "khi_robot"
ROS_BPN = "khi_duaro_description"

ROS_BUILD_DEPENDS = " \
    roslaunch \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/Kawasaki-Robotics/khi_robot-release/archive/release/melodic/khi_duaro_description/1.2.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/khi_duaro_description"
SRC_URI = "git://github.com/Kawasaki-Robotics/khi_robot-release;${ROS_BRANCH};protocol=https"
SRCREV = "12d9e3f7dfb082fb7cada4c6bdf6c673e4046bf5"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
