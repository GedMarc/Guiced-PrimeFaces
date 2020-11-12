import com.guicedee.guicedservlets.primefaces.GuicedPrimeFacesModuleInclusion;

module com.guicedee.guicedservlets.primefaces {
	requires transitive primefaces;
	requires transitive com.guicedee.guicedservlets.jsf;
    requires com.guicedee.guicedinjection;

    opens com.guicedee.guicedservlets.primefaces to com.google.guice;

	provides com.guicedee.guicedservlets.undertow.services.UndertowDeploymentConfigurator with com.guicedee.guicedservlets.primefaces.UndertowServletConfig;
	provides com.guicedee.guicedservlets.services.IGuiceSiteBinder with com.guicedee.guicedservlets.primefaces.GuicedPrimefacesServletModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with GuicedPrimeFacesModuleInclusion;
}
