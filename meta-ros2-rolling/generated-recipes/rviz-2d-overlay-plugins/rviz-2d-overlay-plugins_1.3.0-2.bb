# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "RViz2 plugin for 2D overlays in the 3D view. Mainly a ROS2 port of the JSK overlay plugin         (https://github.com/jsk-ros-pkg/jsk_visualization)."
AUTHOR = "Team Spatzenhirn <team-spatzenhirn@uni-ulm.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=19a28aa894d84513b15cf3f44c437682"

ROS_CN = "rviz_2d_overlay_plugins"
ROS_BPN = "rviz_2d_overlay_plugins"

ROS_BUILD_DEPENDS = " \
    boost \
    rviz-2d-overlay-msgs \
    rviz-common \
    rviz-ogre-vendor \
    rviz-rendering \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    rviz-2d-overlay-msgs \
    rviz-common \
    rviz-ogre-vendor \
    rviz-rendering \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    rviz-2d-overlay-msgs \
    rviz-common \
    rviz-ogre-vendor \
    rviz-rendering \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rviz_2d_overlay_plugins-release/archive/release/rolling/rviz_2d_overlay_plugins/1.3.0-2.tar.gz
ROS_BRANCH ?= "branch=release/rolling/rviz_2d_overlay_plugins"
SRC_URI = "git://github.com/ros2-gbp/rviz_2d_overlay_plugins-release;${ROS_BRANCH};protocol=https"
SRCREV = "3b3590c19f305d919b9585c87115befcfb19e146"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}