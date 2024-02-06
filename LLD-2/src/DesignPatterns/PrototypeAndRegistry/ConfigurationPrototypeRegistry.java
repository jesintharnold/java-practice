package DesignPatterns.PrototypeAndRegistry;

public interface ConfigurationPrototypeRegistry {

    void addPrototype(Configuration user);

    Configuration getPrototype(ConfigurationType type);

    Configuration clone(ConfigurationType type);
}
