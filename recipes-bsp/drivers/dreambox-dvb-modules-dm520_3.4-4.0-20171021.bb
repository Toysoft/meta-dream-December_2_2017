KV = "3.4-4.0"
DRIVERDATE = "20171021"

require dreambox-dvb-modules-new.inc

PR = "${INC_PR}.0"

SRC_URI[dm520.md5sum] = "a7f18c0c63db0c22d2d3396603b0d1b0"
SRC_URI[dm520.sha256sum] = "0663600523d859326997a2b1ccbd2938ae175c57b1ac9f2302ae82560a63f807"

COMPATIBLE_MACHINE = "dm520"

DM_LOCALVERSION ="3.4-4.0-dm520"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm520.md5sum', True)}"
