KV = "3.14-1.17"
DRIVERDATE = "20170801"

require dreambox-dvb-modules-new.inc

PR = "${INC_PR}.0"

SRC_URI[dm900.md5sum] = "d357be4f2708db42b3c7815666c80833"
SRC_URI[dm900.sha256sum] = "5309a3b5f7d356cb038767d7c4c1e19f3cac6f3ccce38581639fb6c39f885139"

COMPATIBLE_MACHINE = "dm900"

DM_LOCALVERSION ="3.14-1.17-dm900"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm900.md5sum', True)}"
