package com.agonkolgeci.neptune_api.common.config.callback.type;

import com.agonkolgeci.neptune_api.common.config.ConfigSection;
import org.jetbrains.annotations.NotNull;

public interface ConfigurationTypeObjectCallback<T, O> {


    @NotNull O retrieveObject(@NotNull T type, @NotNull ConfigSection configuration);

}