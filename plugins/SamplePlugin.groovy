import com.rs.plugin.Plugin

class SamplePlugin extends Plugin {

    @Override
    void cycle() throws Exception {
        // Code to execute on cycle
    }

    @Override
    void onEnable() throws Exception {
        // Code to execute when plugin is enabled
    }

    @Override
    void onDisable() throws Exception {
        // Code to execute when plugin is disabled
    }

    @Override
    String getName() {
        return "SamplePlugin";
    }
}