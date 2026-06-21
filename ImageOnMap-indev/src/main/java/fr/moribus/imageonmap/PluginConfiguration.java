package fr.moribus.imageonmap;

import java.util.Collections;
import java.util.List;
import java.util.Locale;

public final class PluginConfiguration {
    public static final Setting<Locale> LANG = new Setting<>(Locale.US);

    public static final Setting<Boolean> COLLECT_DATA = new Setting<>(true);
    public static final Setting<Boolean> CHECK_FOR_UPDATES = new Setting<>(true);

    public static final Setting<Integer> MAP_GLOBAL_LIMIT = new Setting<>(0);
    public static final Setting<Integer> MAP_PLAYER_LIMIT = new Setting<>(0);

    public static final Setting<Boolean> SAVE_FULL_IMAGE = new Setting<>(false);

    public static final Setting<Integer> LIMIT_SIZE_X = new Setting<>(0);
    public static final Setting<Integer> LIMIT_SIZE_Y = new Setting<>(0);

    public static final Setting<List<String>> IMAGES_HOSTNAMES_WHITELIST =
            new Setting<>(Collections.emptyList());

    private PluginConfiguration() {
    }

    public static final class Setting<T> {
        private final T value;

        private Setting(T value) {
            this.value = value;
        }

        public T get() {
            return value;
        }
    }
}