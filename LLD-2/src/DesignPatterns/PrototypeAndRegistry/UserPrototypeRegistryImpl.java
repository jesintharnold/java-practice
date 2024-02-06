package DesignPatterns.PrototypeAndRegistry;

import java.util.HashMap;

public class UserPrototypeRegistryImpl implements UserPrototypeRegistry{
    private HashMap<UserType,User> registry=new HashMap<UserType,User>();

    @Override
    public void addPrototype(User user) {
        registry.put(user.getType(),user);
    }

    @Override
    public User getPrototype(UserType type) {
        return registry.get(type);
    }

    @Override
    public User clone(UserType type) {
        return registry.get(type).cloneObject();
    }
}
