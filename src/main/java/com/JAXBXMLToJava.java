package com;
import java.io.File;
import java.io.StringReader;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


/**
 * Created by bvue0 on 10/11/2016.
 */
public class JAXBXMLToJava {

    public static void main(String[] args) {

        try {

            // create JAXB context and initializing Marshaller
            JAXBContext jaxbContext = JAXBContext.newInstance(DwmlType.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            // specify the file to be read
            String response = "<?xml version='1.0'?>\n" +
                    "<dwml version='1.0' xmlns:xsd='http://www.w3.org/2001/XMLSchema' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xsi:noNamespaceSchemaLocation='http://graphical.weather.gov/xml/DWMLgen/schema/DWML.xsd'>\n" +
                    "    <latLonList>43.0798,-89.3875</latLonList>\n" +
                    "</dwml>";

            DwmlType dwml = (DwmlType) jaxbUnmarshaller.unmarshal(new StringReader(response));

            // this will create Java object - country from the XML file
            //Country countryIndia = (Country) jaxbUnmarshaller.unmarshal(XMLfile);

            System.out.println("LatLonList: " + dwml.getLatLonList());
            System.out.println("Version: " + dwml.getVersion());


        } catch (JAXBException e) {
            // some exception occured
            e.printStackTrace();
        }

    }





}

