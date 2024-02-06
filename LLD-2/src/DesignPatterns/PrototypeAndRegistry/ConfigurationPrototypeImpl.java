package DesignPatterns.PrototypeAndRegistry;

import java.util.HashMap;

public class ConfigurationPrototypeImpl implements ConfigurationPrototypeRegistry{


    private HashMap<ConfigurationType,Configuration> registry=new HashMap<ConfigurationType,Configuration>();
    @Override
    public void addPrototype(Configuration user) {
        registry.put(user.getType(),user);
    }

    @Override
    public Configuration getPrototype(ConfigurationType type) {
        return registry.get(type);
    }

    @Override
    public Configuration clone(ConfigurationType type) {
        return registry.get(type).clone();
    }
}
