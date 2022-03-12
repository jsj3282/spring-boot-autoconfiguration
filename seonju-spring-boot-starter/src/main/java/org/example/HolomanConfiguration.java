package org.example;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HolomanProperties.class)
public class HolomanConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public Holoman holoman(HolomanProperties properties) {
        Holoman holoman = new Holoman();
//        holoman.setHowLong(5);
//        holoman.setName("SeonJu");
        holoman.setName(properties.getName());
        holoman.setHowLong(properties.getHowLong());

        System.out.println(holoman.getName());
        System.out.println(holoman.getHowLong());
        return holoman;
    }
}
