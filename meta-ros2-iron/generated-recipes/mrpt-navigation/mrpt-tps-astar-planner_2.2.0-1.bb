# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_iron
inherit ros_superflore_generated

DESCRIPTION = "ROS Path Planner with A* in TP-Space Engine"
AUTHOR = "Jose-Luis Blanco-Claraco <jlblanco@ual.es>"
ROS_AUTHOR = "Shravan_S_Rai <shravansomashekara.rai@gmail.com>"
HOMEPAGE = "https://github.com/mrpt-ros-pkg/mrpt_navigation"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "mrpt_navigation"
ROS_BPN = "mrpt_tps_astar_planner"

ROS_BUILD_DEPENDS = " \
    ament-cmake-lint-cmake \
    ament-cmake-xmllint \
    ament-lint-auto \
    mrpt-libgui \
    mrpt-libmaps \
    mrpt-libnav \
    mrpt-libros-bridge \
    mrpt-msgs \
    mrpt-nav-interfaces \
    mrpt-path-planning \
    nav-msgs \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ament-cmake-lint-cmake \
    ament-cmake-xmllint \
    ament-lint-auto \
    mrpt-libgui \
    mrpt-libmaps \
    mrpt-libnav \
    mrpt-libros-bridge \
    mrpt-msgs \
    mrpt-nav-interfaces \
    mrpt-path-planning \
    nav-msgs \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-cmake-lint-cmake \
    ament-cmake-xmllint \
    ament-lint-auto \
    mrpt-libgui \
    mrpt-libmaps \
    mrpt-libnav \
    mrpt-libros-bridge \
    mrpt-msgs \
    mrpt-nav-interfaces \
    mrpt-path-planning \
    nav-msgs \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/mrpt_navigation-release/archive/release/iron/mrpt_tps_astar_planner/2.2.0-1.tar.gz
ROS_BRANCH ?= "branch=release/iron/mrpt_tps_astar_planner"
SRC_URI = "git://github.com/ros2-gbp/mrpt_navigation-release;${ROS_BRANCH};protocol=https"
SRCREV = "3329232210b2edd72605e5d4ab4e74eb836773ca"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}