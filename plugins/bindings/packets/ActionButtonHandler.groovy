import com.rs.entity.player.Player
import com.rs.plugin.Plugin
import com.rs.plugin.PluginBridge

class ActionButtonHandler extends Plugin {

    void handle(Player player, int actionButtonId) {
        switch (actionButtonId) {
            case 9154:
                player.sendLogout()
                break
            case 153:
                player.getMovementHandler().setRunToggled true
                break
            case 152:
                player.getMovementHandler().setRunToggled false
                break
            default:
                println "Unhandled button: " + actionButtonId
                break

            /* Emotes */
            case 168: // Yes
                player.startAnimation 855
                break
            case 169: // No
                player.startAnimation 856
                break
            case 162: // Think
                player.startAnimation 857
                break
            case 164: // Bow
                player.startAnimation 858
                break
            case 165: // Angry
                player.startAnimation 859
                break
            case 161: // Cry
                player.startAnimation 860
                break
            case 170: // Laugh
                player.startAnimation 861
                break
            case 171: // Cheer
                player.startAnimation 862
                break
            case 163: // Wave
                player.startAnimation 863
                break
            case 167: // Beckon
                player.startAnimation 864
                break
            case 172: // Clap
                player.startAnimation 865
                break
            case 166: // Dance
                player.startAnimation 866
                break
            case 52050: // Panic
                player.startAnimation 2105
                break
            case 52051: // Jig
                player.startAnimation 2106
                break
            case 52052: // Spin
                player.startAnimation 2107
                break
            case 52053: // Head Bang
                player.startAnimation 2108
                break
            case 52054: // Joy Jump
                player.startAnimation 2109
                break
            case 52055: // Rasp'berry
                player.startAnimation 2110
                break
            case 52056: // Yawn
                player.startAnimation 2111
                break
            case 52057: // Salute
                player.startAnimation 2112
                break
            case 52058: // Shrug
                player.startAnimation 2113
                break
            case 43092: // Blow Kiss
                player.startAnimation 1368
                break
            case 2155: // Glass Box
                player.startAnimation 1131
                break
            case 2154: // Glass Wall
                player.startAnimation 1128
                break
            case 25103: // Climb Rope
                player.startAnimation 1130
                break
            case 25106: // Lean
                player.startAnimation 1129
                break
            case 52071: // Goblin Bow
                player.startAnimation 2127
                break
            case 52072: // Goblin Dance
                player.startAnimation 2128
                break
        }
    }

    @Override
    void tick() throws Exception {
    }

    @Override
    void onEnable(String pluginName) throws Exception {
        PluginBridge.registerBinding PluginBridge.ACTION_BUTTON_HANDLER_BINDING_KEY, pluginName
    }

    @Override
    void onDisable() throws Exception {
    }
}