DESCRIPTION="It's a simple hello world"
LICENSE="CLOSED"

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI = "file://helloworld.tar.gz"
S = "${WORKDIR}/helloworld"

do_compile() {
    ${CC} helloworld.c ${LDFLAGS} -o helloworld
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${B}/helloworld ${D}${bindir}/helloworld
}
