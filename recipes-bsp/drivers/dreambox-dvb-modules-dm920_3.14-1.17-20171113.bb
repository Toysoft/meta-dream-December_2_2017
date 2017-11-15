KV = "3.14-1.17"
DRIVERDATE = "20171113"

require dreambox-dvb-modules-new.inc

PR = "${INC_PR}.0"

SRC_URI[dm920.md5sum] = "c94d63a881596265b0070bce69aa5373"
SRC_URI[dm920.sha256sum] = "a434f4546d797b623b8564a84d1ac0df52e3b125af7c61d081806b8e4a1a2654"

COMPATIBLE_MACHINE = "dm920"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm920.md5sum', True)}"
