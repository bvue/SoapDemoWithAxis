package com;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bvue0 on 10/11/2016.
 */
public class NdfdXMLBindingStubTest {
    @Test
    public void latLonListZipCode() throws Exception {
        NdfdXMLBindingStub binding = (NdfdXMLBindingStub)
                new NdfdXMLLocator().getndfdXMLPort();
        String result = binding.latLonListZipCode("53711");
        //this will fail, but will show us the answer
        assertEquals("Results did not match", "???", result);
    }

}