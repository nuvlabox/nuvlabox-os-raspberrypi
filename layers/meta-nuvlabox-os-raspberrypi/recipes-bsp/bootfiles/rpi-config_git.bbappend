# Enables certain RPi configurations that are not to be configurable

do_deploy_append() {
    # Enable audio (loads snd_bcm2835)
    echo "dtparam=audio=on" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
}


