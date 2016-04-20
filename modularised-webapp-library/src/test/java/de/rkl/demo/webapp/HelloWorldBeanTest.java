package de.rkl.demo.webapp;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.jglue.cdiunit.AdditionalClasses;
import org.jglue.cdiunit.CdiRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

@RunWith(CdiRunner.class)
@AdditionalClasses(HelloWorldBean.class)
public class HelloWorldBeanTest {
    @Inject @Greeting
    private String injectedGreeting;

    @Test
    public void shouldInjectHelloWorld() {
        assertThat(injectedGreeting, is("Hello World!"));
    }
}