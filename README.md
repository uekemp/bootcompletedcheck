# Boot Completed Check
Android test app, to check BOOT_COMPLETED intent. Install the app and reboot your device. When the app receives the BOOT_COMPLETED broadcast, you should see a log message with this text:

`++++++++++++++ Received intent action=android.intent.action.BOOT_COMPLETED ++++++++++++++`

Or take a look at the app's activity, where you'll see the timestamp of the last BOOT_COMPLETED broadcast.