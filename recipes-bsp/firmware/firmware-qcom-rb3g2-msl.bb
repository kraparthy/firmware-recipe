DESCRIPTION = "QCOM Firmware for Qualcomm Robotics RB3Gen2 platform"

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://Qualcomm-Technologies-Inc.-Proprietary;md5=58d50a3d36f27f1a1e6089308a49b403"

FW_D_NAME = "QCM6490_MSL"
S = "${WORKDIR}/${FW_D_NAME}"

SRC_URI ="https://artifacts.codelinaro.org/ui/native/clo-386-k2c-yocto/${FW_D_NAME}.zip"

SRC_URI[md5sum] = "e22ea22b7527f8967b4d059d70fb3b79"
SRC_URI[sha256sum] = "c87e115f986837d15b893bc1b42fb17048a9d3515c1717af6877d31b6cdd9a1d"

PE = "1"

FW_QCOM_NAME = "qcm6490"

require recipes-bsp/firmware/firmware-qcom.inc

do_install() {
    install -d ${D}${FW_QCOM_PATH}

    install -m 0644 ${WORKDIR}/${FW_D_NAME}/${FW_QCOM_PATH}/* ${D}${FW_QCOM_PATH}
}

