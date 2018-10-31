TARGETS = udev keyboard-setup.sh hwclock.sh lvm2 etc-setserial setserial x11-common alsa-utils kmod plymouth-log procps networking
INTERACTIVE = udev keyboard-setup.sh
lvm2: udev
procps: udev
networking: procps
