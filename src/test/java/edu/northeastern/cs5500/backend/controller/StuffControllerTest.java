/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.northeastern.cs5500.backend.controller;

import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assertWithMessage;

import edu.northeastern.cs5500.backend.model.Stuff;
import edu.northeastern.cs5500.backend.repository.InMemoryRepository;
import org.junit.jupiter.api.Test;

class StuffControllerTest {
    @Test
    void testRegisterCreatesStuff() {
        StuffController StuffController =
                new StuffController(new InMemoryRepository<Stuff>());
        assertThat(StuffController.getStuff()).isNotEmpty();
    }

    @Test
    void testRegisterCreatesValidStuff() {
        StuffController StuffController =
                new StuffController(new InMemoryRepository<Stuff>());

        for (Stuff Stuff : StuffController.getStuff()) {
            assertWithMessage(Stuff.getTitle()).that(Stuff.isValid()).isTrue();
        }
    }

    @Test
    void testCanAddStuff() {
        // This test should NOT call register
        // TODO: implement this test.
    }

    @Test
    void testCanReplaceStuff() {
        // This test should NOT call register
        // TODO: implement this test.
    }

    @Test
    void testCanDeleteStuff() {
        // This test should NOT call register
        // TODO: implement this test
    }
}