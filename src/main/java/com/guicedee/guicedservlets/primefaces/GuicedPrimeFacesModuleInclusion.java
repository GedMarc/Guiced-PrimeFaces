package com.guicedee.guicedservlets.primefaces;

import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class GuicedPrimeFacesModuleInclusion implements com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions<GuicedPrimeFacesModuleInclusion> {
    @Override
    public @NotNull Set<String> includeModules() {
        Set<String> moduleScanningAllowed = new HashSet<>();
        moduleScanningAllowed.add("com.guicedee.guicedservlets.primefaces");
        moduleScanningAllowed.add("primefaces");
        return moduleScanningAllowed;
    }

}
