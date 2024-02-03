package DesignPatterns.Singleton;


public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {

    private  static FileBasedConfigurationManagerImpl manager;
    @Override
    public String getConfiguration(String key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getConfiguration'");
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getConfiguration'");
    }

    @Override
    public void setConfiguration(String key, String value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setConfiguration'");
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setConfiguration'");
    }

    @Override
    public void removeConfiguration(String key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeConfiguration'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
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