# INSPIRED BY RESION.IO

inherit kernel

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " \
	file://0006-overlays-Add-Hyperpixel4-overlays.patch \
"
