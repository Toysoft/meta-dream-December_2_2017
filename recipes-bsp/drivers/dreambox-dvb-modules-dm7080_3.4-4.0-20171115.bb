KV = "3.4-4.0"
DRIVERDATE = "20171115"

require dreambox-dvb-modules-new.inc

PR = "${INC_PR}.0"

SRC_URI[dm7080.md5sum] = "c835a8d4b56a8b02f5af7cfc68feeace"
SRC_URI[dm7080.sha256sum] = "e92064129a6b7c16c011b43f15eb4c02e42d14ba84eb5cc81849cb88750b52be"

COMPATIBLE_MACHINE = "dm7080"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm7080.md5sum', True)}"
