package com.cyrusinnovation

import com.cyrusinnovation.mockitogroovysupport.MockitoGroovy
import org.junit.Test
import org.mockito.Mockito

class SimpleTest {
    @Test
    void fixed() {
        def dependency = MockitoGroovy.gmock(MyGroovyDependency.class)
        def simple = new Simple(dependency: dependency)
        Mockito.when(dependency.say('message')).thenReturn('') //this line NPEs
        simple.hello()
    }

    @Test
    void hello() {
        def dependency = Mockito.mock(MyGroovyDependency.class)
        def simple = new Simple(dependency: dependency)
        Mockito.when(dependency.say('message')).thenReturn('') //this line NPEs
        simple.hello()
    }
}