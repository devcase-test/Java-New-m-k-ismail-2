package org.sytac.test.internal;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.ServiceLoader;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ApplicationTest {

    @Test
    void hasExactlyOneSpeedingImplementation() {
        Iterator<Speeding> factories = ServiceLoader.load(Speeding.class).iterator();
        assertTrue(factories.hasNext(), "No Assignment implementation is service-loaded");
        factories.next();
        assertFalse(factories.hasNext(), "More than one Assignment implementation is service-loaded");
    }

    @Test
    void hasExactlyOneBoxesImplementation() {
        Iterator<Boxes> factories = ServiceLoader.load(Boxes.class).iterator();
        assertTrue(factories.hasNext(), "No Assignment implementation is service-loaded");
        factories.next();
        assertFalse(factories.hasNext(), "More than one Assignment implementation is service-loaded");
    }

    @Test
    void hasExactlyOneTennisImplementation() {
        Iterator<Tennis> factories = ServiceLoader.load(Tennis.class).iterator();
        assertTrue(factories.hasNext(), "No Assignment implementation is service-loaded");
        factories.next();
        assertFalse(factories.hasNext(), "More than one Assignment implementation is service-loaded");
    }
}