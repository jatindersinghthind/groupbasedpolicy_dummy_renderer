package org.opendaylight.controller.config.yang.config.apic_provider.impl;

import org.opendaylight.groupbasedpolicy.renderer.apic.ApicRenderer;

public class ApicProviderModule extends org.opendaylight.controller.config.yang.config.apic_provider.impl.AbstractApicProviderModule {
    public ApicProviderModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        super(identifier, dependencyResolver);
    }

    public ApicProviderModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.opendaylight.controller.config.yang.config.apic_provider.impl.ApicProviderModule oldModule, java.lang.AutoCloseable oldInstance) {
        super(identifier, dependencyResolver, oldModule, oldInstance);
    }

    @Override
    public void customValidation() {
        // add custom validation form module attributes here.
    }

    @Override
    public java.lang.AutoCloseable createInstance() {
        return new ApicRenderer(getDataBrokerDependency(),
                                     getRpcRegistryDependency());
    }

}
