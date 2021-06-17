package www.dv16888.aes;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.encrypt")
public class EncryptProperties {
    private static final String DEFAULT_KEY = "www.chat.dv16888.com";
    private String key = DEFAULT_KEY;

    public String getKey(){
        return key;
    }

    public void setKey(String key){
        this.key = key;
    }
}
