# Enables certain RPi configurations that are not to be configurable

do_deploy_append() {
    # Enable audio (loads snd_bcm2835)
    echo "dtparam=audio=on" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
}


### FROM RESIN.IO:
# https://github.com/balena-os/balena-raspberrypi/tree/master/layers/meta-balena-raspberrypi/recipes-bsp/bootfiles
do_deploy_append_revpi-core-3() {
    cat >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt << EOF

# serial port needs to be kept clean for RS485 communication
avoid_warnings=1

# Enable RevPi specific pins for i2c
dtoverlay=i2c1-bcm2708,sda1_pin=44,scl1_pin=45,pin_func=6

# Enable RevPi realtime clock
dtoverlay=i2c-rtc,pcf2127

# Enable RevPi specific pins for spi
dtparam=spi=on
dtoverlay=kunbus

EOF
    # prevent u-boot logging on uart
    sed -i 's/enable_uart=1//' ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
}
###

