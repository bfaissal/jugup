/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.moroccojug.jugup.registration.boundary;

import javax.persistence.EntityManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.moroccojug.jugup.registration.entity.User;

/**
 *
 * @author faissalboutaounte
 */
public class RegistrationManagerTest {
    
    public RegistrationManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of init method, of class RegistrationManager.
     */
    @org.junit.Test
    public void testInit() {
        System.out.println("init");
        RegistrationManager instance = new RegistrationManager();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        assertNotNull(instance.user);
    }

    /**
     * Test of save method, of class RegistrationManager.
     */
    @org.junit.Test
    public void testSaveSuccess() {
        System.out.println("save");
        RegistrationManager instance = new RegistrationManager();
        User user = new User(1L,"f","l","12345678","m");
        instance.user = new User();
        instance.em = mock(EntityManager.class);
        when(instance.em.merge(any())).thenReturn(instance.user);
                
        instance.save();
        assertNotNull(instance.user.getId());
        assertEquals(instance.user.getFirstName(),"f");
        assertEquals(instance.user.getLastName(),"l");
        assertEquals(instance.user.getPassword(),"12345678");
        assertEquals(instance.user.getEmail(),"m");
    }
    
}
