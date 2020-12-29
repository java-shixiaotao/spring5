package com.mouds.factoryBean;

import com.mouds.beanList.Coures;
import org.springframework.beans.factory.FactoryBean;

public class FactoryBeanDemo implements FactoryBean<Coures> {
    public Coures getObject() throws Exception {
        Coures coures = new Coures();
        coures.setName("test FactoryBean....");
        return coures;
    }

    public Class<?> getObjectType() {
        return null;
    }
}
