package org.pyarts.didemo.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean,
        DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("## I'm LifeCycleBean Constructor");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## The LifeCycle bean has been terminated!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The LifeCycleBean has Its property set!");
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean Factory has been set!");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("## My bean Name is " + name);
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Application context has been set!");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("## The post constructor method has been called!");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("## The pre constructor method has been called!");
    }

    public void beforeInit(){
        System.out.println("## Before Init - Called by bean Post Processor!");
    }

    public void afterInit(){
        System.out.println("## After init called by Post Processor!");
    }
}
