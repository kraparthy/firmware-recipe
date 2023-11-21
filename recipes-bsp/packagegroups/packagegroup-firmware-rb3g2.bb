SUMMARY = "Firmware packages for the RB3Gen2 platform"

inherit packagegroup

RRECOMMENDS:${PN} += " \
    firmware-qcom-rb3g2-msl \
"
