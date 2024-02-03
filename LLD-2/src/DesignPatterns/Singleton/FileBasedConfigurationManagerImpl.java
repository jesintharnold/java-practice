package DesignPatterns.Singleton;


public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {

    private  static FileBasedConfigurationManager manager;
    @Override
    public String getConfiguration(String key) {
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'getConfiguration'");
        return properties.getProperty(key);
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getConfiguration'");
        String keys=properties.getProperty(key);
        if(keys!=null){
            return manager.convert(keys,type);
        }else{
            return null;
        }
    }

    @Override
    public void setConfiguration(String key, String value) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'setConfiguration'");
        properties.setProperty(key,value);
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'setConfiguration'");
        properties.setProperty(key,value.toString());
    }

    @Override
    public void removeConfiguration(String key) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'removeConfiguration'");
        properties.remove(key);
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'clear'");
        properties.clear();
    }

    public static FileBasedConfigurationManager getInstance() {
        if(manager==null){
            manager=new FileBasedConfigurationManagerImpl();
        };
        return manager;
    }

    public static void resetInstance() {
        manager=null;
    }

}