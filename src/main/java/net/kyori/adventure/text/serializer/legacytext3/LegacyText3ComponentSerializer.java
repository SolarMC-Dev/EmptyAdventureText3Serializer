package net.kyori.adventure.text.serializer.legacytext3;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.serializer.ComponentSerializer;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.jetbrains.annotations.NotNull;

/**
 * Kyori Adventure to Kyori Text serializer
 *
 * @deprecated Do not use; exists only for compile time compatibility
 */
@Deprecated
public class LegacyText3ComponentSerializer implements ComponentSerializer<Component, Component, net.kyori.text.Component> {

  private static final LegacyText3ComponentSerializer INSTANCE = new LegacyText3ComponentSerializer();

  public static @NonNull LegacyText3ComponentSerializer get() {
    return INSTANCE;
  }

  @Override
  public @NonNull Component deserialize(net.kyori.text.@NonNull Component input) {
    throw uoe();
  }

  @NotNull
  @Override
  public net.kyori.text.Component serialize(@NonNull Component component) {
    throw uoe();
  }

  private static UnsupportedOperationException uoe() {
    return new UnsupportedOperationException(
            "A caller attempted to convert to or from Kyori Adventure and Kyori Text. " +
                    "Such caller should not be using Kyori Text to begin with, considering it is deprecated and unsupported.");
  }
}
