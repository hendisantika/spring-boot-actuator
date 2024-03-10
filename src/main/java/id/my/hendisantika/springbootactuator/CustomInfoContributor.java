package id.my.hendisantika.springbootactuator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-actuator
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/10/24
 * Time: 18:04
 * To change this template use File | Settings | File Templates.
 */
@Component
public class CustomInfoContributor implements InfoContributor {

    @Autowired
    private Environment environment;

    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("port", environment.getProperty("local.server.port"));
        builder.withDetail("profiles", environment.getDefaultProfiles());
    }
}
