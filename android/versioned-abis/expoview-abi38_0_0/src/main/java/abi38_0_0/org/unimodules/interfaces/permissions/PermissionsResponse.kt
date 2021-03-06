package abi38_0_0.org.unimodules.interfaces.permissions

data class PermissionsResponse(val status: PermissionsStatus,
                               val canAskAgain: Boolean = true) {
  companion object {
    const val FOREGROUND_STATUS_KEY = "status"
    const val STATUS_KEY = "status"
    const val FOREGROUND_GRANTED_KEY = "foregroundGranted"
    const val GRANTED_KEY = "granted"
    const val EXPIRES_KEY = "expires"
    const val CAN_ASK_AGAIN_KEY = "canAskAgain"
    const val PERMISSION_EXPIRES_NEVER = "never"
  }
}
