KV = "3.14-1.17"
DRIVERDATE = "20171031"

require dreambox-dvb-modules-new.inc

PR = "${INC_PR}.0"

SRC_URI[dm920.md5sum] = "7bab06e2714159f1d02c9fe573b35305"
SRC_URI[dm920.sha256sum] = "e99e131b78c5c004d06516b1088e0ac262e691be10a3cadcced85744a2c5ad3b"

COMPATIBLE_MACHINE = "dm920"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm920.md5sum', True)}"
