FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

inherit upx_compress

SRC_URI_append_dm800 = " \
    file://e2_old_dvbapi.patch \
"

SRC_URI_append += "\
	file://use-ioctl-22-for-h265.patch \
	file://fix-fp-version.patch \
"

SRC_URI_append_dm8000 += " \
    file://fix-wrong-driver-date.patch \
"

SRC_URI_append_dm7080 += " \
    file://add-support-dm7080.patch \
"
