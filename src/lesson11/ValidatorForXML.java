package lesson11;

import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;
import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

public class ValidatorForXML {
    public static void main(String[] args) {
        boolean answer = validateXMLSchema("/home/taras/Programming/IdeaProjects/TeachMeSkills/src/Lesson13/Devices.xsd", "/home/taras/Programming/IdeaProjects/TeachMeSkills/src/Lesson13/Devices.xml");
        System.out.println("Result: " + answer);
    }

    public static boolean validateXMLSchema(String xsdPath, String xmlPath) {
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
        } catch (IOException | SAXException e) {
            System.out.println("Exception: " + e.getMessage());
            return false;
        }
        return true;
    }
}
